import java.util.*;
public class primeInRange{

    static void prime(int n){
        int sqrt = (int) Math.sqrt(n);
        for(int i=2;i<=sqrt;i++){
            if(n%i==0){
                return;
            }
        }
        System.out.println(n+" ");
    }
    static void check(int n){
        if(n==0 || n==1) return;
        for(int i=2;i<=n;i++){
            prime(i);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        check(num);
    }
}
