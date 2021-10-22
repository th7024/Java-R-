import java.util.*;

public class Q11721 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char[] str = new char[100]; 
		String s = sc.next();
		for(int i=0;i<s.length();i++) {
			str[i]=s.charAt(i);
		}
		int cnt=0;
		for(int i =0;i<s.length();i++) {
			System.out.print(str[i]);
			cnt++;
			if(cnt%10==0) System.out.println();
		}
		
	}
}
