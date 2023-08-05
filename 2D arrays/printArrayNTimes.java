import java.util.*;
public class printArrayNTimes {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,j,n=s.nextInt();
        int[][] arr=new int[n][n];
        for (i=0; i<n; i++){
            for (j=0; j<n; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        int key=n;
        for (i=0; i<n; i++){
            for (j=0; j<key; j++) {
                for(int k=0;k<n;k++){
                    System.out.print(arr[i][k]+" ");
                }
                System.out.println();
            }
            key--;
            
        }
    }
}
