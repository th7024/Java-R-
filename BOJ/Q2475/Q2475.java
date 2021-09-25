import java.util.Scanner;
public class Q2475 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,result=0;
		for(int i=0;i<5;i++) {
			num = sc.nextInt();
			result += num*num;
		}
		result = result%10;
		System.out.print(result);
	}

}
