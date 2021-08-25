import java.util.*;
public class Q1003 {
	static int N,num;
	static int[]zcnt = new int[41];
	static int[]ocnt = new int[41];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		N = sc.nextInt();
		zcnt[0]=1;
		zcnt[1]=0;
		ocnt[0]=0;
		ocnt[1]=1;
		for(int i=2;i<41;i++) {
			zcnt[i]=zcnt[i-2]+zcnt[i-1];
			ocnt[i]=ocnt[i-2]+ocnt[i-1];
		}
		for(int i=0;i<N;i++) {
			num=sc.nextInt();
			sb.append(zcnt[num]).append(' ').append(ocnt[num]).append('\n');
		}
		System.out.print(sb);
	}
}
