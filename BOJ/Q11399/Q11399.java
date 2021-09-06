import java.util.*;
public class Q11399 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
		for(int i=1;i<=n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int sum = 0;
		for(int i=1;i<=n;i++) {
			dp[i]=arr[i]+dp[i-1];
			sum += dp[i];
		}
		System.out.print(sum);
	}
}

