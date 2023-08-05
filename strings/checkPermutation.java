import java.util.Scanner;
public class checkPermutation {
  public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String st2=s.nextLine();
        int arr[]=new int[256];
        if(st.length()!=st2.length()){
            System.out.println("false");
            return;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
        for(int i=0;i<st.length();i++){
            char c=st.charAt(i);
            arr[c]++;
        }
        for(int i=0;i<st2.length();i++){
            char c=st2.charAt(i);
            arr[c]--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");

  }  
}
