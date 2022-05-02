import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for(int i =0;i<num;i++) {
			int ans=0,sum=0;                                  
			String s[] = br.readLine().split("");
			for(int j=0;j<s.length;j++) {
				if(s[j].equals("O")) sum++;
				else sum=0;
				ans+=sum;
			}

			bw.write(String.valueOf(ans)+"\n");
			ans=0;
		}
		br.close();
		bw.flush();
		bw.close();
		
	}
}
