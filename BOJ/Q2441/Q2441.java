import java.util.Scanner;
public class Q2441 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int z=0;z<i;z++) {
				System.out.print(' ');
			}
			for(int j=i;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
