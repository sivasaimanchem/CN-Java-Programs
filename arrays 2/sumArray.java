import java.util.Scanner;

public class sumArray{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array 1 values:");
        int val1=0,val2=0;
        for (int i=0; i<n; i++) {
            arr[i]=s.nextInt();
            val1=(val1*10)+arr[i];
        }
        int[] arr2=new int[n];
        System.out.println("enter array 2 values:");
        for (int i=0; i<n; i++) {
            arr2[i]=s.nextInt();
            val2=(val2*10)+arr2[i];
        }
        System.out.println(val1+" + "+val2+" = "+(val2+val1));
    }
}