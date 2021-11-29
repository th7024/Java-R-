import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int cnt = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]<2) continue;
			int jcnt=0;
			for(int j=2;j<=arr[i];j++){
				if(arr[i]%j==0)jcnt++;
			}
			if(jcnt==1)cnt++;
		}
		bw.write(cnt + "\n");
		br.close();
		bw.flush();
		bw.close();
	}
}
