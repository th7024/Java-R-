import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashSet<String> hash = new HashSet<String>();
		ArrayList<String> al = new ArrayList<String>();
		
		for(int i=0;i<N;i++) {
			hash.add(br.readLine());
		}
		for(int i=0;i<M;i++) {
			String s = br.readLine();
			if(hash.contains(s)) {
				al.add(s);
			}
		}
		Collections.sort(al);
		bw.write(al.size()+"\n");
		for(int i=0;i<al.size();i++) {
			bw.write(al.get(i)+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
