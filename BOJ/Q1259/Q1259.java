import java.util.Scanner;

public class Q1259 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.next();
			StringBuffer sb = new StringBuffer(s);
			String rs = sb.reverse().toString();
			
			if(s.equals("0")) {
				sc.close();
				return;
			}
			
			if(s.equals(rs)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			
		}
		
		
	}
}
