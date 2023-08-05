import java.util.*;
public class PrintSpiral {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,j,n=s.nextInt();
        int[][] arr=new int[n][n];
        for (i=0; i<n; i++){
            for (j=0; j<n; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        int rs=0,re=n-1,cs=0,ce=n-1;
        while (rs<re || cs<ce){
            for ( i=cs;i<=ce;i++){
                System.out.print(arr[rs][i]+" ");
            }
            rs++;
            for ( i=rs;i<=re;i++){
                System.out.print(arr[i][ce]+" ");
            }
            ce--;
            for ( i=ce;i>=cs;i--){
                System.out.print(arr[re][i]+" ");
            }
            re--;
            for ( i=re;i>=rs;i--){
                System.out.print(arr[i][cs]+" ");
            }
            cs++;
            

        }
    }
}
