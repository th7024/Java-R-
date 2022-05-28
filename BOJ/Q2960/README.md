# [2960] 에라토스테네스의 체

## 분류
> 수학
>
> 구현
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

public class Q2960 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt = 0;
		int[] arr = new int[n+1];
		for(int i=2;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				if(j%i==0 &&arr[j]==0) {
					arr[j]=1;
					cnt++;
				}
				if(cnt==m) {
					System.out.println(j);
					return;
				}
			}
		}
	}
}

```

## 문제풀이

두 정수 N과 M을 입력받고 2부터 N까지 수 중 M번째에 지워지는 수를 구하는 문제이다.

에라토스테네스의 체는 2부터 N까지 2의 배수를 하나씩 지워나가며 더이상 지울 숫자가 없으면 3, 4 로 증가해서 이 작업을 수행한다.

중복방지를 위해 정수형 배열 arr를 선언해주고 이미 다녀간 곳은 1로 체크를 해주었다.

숫자가 지워질 때 마다 cnt를 증가시켜 cnt가 m과 같다면 정수를 출력시켜주었다.