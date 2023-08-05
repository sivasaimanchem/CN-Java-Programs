import java.util.*;
public class linerSearch {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int find=s.nextInt();
        for(int i=0;i<n;i++){
            if(find==arr[i]){
                System.out.println("found at index: " + i);
                return;
            }
        }
        System.out.println("element does not exist");
    }
    
}
