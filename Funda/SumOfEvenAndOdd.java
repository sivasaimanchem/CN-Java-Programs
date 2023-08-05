import java.util.*;
public class SumOfEvenAndOdd{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int q=s.nextInt();
        int E=0,O=0;
        while(q>0){
            int rem=q%10;
            if(rem%2==0){
                E+=rem;
            }
            else if(q%2!=0){
                O+=rem;
            }
            q=q/10;
        }
        System.out.println(E+" "+O);
    }
}