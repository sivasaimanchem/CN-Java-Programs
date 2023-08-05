import java.util.*;
public class sumOrProduct {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=s.nextInt();
        int i, sum=0,pro=1;
        if(c==1)
        {
            for(i=1;i<=n;i++)
            {
                sum=sum+i;
            }
            System.out.println(sum);
        }
        else if(c==2)
        {
            for(i=1;i<=n;i++)
            {
                pro=pro*i;
            }
            System.out.println(pro);
            
        }
        else
        {
            sum=-1;
            System.out.println(sum);
        }
        
        
	}
}
