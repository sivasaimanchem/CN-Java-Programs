import java.util.Scanner;

public class minLengthWord {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         String st=s.nextLine();
         int i,wordstart=-1,wordlength=Integer.MAX_VALUE;
         int currstart=0,currwordlength=Integer.MAX_VALUE;
         for (i=0; i<st.length();i++){
            if(st.charAt(i)==' '){
                currwordlength=i-currstart;
                if(currwordlength<wordlength){
                    wordstart=currstart;
                    wordlength=currwordlength;
                }
                currstart=i+1;
            }
         }
        currwordlength=i-currstart;
        if(currwordlength<wordlength){
            wordstart=currstart;
            wordlength=currwordlength;
        }
         System.out.println(st.substring(wordstart, wordstart+wordlength));
    }
}
