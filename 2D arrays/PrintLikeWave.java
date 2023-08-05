import java.util.*;
public class PrintLikeWave {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,j,n=s.nextInt();
        int[][] arr=new int[n][n];
        for (i=0; i<n; i++){
            for (j=0; j<n; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        for(i=0;i<n;i++){
            if(i%2==0){
                for(j=n-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
                }
            }else{
                for(j=0;j<n;j++){
                    System.out.print(arr[j][i]+" ");
                }
            }
        }

    }
}
