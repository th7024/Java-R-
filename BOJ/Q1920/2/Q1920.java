import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr1 = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		int[] arr2 = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr1);
		for(int i=0;i<M;i++) {
			int tmp = arr2[i];
			int cnt=0;
			for(int j=0;j<N;j++) {
				if(tmp==arr1[j]) {
					cnt=1;
					break;
				}
			}
			if(cnt==1) bw.write("1\n");
			else bw.write("0\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
