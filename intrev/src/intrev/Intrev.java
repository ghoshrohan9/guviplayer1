package intrev;
/**
 *
 * @author Rohan Ghosh
 */
import java.util.*;
public class Intrev {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        for(int i=a; i>0; i=i/10){
            b=(b*10)+(i%10);
        }
        System.out.print(b);
    }
    
}
