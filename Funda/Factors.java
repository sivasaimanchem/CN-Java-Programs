import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int a  =s.nextInt();
        int count=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                count++;
                System.out.print(i+" ");
            }
        }
        if(count==0){
            System.out.println(-1);
        }
        
        
    }
}
