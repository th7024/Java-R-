# [1978] 소수 찾기

## 분류
> 수학
>
> 정수론
>
> 소수 판정
>
> 에라토스테네스의 체

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int cnt = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]<2) continue;
			int jcnt=0;
			for(int j=2;j<=arr[i];j++){
				if(arr[i]%j==0)jcnt++;
			}
			if(jcnt==1)cnt++;
		}
		bw.write(cnt + "\n");
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

숫자 N개가 들어간 배열 arr를 입력받고, 각 배열 원소를 2부터 arr[i]의 범위까지 나눠 jcnt가 1이라면 cnt를 증가시켜 준다. 그 다음 cnt를 출력해준다.