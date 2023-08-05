import java.util.Scanner;

public class tripletSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array 1 values:");
        for (int i=0; i<n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("eneter a value ");
        int p=s.nextInt();
        int ans=0;
        for(int i=0; i<n; i++) {
            for(int j=i;j<n; j++) {
                for(int k=j;k<n; k++) {
                     if(i==j || i==k || j==k){
                         continue;
                     }
                     if(arr[i]+arr[j]+arr[k]==p){
                         ans++;
                     }
                }
            }
        }
        System.out.println(ans);
    }
}
