import java.util.Scanner;

public class CharCase {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char ch;
        ch=s.next().charAt(0);
        if(ch>='a'&& ch<='z')
        {
            System.out.println(0);
        }
        else if (ch>='A'&& ch<='Z')
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(-1);
        }

    }
}
