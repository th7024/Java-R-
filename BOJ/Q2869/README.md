# [2869] 달팽이는 올라가고 싶다

## 분류
> 수학

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int sum=0;
		sum = (V-B) / (A-B);
		if((V-B) % (A-B)!=0) sum++;
		
		bw.write(sum+"\n");
		br.close();
		bw.flush();
		bw.close();
	}
}

```

## 문제풀이

시간제한이 0.15초 이기 때문에 반복문으로 풀면 안된다.

낮에는 A만큼 올라가고 밤에는 B만큼 떨어지는데 높이가 V미터인 나무에 올라가는데 며칠이 걸리는지 구하는 문제이다.

정상에 올라간 후에는 미끄러지지 않는 것이 생각해야 하는 부분이다.

때문에 AX - B(X-1) = V라는 수식을 설정해 주었다. 

연산한 값을 sum이라는 변수에 담아주었는데, 만약에 V-B를 A-B로 나눈 값이 0이 아니라면 아직 덜 올라간 경우이기 때문에 sum을 +1해준다.

그럼 총 걸리는 날짜가 나오게 된다.