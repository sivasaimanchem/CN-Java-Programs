import java.util.*;
public class isFibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int  a=0,b=1,c=0;
        while (num>=a){
            if(num==a){
                System.out.println("true");
                return;
            }
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println("false");
    }
}
