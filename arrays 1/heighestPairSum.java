import java.util.Scanner;

public class heighestPairSum {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enetr array 1 values:");
        for (int i=0; i<n; i++) {
            arr[i]=s.nextInt();
        }
        int ans=0;
        for(int i=0; i<n; i++) {
            for(int j=0;j<n; j++) {
                if(i==j){
                    continue;
                }
                if(arr[i]+arr[j]>ans){
                    ans=arr[i]+arr[j];
                    //System.out.print(ans+" ");
                }
            }
        }
        System.out.println(ans);
    }
}
