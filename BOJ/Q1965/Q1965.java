import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1965 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		int [] dp = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			dp[i]=1;
		}
		int max = 1;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					int sum = dp[j]+1;
					if(sum>dp[i]) dp[i]=sum;
					if(dp[i]>max) max = dp[i];
				}
			}
		}
		bw.write(max+"\n");
		br.close();
		bw.flush();
		bw.close();

	}

}
