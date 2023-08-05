import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int a=0,b=0,ans=0;
        a=s.nextInt();
        b=s.nextInt();
        int sum=1;
        for(int i=0;i<b;i++){
            sum*=a;
        }
        System.out.println(sum);
    }
}
