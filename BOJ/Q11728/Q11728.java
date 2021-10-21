import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11728 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N+M];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<arr.length;i++) {
			if(i==N) {
				st = new StringTokenizer(br.readLine());
			}
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) bw.write(arr[i] + " ");
		 bw.flush();
		 br.close();
		 bw.close();
	}
}
