import java.util.Scanner;
public class reverseEachWord {

    static String reverse(String word, int start, int end) {
        String sub="";
         while(start<end){
            sub=word.charAt(start)+sub;
            start++;
        }
        return sub;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int i,start=-1;
        String ans="";
        for (i=0; i<st.length(); i++) {
            if(st.charAt(i)==' '){
               ans=ans+reverse(st, start+1,i)+" ";// analyse start+1 indepth
               start=i;
            }
        }
        ans=ans+reverse(st, start+1,i);
        System.out.println(ans);
    }
}
