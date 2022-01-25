import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n  = Integer.parseInt(st.nextToken());
		int m  = Integer.parseInt(st.nextToken());
		int[] arr = new int[m+1];
		arr[0] = arr[1] = 1;
		for(int i = 1; i<=m/2;i++) {
			if(arr[i]==0) {
				for(int j = i*2 ; j<=m;j+=i) {
					arr[j]=1;
				}
			}
		}
		for(int i=n;i<=m;i++) {
			if(arr[i]==0)
				bw.write(i+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
