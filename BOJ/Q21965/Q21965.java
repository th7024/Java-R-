import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q21965 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int cnt=0;
		for(int i=0;i<n-1;i++) {
			if(cnt==1) {
				if(arr[i]<arr[i+1]) {
					cnt=2;
					break;
				}
			}
			if(arr[i]<arr[i+1]) {
				continue;
			}
			else if(arr[i]==arr[i+1]) {
				cnt=2; 
				break;
			}
			else {
				cnt=1;
			}
		}
		if(cnt==2) bw.write("NO");
		else bw.write("YES");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
