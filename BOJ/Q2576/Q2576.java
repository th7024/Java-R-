import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2576 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum=0,max=Integer.MAX_VALUE;
		for(int i =0;i<7;i++) {
			int n = Integer.parseInt(br.readLine());
			if(n%2==1) {
				sum+=n;
				if(n<max)max=n;
			}
		}
		if(sum==0)bw.write("-1\n");
		else bw.write(sum + "\n" + max);
		br.close();
		bw.flush();
		bw.close();

	}

}
