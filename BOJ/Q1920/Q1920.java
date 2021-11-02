import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1920 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr1 = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr1[i]=Integer.parseInt(st.nextToken());
		}
		int M = Integer.parseInt(br.readLine());
		int[] arr2 = new int[N];
		 st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			arr2[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<M;i++) {
			int tmp = arr2[i];
			int cnt=0;
			for(int j=0;j<N;j++) {
				if(tmp==arr1[j]) {
					cnt=1;
					break;
				}
			}
			bw.write(cnt+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
		
	}
}
