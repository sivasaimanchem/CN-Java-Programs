import java.util.*;
public class reverseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp=num,rev=0;
        while(temp>0) {
            rev=rev*10+(temp%10);
            temp=temp/10;
        }
        System.out.println("reverse of "+num+" is:"+rev);
    }
}
