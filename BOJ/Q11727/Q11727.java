import java.util.*;
public class Q11727 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,2};
		int n = sc.nextInt();
		int[] dp = new int[1001];
		dp[1]=1;dp[2]=3;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
        }
		System.out.print(dp[n]);
	}
}
