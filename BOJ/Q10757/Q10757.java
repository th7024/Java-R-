import java.util.Scanner;
import java.math.BigInteger;
 
public class Q10757 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = new BigInteger(sc.next());
		BigInteger B = new BigInteger(sc.next());
		
		BigInteger sum = A.add(B);
		
		System.out.println(sum.toString());
	}
}