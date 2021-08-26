import java.util.*;
public class Q2748 {
	static int N;
	static long[] arr;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		if(N==0||N==1) {
			System.out.print(N);
		}
		else {
		arr = new long[N+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<=N;i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
			System.out.print(arr[N]);
		}
		
	}

}
