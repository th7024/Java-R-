# [11727] 2*n 타일링 2

## 분류
> 다이나믹 프로그래밍

## 코드
```java
import java.util.*;
public class Q11727 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,2};
		int n = sc.nextInt();
		int[] dp = new int[1001];
		dp[1]=1;dp[2]=3;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
        }
		System.out.print(dp[n]);
	}
}

```

## 문제풀이

숫자 n을 입력하고 1*2,2*1,2*2 타일로 채우는 방법의 수를 구하는 문제이다.<br>
N  경우의 수<br>
0     0<br>
1     1<br>
2     1+1 / 2(1) / 2(2)<br>
3     1+1+1 / 2(1)+1 / 2(2)+1 / 1+2(1) / 1+2(2)<br>
4     1+1+1+1 / 2(1)+1+1 / 2(2)+1+1 / 1 + 2(1) + 1  /  1 + 2(2) + 1 / 2(1)+2(2)<br>
3의 경우 2로 끝나는 타일은 옆에 올 수 있는 경우의 수가 2*1 타일 하나밖에 없지만 2*1타일 하나만 있는 경우에는  2*1 타일이 가로로 2개 붙어있거나  2*2로 가로가 2인 타일이 두가지 경우가 있어 i-2에서 곱하기 2를 해줘야한다.
