# [11399] ATM

## 분류
> 그리디 알고리즘
> 정렬

## 코드
```java
import java.util.*;
public class Q11399 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
		for(int i=1;i<=n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int sum = 0;
		for(int i=1;i<=n;i++) {
			dp[i]=arr[i]+dp[i-1];
			sum += dp[i];
		}
		System.out.print(sum);
	}
}


```

## 문제풀이

ATM에 n명의 사람이 있을 때 가장 적게 걸리는 시간을 구하는 문제이다.<br>
사람마다 걸리는 시간이 다르기 때문에 마지막 사람의 경우에는 앞에 4사람이 걸린 시간 + 자신의 시간이 걸린다.<br>
사람     시간 <br>
 1        3<br>
 2        1<br>
 3        4<br>
 4        3<br>
 5        2<br>
입력된 순서 대로 하는 경우에는 다음과 같다<br>
사람     시간      걸리는 시간<br>
 1        3            3          = 3<br>
 2        1            3+1        = 4<br>
 3        4            3+1+4      = 8<br>
 4        3            3+1+4+3    = 11<br>
 5        2            3+1+4+3+2  = 13    총 : 39시간<br>
하지만 줄을 [2, 5, 1, 4, 3] 순서로 서는 경우에는 다르다.<br>
사람     시간      걸리는 시간<br>
 2        1            1          = 1<br>
 5        2            1+2        = 3<br>
 1        3            1+2+3      = 6<br>
 4        3            1+2+3+3    = 9<br>
 3        4            1+2+3+3+4  = 13    총 : 31시간<br>
앞에 했던 방법과의 차이는 시간이 적게 걸리는 사람먼저 차례로 출금을 한 것이다.<br>
때문에 입력을 받은 arr을 오름차순으로 정렬해준 후에 dp배열에<br>
dp[i] = arr[i] + dp[i-1]<br>
(내가 걸리는 시간) = 내 시간 + 전에 걸렸던 시간 <br>
모두가 걸리는 최소시간을 구하는 문제이기 때문에 sum변수를 만들어 dp배열을 연산하면서 sum에 dp[i]를 계속 더해주었다.<br>
그 후 sum을 출력해주면 끝이다.