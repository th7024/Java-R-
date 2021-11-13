# [10974] 모든 순열

## 분류
> 브루트포스 알고리즘

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10974 {
	static int N;
	static int[] output;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		output = new int[N];
		boolean[] visit = new boolean[N+1];
		for(int i=1;i<=N;i++) {
			visit[i]=true;
			print(visit,i,0);
			visit[i]=false;
		}
		br.close();
	}
	static void print(boolean[] visit,int num,int depth) {
		output[depth]=num;
		if(depth == N-1) {
			for(int i:output) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		for(int i=1;i<=N;i++) {
			if(visit[i]) continue;
			visit[i]=true;
			print(visit,i,depth+1);
			visit[i]=false;
		}
	}
}

```

## 문제풀이

정수 N을 입력받고 N!로 이루어진 순열을 사전순으로 출력하는 문제이다.

문제는 dfs 형식으로 만들었고, 출력용 배열 output을 만들어 출력을 하였다.

순열을 구하는 문제이기 때문에 나왔던 숫자가 반복적으로 나오면 안된다.

때문에 방문체크 배열 visit를 만들어 방문체크를 진행하여 방문 하지 않은 수만 output배열에 담아주었다.

depth는 output배열의 인덱스를 담당하는 변수이고, depth가 N-1이 된다면 output을 출력해주었다.

