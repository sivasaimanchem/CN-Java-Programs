import java.util.Scanner;

public class deleteChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String ans="";
        System.out.println("enter the char to be removed:");
        char c=s.next().charAt(0);
        for (int i=0;i<st.length();i++){
            if(st.charAt(i)!=c){
                ans=ans+st.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
