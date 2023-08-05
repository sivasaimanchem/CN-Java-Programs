import java.util.*;
public class starPattern {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=1;
        int flag=0;
        int i,j,k;
        while(a<=n){
            for (i=1; i<=n-a; i++){
                System.out.print(" ");
            }
            for (j=1;j<a+1;j++) {
                System.out.print(flag+j);
            }
            for(k=1;k<a;k++) {
                System.out.print((flag+j)-k-1);
            }
            // for (k=1;k<a+1;k++) {
            //     System.out.print(flag+k);
            // }
            System.out.println();
            a++;
            flag++;
        }
    }
}
