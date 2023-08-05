import java.util.*;
public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String ans=""+st.charAt(0);
        System.out.println(st);
        for (int i=1; i<st.length(); i++) {
           if(st.charAt(i)!=ans.charAt(ans.length()-1)){
                ans+=st.charAt(i);
           }
        }
        System.out.println(ans);
    }
}
