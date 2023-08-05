import java.util.*;
public class TotalSumOnTheBoundariesAndDiagonals {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,j,n=s.nextInt();
        int[][] arr1=new int[n][n];
        int sum=0;
        for (i=0; i<n; i++){
            for (j=0; j<n; j++) {
                arr1[i][j]=s.nextInt();
            }
        }
        for(i=0; i<n; i++){
            sum+=arr1[0][i];
            sum+=arr1[n-1][i];
        }
        for(i=1; i<n-1; i++){
            sum+=arr1[i][0];
            sum+=arr1[i][n-1];
        }
        for(i=1; i<n-1; i++){
            sum+=arr1[i][i];
            sum+=arr1[i][n-1-i];
        }
        if(n%2!=0){
            sum-=arr1[n/2][n/2];
        }
        System.out.println(sum);
    }
}
