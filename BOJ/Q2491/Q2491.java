import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2491 {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int add = 1,sub=1;
		int max =0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0;i<n;i++) arr[i]=Integer.parseInt(st.nextToken());
		int a =0;
		if(n==1)bw.write("1\n");
		else
		{
			for(int i=1;i<n;i++) {
				if(arr[i-1]<=arr[i]) add++;
				else add=1;
				if(arr[i-1]>=arr[i]) sub++;
				else sub=1;
				a = (sub<add)?add:sub;
				max = (a>max)?a:max;
		}
			bw.write(max+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
