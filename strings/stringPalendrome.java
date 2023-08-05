import java.util.*;
public class stringPalendrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int n=st.length()-1;
        for (int i=0; i<n/2; i++) {
            if(st.charAt(i)!=st.charAt(n-i)){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
