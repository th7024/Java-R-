import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1806 {
	static int N,S;
	static int[] arr;
	static int sw=0,min=Integer.MAX_VALUE,sum=0;
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int sidx=0,eidx=0;
//		while(true) {
//			int ssum = 0, len=0;	
//			for(int i =sidx;i<=eidx;i++) {
//				ssum +=arr[i];
//				len++;
//			}
//			if(ssum>=S) {
//				sw=1;
//				if(len<min) min = len;
//				if(ssum>S) sidx++;
//				else {
//					if(eidx<N-1) eidx++;
//					else sidx++;	
//				}
//			}
//			else if(ssum<S) {
//				if(eidx<N-1) eidx++;
//				else sidx++;
//				if(eidx==N-1) break;
//			}
//			else sidx++;
//		}  while - for는 시간복잡도가 너무 크기 때문에 반복문 하나로 더하기 연산을 수행해야함.
		while(true) {
			if(sum>= S) {
				sum -= arr[sidx]; // sidx가 오른쪽으로 이동했다.
				min = Math.min(min, (eidx-sidx));
				sidx++;
			}
			else if(eidx==N) break;
			else sum += arr[eidx++];
		}
		if(min==Integer.MAX_VALUE)
			bw.write("0");
		else bw.write(min + "\n");
		bw.flush();
		br.close();
		bw.close();
		
	}
}
