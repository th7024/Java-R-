# [1357] 뒤집힌 덧셈

## 분류
> 구현
>
> 문자열

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1357 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s1 = st.nextToken();
		StringBuffer sb = new StringBuffer(s1);
		String s2 = st.nextToken();
		int n1 = Integer.parseInt(sb.reverse().toString());
		sb = new StringBuffer(s2);
		int n2 = Integer.parseInt(sb.reverse().toString());
		int s = n1 + n2;
		String ans = String.valueOf(s);
		sb = new StringBuffer(ans);
		int a = Integer.parseInt(sb.reverse().toString());
		bw.write(a+"\n");
		br.close();
		bw.flush();
		bw.close();
		
	}

}

```

## 문제풀이

정수 두개를 입력받고 그 수를 뒤집어 더한 후, 결과값을 다시 뒤집어 출력하는 문제이다.

입력을 문자열로 받고 StringBuffer의 reverse함수를 이용해 뒤집어 주었다.

 정수형변환을 한 후 연산을 하고 다시 StringBuffer를 통해 뒤집어 출력해주었다.