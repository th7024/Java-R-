import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2470 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int s=0,e=N-1,min=0,max=0,ans=Integer.MAX_VALUE;
		while(s<e) {
			int c = arr[s] + arr[e];
			c = Math.abs(c);
			if(c<=ans) {
				min = arr[s];
				max = arr[e];
				ans = c;
				s++;
			}
			else e--;
		}
		System.out.println(min +" " +max);
	}
}
