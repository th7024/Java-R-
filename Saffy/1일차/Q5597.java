import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q5597 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[31];
		for(int i=0;i<28;i++) {
			int n = Integer.parseInt(br.readLine());
			arr[n]=1;
		}
		int cnt=0;
		for(int i=1;i<=30;i++) {
			if(arr[i]==0) {
				cnt++;
				bw.write(String.valueOf(i)+"\n");
			}
			if(cnt==2) break;
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
