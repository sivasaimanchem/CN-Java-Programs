import java.util.*;
public class revNumPattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i = 1; i <=n;i++){
            for(int j = i; j >=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
