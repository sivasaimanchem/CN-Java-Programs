import java.util.*;
public class numSequence {

    static boolean isSequence(int num){
        Scanner s = new Scanner(System.in);
        int prev,pres;
        prev = s.nextInt();
        boolean isInc=false,isDec=false;
        for (int i = 1; i<num; i++) {
            pres = s.nextInt();
            if(prev == pres){
                return false;
            }
            else if(pres>prev){
                isInc=true;
            }
            else if(pres<prev){
                if(isInc==true){
                    return false;
                }
                isDec=true;
            }
            prev = pres;

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isSequence(num));
    }
}
