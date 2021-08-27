# [2579] 계단 오르기

## 분류
> 다이나믹 프로그래밍

## 코드
```java
import java.util.*;
public class Q2579 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		int N =sc.nextInt();
		int[] arr = new int[N+1];
		int[] result1 = new int[N+1];
		int[] result2 = new int[N+1];
		for(int i=1; i<=N;i++) {
			arr[i]=sc.nextInt();
		}
		result2[1] = arr[1];
		for(int i=2;i<=N;i++) {
			result1[i] = arr[i] + result2[i-1];
			result2[i] = arr[i] + Math.max(result1[i-2], result2[i-2]);
		}
		System.out.print(Math.max(result1[N], result2[N]));
	}
}


```

## 문제풀이

result[i] = arr[i] + max(result[i-2]  result[i-1])<br>
                 10     20     15     25     10     20   <br>
index      0     1      2      3      4      5      6  <br>
1번째 칸   0     10     30     35     50     65     65<br>
2번째 칸   0      0     20     25     55     45     75<br>
1칸을 밟는 경우에는 연속된 3개의 계단을 밟을 수 없기 때문에 i-1[1]칸의 값을 업데이트해준다.<br>
배열을 첫번째 칸 밟는 값 / 두번째 칸 밟는 값 경우를 나눠 배열을 만들었다.<br>
각각 따로 계산을 해준 후 N번째 위치의 최대값을 출력해준다.<br>
1칸을 밟는 경우 : result1[i] = arr[i] + result2[i-1];<br>
2칸을 밟는 경우에는 i-2중에 더 큰 값을 찾아 더해주면 된다.(칸수는 상관없기 때문) : result2[i] = arr[i] + Math.max(result1[i-2], result2[i-2]);<br>
시작부분에 result2[1] = arr[1] 를 해준 이유는 시작점[0]에서 계단을 올라가는 경우의 예외처리를 위해서이다.<br>
점화식을 따로 두지 않고 그대로 적용하기 위해 첫번째 위치의 값을 다르게 설정해주었다.