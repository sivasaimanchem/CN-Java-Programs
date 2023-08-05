import java.util.*;
public class CharPattern2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i = 0; i <=n;i++){
            for(int j = 0; j<i;j++){
                char ch=(char)('A'+n-i+j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
}
