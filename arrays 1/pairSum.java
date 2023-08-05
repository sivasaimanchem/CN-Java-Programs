import java.util.Scanner;

public class pairSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array 1 values:");
        for (int i=0; i<n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("eneter a value ");
        int ans=0, p=s.nextInt();
       for(int i=0; i<n; i++) {
           for(int j=i;j<n; j++) {
               if(i==j){
                   continue;
               }
               if(arr[i]+arr[j]==p){
                   ans++;
               }
           }
       }
        System.out.println(ans);
    }
}
