import java.util.*;
public class uniqueElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        int temp;
        for (int i=0; i<n; i++) {
            arr[i]=s.nextInt();
        }
        int count=0;
        for (int i=0;i<n;i++) {
            for (int j=i; j<n; j++) {
                if (arr[j]==arr[i]){
                    count++;
                }
            }
            if (count==1) {
                System.out.print(arr[i]);
                return;
            }
            count = 0;
        }
    }
}
