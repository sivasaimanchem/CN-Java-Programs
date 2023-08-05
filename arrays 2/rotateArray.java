import java.util.*;
public class rotateArray {
    static void rotate(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array values:");
        for (int i=0; i<n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("enter the rotation value:");
        int r=s.nextInt();
        r%=arr.length;
        rotate(arr,0,arr.length-1);
        rotate(arr,0,arr.length-r-1);
        rotate(arr,arr.length-r,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
