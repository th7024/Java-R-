import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q1644 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int s=0,e=0,sum=0,cnt=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		boolean[] sosu = new boolean[N+1];
		if(N==0) {
			System.out.println("0");
			return;
		}
		sosu[0]=sosu[1]=true;
		
		for(int i=2;i<=N;i++) { // 소수 구하는 알고리즘
				for(int j=i*2;j<=N;j+=i) { //i는 소수이고 i의 배수를 다 지워줌
					sosu[j] = true;
				}
		}
		for(int i=1;i<=N;i++) { // 구한 소수를 AL에 담아줌(가변 크기이기 때문에 arrayList 사용)
			if(!sosu[i]) {
				arr.add(i);
			}
		}
		
		while(true) {
			// e가 끝지점이면 s증가, 값이 크거나 같으면 s증가, 작다면 e증가
			if(sum>=N) sum -=arr.get(s++);
			else if(e==arr.size()) break;
			else sum += arr.get(e++);
			if(sum==N) cnt++;
		}
		System.out.println(cnt);
		
	}
}
