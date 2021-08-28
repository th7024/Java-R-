import java.util.*;
public class Q11053 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N+1];
		int[] dp = new int[N+1];
		int max = 0;
		for(int i=1;i<=N;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<=N;i++) { //선택한 값
			for(int j=0;j<=N;j++) { // 처음부터 비교
				if(arr[j]<arr[i]&&dp[i]<dp[j]+1) {
					dp[i]= dp[j]+1;
				}
				if(max<dp[i]) {
					max=dp[i];
				}
			}
		}
		System.out.print(max);
	}
}
