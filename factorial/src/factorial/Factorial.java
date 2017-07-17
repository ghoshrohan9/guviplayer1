package factorial;
/**
 * @author Rohan Ghosh
 */
import java.util.*;
public class Factorial {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a=1;
        while(n>0){
            a*=n;
            n--;
        }
        System.out.print(a); 
    }
}
