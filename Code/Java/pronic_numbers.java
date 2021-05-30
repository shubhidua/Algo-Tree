package Code.Java;

/*
Algorithm-
The basic idea is to user a temp variable which will keep count of number 
and prints count*(count+1) while count<n.
*/
import java.util.*;
public class pronic_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int i = 0;
        while (i < n) {
            System.out.print(i * (i + 1) + " ");
            i++;
        }
        sc.close();
        return;
    }
}
/*
 * Example 1- Enter the value of n 8 0 2 6 12 20 30 42 56
 * 
 * Example 2- Enter the value of n 5 0 2 6 12 20
 * 
 * 
 */