import java.util.Scanner;

public class sortZerosOnesTwos {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array values:");
        for (int i=0; i<n; i++) {
            arr[i]=s.nextInt();
        }
        int low=0,high=arr.length-1,i=0,temp;
        while(i<high){
            if(arr[i]==0){
                temp=arr[i];
                arr[i]=arr[low];
                arr[low]=temp;
                i++;
                low++;
            }
            else if(arr[i]==1){
                i++;
            }
            else if(arr[i]==2){
                temp=arr[i];
                arr[i]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
