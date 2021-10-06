# [1085] 직사각형에서 탈출

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

public class Q1085 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int min = 0;
		
		if(X<W-X) min = X;
		else min = W-X;
		
		if(Y<H-Y) {
			if(Y<min) min=Y;
		}
		else {
			if(H-Y<min) min = H-Y;
		}
		bw.write(min+"\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}

```

## 문제풀이

한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.



x,y,h,w를 입력받는다. 0,0에서 x,y의 거리는 x,y이기 때문에 h-y와 w-x, x,y 값 중 작은 값을 min에 담아 출력해주면 된다.