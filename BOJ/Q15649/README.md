# [15649] N과 M (1)

## 분류
> 백트래킹

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Q15649 {
	static int N;
	static int M;
	static int []visit = new int[9];
	static ArrayList<Integer> ans = new ArrayList<>();
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		dfs(0);
		br.close();
		bw.close();
	}
	static void dfs(int cnt) throws IOException {
		
		if(cnt==M) {
			for(int i=0;i<M;i++) {
				bw.write(ans.get(i)+" ");
			}
			bw.write("\n");
			bw.flush();	
			//ans.clear();
			return;
		}
		
		for(int i =1 ; i<=N;i++) {
			if(visit[i]==0) {
				visit[i]=1;
				ans.add(i);
				dfs(cnt+1);
				ans.remove(cnt);
				visit[i]=0;
			}
			
		}
		
	}
}


```

## 문제풀이

N개의 숫자를 입력받고 M의 길이를 가진 수열을 출력하는 문제이다.

백트래킹을 이용해서 구현하였고 백트래킹이란 가지치기 느낌으로 재귀함수에서 사용하는 방법이다.

dfs함수에서 구현하였고 중복체크를 방지하기 위해 visit배열을 이용하였다.

dfs의 매개변수로 cnt를 주었고 cnt가 M이 된다면 ans 배열에 있는 값을 출력해준다. 

그렇게 i값이 N이 된다면 모든 경우를 다 비교한 것이기 때문에 종료해준다.              