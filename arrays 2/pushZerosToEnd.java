import java.util.*;
public class pushZerosToEnd{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array values:");
        for (int i=0; i<n; i++) {
            arr[i]=s.nextInt();
        }
        int front=0,back=0;
        while(front<n){
            if(arr[front]!=0 && arr[back]!=0){
                front++; 
                back++;
            }
            else if(arr[front]==0 && arr[back]==0){
                front++;
            }
            else if(arr[front]!=0){
                int temp=arr[front];
                arr[front]=arr[back];
                arr[back]=temp;
                back++;
                front++;
            }
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}