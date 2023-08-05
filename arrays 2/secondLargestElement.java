import java.util.Scanner;

public class secondLargestElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array values:");
        for (int i=0; i<n; i++) {
            arr[i]=s.nextInt();
        }
        int first=0,second=0;
        for (int i=0; i<n; i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            if(arr[i]>second && arr[i]<first){
                second=arr[i];  
            }
        }
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n"+second);
    }
}
