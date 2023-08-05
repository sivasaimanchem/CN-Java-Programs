import java.util.*;
public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int ans=0;
        for(int i=0;n>0;i++) {
            int rem=n%10;
            if(rem!=0) {
                ans=ans+(int)Math.pow(2, i);
            }
            n=n/10;
        }
        System.out.println(ans);
    }
}
