import java.util.Scanner;

public class stringCompression {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String ans="";
        int count=1;
        for (int i=1;i<st.length();i++){
            if(st.charAt(i)==st.charAt(i-1)){
                count++;
            }
            else{
                ans+=st.charAt(i-1);
                if(count>1){
                    ans+=count;
                }
                count=1;
            }
        }
        ans+=st.charAt(st.length()-1);
        if(count>1){
           ans+=count;
        }
        System.out.println(ans);
    }
}
