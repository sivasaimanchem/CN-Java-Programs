import java.util.*;
public class isPrime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int i=2; i<Math.sqrt(num); i++) {
            if(num%i==0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}