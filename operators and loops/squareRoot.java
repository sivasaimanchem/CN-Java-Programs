import java.util.*;
public class squareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int flag=1;
        while(flag*flag<n){
            flag++;
        }
        if(flag*flag==n){
            System.out.println(flag);
        }
        else{
            System.out.println(flag-1);
        }
    }
}
