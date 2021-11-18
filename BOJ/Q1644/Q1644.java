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
		
		for(int i=2;i<=N;i++) { // �Ҽ� ���ϴ� �˰���
				for(int j=i*2;j<=N;j+=i) { //i�� �Ҽ��̰� i�� ����� �� ������
					sosu[j] = true;
				}
		}
		for(int i=1;i<=N;i++) { // ���� �Ҽ��� AL�� �����(���� ũ���̱� ������ arrayList ���)
			if(!sosu[i]) {
				arr.add(i);
			}
		}
		
		while(true) {
			// e�� �������̸� s����, ���� ũ�ų� ������ s����, �۴ٸ� e����
			if(sum>=N) sum -=arr.get(s++);
			else if(e==arr.size()) break;
			else sum += arr.get(e++);
			if(sum==N) cnt++;
		}
		System.out.println(cnt);
		
	}
}
