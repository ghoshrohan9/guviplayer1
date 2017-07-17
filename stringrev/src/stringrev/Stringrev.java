package stringrev;
/**
 *
 * @author Rohan Ghosh
 */
import java.util.*;
public class Stringrev {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        String A="";
        for(int i=S.length()-1; i>=0; i--)
            A+=S.charAt(i);
        System.out.println(A);
    }
}
