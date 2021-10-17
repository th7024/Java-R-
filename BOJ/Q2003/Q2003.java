import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2003 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int sum = Integer.parseInt(st.nextToken());
		int cnt=0;
		int[] arr = new int[N];
		int sidx=0,eidx=0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		while(sidx<=N-1) {
			int ssum=0;
			for(int i=sidx;i<=eidx;i++) {
				ssum += arr[i];
			}
			if(ssum==sum) {
				cnt++;
				if(eidx<N-1)
					eidx++;
				else sidx++;
			}
			else if(ssum<sum) {
				if(eidx<N-1)
					eidx++;
				else sidx++;
			}
			else sidx++;
		}
		System.out.println(cnt);
	}
	

}
