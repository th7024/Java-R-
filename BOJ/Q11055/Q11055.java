import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11055 {
	static int[] arr;
	static int[] dp;
	static int N;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		dp = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i]=arr[i];
		}
		dp[0]=arr[0];
		for(int i=1;i<N;i++) {
			for(int j=0;j<=i;j++) {
				if(arr[j]<arr[i]) {
					dp[i]=Math.max(dp[i], dp[j]+arr[i]);
				}
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<N;i++) {
			if(max<dp[i]) max=dp[i];
		}
		bw.write(max+"\n");
		br.close();
		bw.flush();
		bw.close();
	}
}

