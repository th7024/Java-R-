import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
public class Q1924 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"MON","TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		
		int M = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int sum =0;
		for(int i=0;i<M;i++) {
			sum+=arr[i];
		}
		sum += D-1;
		int avg = sum % 7;
		if(avg>6) avg-=7;
		bw.write(day[avg]);
		br.close();
		bw.close();
	}

}
