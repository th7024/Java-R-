import java.util.*;
public class Q1912 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N+1];
		int[] dp = new int[N+1];
		for(int i=1;i<=N;i++) {
			arr[i]=sc.nextInt();
		}
		int max =Integer.MIN_VALUE;
		for(int i=1;i<=N;i++) {
			dp[i]=Math.max(dp[i-1]+arr[i], arr[i]);
			
			if(max<dp[i]) {
				max=dp[i];
			}
		}
		System.out.print(max);
	}
}
