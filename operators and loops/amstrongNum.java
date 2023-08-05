import java.util.Scanner;

public class amstrongNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int temp=num,count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        temp=num;
        int sum=0;
        for(int i=0;i<count;i++){
            int rem=temp%10;
            sum+= Math.pow(rem, count);
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
