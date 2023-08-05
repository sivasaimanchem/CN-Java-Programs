import java.util.*;
public class allSubstrings {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        for (int i=0; i<st.length(); i++){
            for (int j=i;j<st.length();j++){
                System.out.println(st.substring(i,j+1));
            }
        }
    }
}
