import java.util.*;
public class arrangeNumInArr {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        int start=0,end=n-1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                arr[end]=i;
                end--;
            }
            else{
                arr[start]=i;
                start++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
