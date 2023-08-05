import java.util.*;
public class countWords {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int flag=0,count=0;
        for (int i=0; i<st.length(); i++) {
            if(st.charAt(i)==' ' || st.charAt(i)=='\n' || st.charAt(i) == '\t'){
                flag=0;
            }
            else if(flag==0){
                flag=1;
                count++;
            }
        }
        System.out.println(count);
    }
}
