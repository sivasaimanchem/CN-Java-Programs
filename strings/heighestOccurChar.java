import java.util.Scanner;

public class heighestOccurChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int arr[]=new int[256];
        int max=0,idx=-1;
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
        for(int i=0;i<st.length();i++){
            arr[st.charAt(i)]++;
            max=Math.max(max,arr[st.charAt(i)]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[st.charAt(i)]==max){
                System.out.println(st.charAt(i));
                return;
            }
        }
    }
}
