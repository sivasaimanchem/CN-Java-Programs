import java.util.Scanner;

public class checkRotate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array values:");
        for (int i=0; i<n; i++) {
            arr[i]=s.nextInt();
        }
        for(int i=0; i<n; i++) {
            if(arr[i]>arr[i+1]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("0");
    }
}
