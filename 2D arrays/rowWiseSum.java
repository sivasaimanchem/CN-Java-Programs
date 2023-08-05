import java.util.*;
public class rowWiseSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt(), c=s.nextInt();
        int[][] arr=new int[r][c];
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        int ans=0;
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++) {
                ans+=arr[i][j];
            }
            System.out.print(ans+" ");
            ans=0;
        } 
        

    }
}
