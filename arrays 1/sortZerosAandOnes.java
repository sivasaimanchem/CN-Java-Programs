import java.util.Scanner;

public class sortZerosAandOnes {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array 1 values:");
        for (int i=0; i<n; i++) {
            arr[i]=s.nextInt();
        }
        int left = 0,right = arr.length-1;
        while (left < right) {
            while(arr[left]==0 && left < right) {
                left++;
            }
            while(arr[right]==1 && left < right) {
                right--;
            }
            if(left<right){
                arr[left]=0;
                arr[right]=1;
                right--;
                left++;
            }
        }
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
