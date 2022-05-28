import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1929_1 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[M+1];
		arr[0]=arr[1]=1;
		for(int i = 1;i<=M;i++) {
			if(arr[i]==0) {
				for(int j = i*2;j<=M;j+=i) {
					arr[j]=1;
				}
			}
		}
		for(int i=N;i<=M;i++) {
			if(arr[i]==0) bw.write(i+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
