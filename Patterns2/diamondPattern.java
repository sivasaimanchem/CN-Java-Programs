import java.util.*;
public class diamondPattern {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j,k,l,m,o,p;
        for(i=1; i<=(n/2)+1; i++){
            int a=(n/2)+1;
            for( j=1; j<=a-i; j++){
                System.out.print(" ");
            }
            for( k=j; k<=a; k++){
                System.out.print("*");
            }
            for( l=2; l<=i; l++){
                System.out.print("*"); 
            }
            System.out.println();

        }

        for(i=1; i<=(n/2); i++){
            int a=(n/2)+1;
            
            for(m=1; m<=i; m++){
                System.out.print(" ");
            }
            for( o=m; o<=a; o++){
                System.out.print("*");
            }
            for(p=1; p<a-i; p++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
