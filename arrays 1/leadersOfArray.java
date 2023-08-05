import java.util.*;
public class leadersOfArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int lead=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>lead){
                System.out.print(arr[i]+" ");
                lead=arr[i];
            }
        }
    }
}
