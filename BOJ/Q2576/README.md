# [2576] 홀수

## 분류
> 수학
>
> 구현

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2576 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum=0,min=Integer.MAX_VALUE;
		for(int i =0;i<7;i++) {
			int n = Integer.parseInt(br.readLine());
			if(n%2==1) {
				sum+=n;
				if(n<min)min=n;
			}
		}
		if(sum==0)bw.write("-1\n");
		else bw.write(sum + "\n" + min);
		br.close();
		bw.flush();
		bw.close();

	}

}

```

## 문제풀이

7개의 정수를 입력받아 홀수끼리 합을 구하고 합과 최솟값을 출력하는 문제이다. 만약 홀수가 존재하지 않는다면 -1를 출력한다.

반복문에서 정수를 입력받고 sum과 min을 구해준다. 그 후 반복문이 끝나면 합과 최솟값을 출력해준다.

sum이 0이라면 홀수가 없었던 것이기 때문에 -1를 출력해준다.