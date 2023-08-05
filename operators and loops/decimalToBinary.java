import java.util.*;
public class decimalToBinary{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int ans = 0, pv = 1;
        while (value > 0) {
            ans = ((value % 2)*pv)+ans;
            value = value / 2;
            pv*=10;
        }
        System.out.println(ans);
    }
}

