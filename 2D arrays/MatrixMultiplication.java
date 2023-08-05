import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,j,r=s.nextInt(), c=s.nextInt();
        int[][] arr1=new int[r][c];
        for (i=0; i<r; i++){
            for (j=0; j<c; j++) {
                arr1[i][j]=s.nextInt();
            }
        }
        int[][] arr2=new int[r][c];
        for (i=0; i<r; i++){
            for (j=0; j<c; j++) {
                arr2[i][j]=s.nextInt();
            }
        }
        int[][] ans = new int[r][r];
        for(i=0; i<r; i++){
            for (j=0; j<c; j++) {
                int sum=0;
                for(int k=0; k<c; k++){
                    sum+=arr1[i][k]*arr2[k][j];
                }
                ans[i][j]=sum;
                sum=0;
            }
        }
        for(i=0; i<r;i++){
            for(j=0; j<c; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }


    }
}
