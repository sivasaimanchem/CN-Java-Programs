import java.util.*;
public class LargestRowOrColumn {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,j,r=s.nextInt(), c=s.nextInt();
        int[][] arr=new int[r][c];
        for (i=0; i<r; i++){
            for (j=0; j<c; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        int ans=0,rsum=0,csum=0,sum=0,num=0;
        for (i=0; i<r; i++){
            for (j=0; j<c; j++) {
                sum+=arr[i][j];
            }
            if(sum>rsum){
                rsum=sum;
                num=i;
            }
            sum=0;
        } 
        for (i=0; i<c; i++){
            for (j=0; j<r; j++) {
                sum+=arr[j][i];
            }
            if(sum>csum){
                csum=sum;
                num=i;
                System.out.println(i);
            }
            sum=0;
        }
        if(csum>rsum){
            System.out.println("coulmn:"+num+" "+csum);
        }else{
            System.out.println("row:"+num+" "+rsum);
        }
    }
}
