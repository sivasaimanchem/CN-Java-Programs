import java.util.*;
public class insertionOfArrays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enetr array 1 values:");
        for (int i=0; i<n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("enetr array 2 values:");
        int[] arr2=new int[n];
        for (int i=0; i<n; i++) {
            arr2[i]=s.nextInt();
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (arr[i]==arr2[j]) {
                    System.out.print(arr[i]+" ");
                    arr2[i] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        
    }
}
