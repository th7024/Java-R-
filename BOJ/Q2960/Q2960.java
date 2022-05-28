import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2960 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt = 0;
		int[] arr = new int[n+1];
		for(int i=2;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				if(j%i==0 &&arr[j]==0) {
					arr[j]=1;
					cnt++;
				}
				if(cnt==m) {
					System.out.println(j);
					return;
				}
			}
		}
	}
}
