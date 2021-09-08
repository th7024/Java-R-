import java.util.*;
public class Q5585 {
	public static void main(String ags[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 1000 - num;
		int cnt=0,temp=0;
		while(n>0) {
			if(n>=500) {
				temp = n/500;
				n -= temp*500;
				cnt += temp;
			}
			if(n>=100) {
				temp = n/100;
				n -= temp*100;
				cnt += temp;
			}
			if(n>=50) {
				temp = n/50;
				n -= temp*50;
				cnt += temp;
			}
			if(n>=10) {
				temp = n/10;
				n -= temp*10;
				cnt += temp;
			}
			if(n>=5) {
				temp = n/5;
				n -= temp*5;
				cnt += temp;
			}
			if(n>=1) {
				temp = n/1;
				n -= temp*1;
				cnt += temp;
			}
		}
		System.out.print(cnt);
		
	}
}
