import java.util.*;
public class mirrorImg {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=1,i,j;

        while(a<=n){
            for ( i=1; i<=n-a; i++){
                System.out.print(" ");
            }
            for ( j=1;j<=a;j++) {
                System.out.print(j);
            }
            System.out.println();
            a++;
        }
    }
}
