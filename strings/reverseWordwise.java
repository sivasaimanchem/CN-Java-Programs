import java.util.*;
public class reverseWordwise {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int n=st.length();
        int j=n,i=n-1;
        String ans="";
        while(i>=0){
            if(st.charAt(i)==' '){
                ans=ans+st.substring(i+1,j)+" ";
                j=i;
            }
            i--;
        }
        ans+=st.substring(i+1,j);
        System.out.println(ans);
    }
}
