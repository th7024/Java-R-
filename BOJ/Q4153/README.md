# [4153] 직각삼각형

## 분류
> 수학
>
> 기하학

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q4153 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		double a, b, c;
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Double.parseDouble(st.nextToken());
			b = Double.parseDouble(st.nextToken());
			c = Double.parseDouble(st.nextToken());
			if(a==0&&b==0&&c==0) break;
			
			double C = Math.pow(c, 2);
			double A = Math.pow(a, 2);
			double B = Math.pow(b, 2);
			if(C==A+B||A==B+C||B==A+C) bw.write("right\n");
			else bw.write("wrong\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}

```

## 문제풀이

각 변을 이루는 변수 3개를 입력받고 이 삼각형이 직각삼각형인지 아닌지를 구하는 문제이다.

직각삼각형을 이루는 공식은 A^2 = B^2 + C^2이다.(A가 가장 긴 변)

변수 a,b,c를 입력 받고 각 변수의 제곱수는 대문자로 해주었다.

그 후 반복문을 통해 각 경우의 수를 구해주었고 조건에 맞다면 right를 틀리다면 wrong을 출력해주었다.

테스트케이스는 따로 존재하지 않기 때문에 abc모두 0이 입력되면 종료되게 해주었다.