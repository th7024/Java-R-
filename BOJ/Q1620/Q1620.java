import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, Integer> hs = new HashMap<>();
		String[] pocket = new String[N+1];
		for(int i=1;i<=N;i++) {
			String s = br.readLine();
			hs.put(s,i);
			pocket[i]= s;
		}
		for(int i=0;i<M;i++) {
			String str = br.readLine();
			char c = str.charAt(0);
			if(('a'<=c&&c<='z')||('A'<=c&&c<='Z')) {
				bw.write(hs.get(str)+"\n");
			}
			else {
				int num = Integer.parseInt(str);
				bw.write(pocket[num]+"\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
