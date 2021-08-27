# [9095] 1,2,3 더하기

## 분류
> 다이나믹 프로그래밍

## 코드
```java
import java.util.*;
public class Q9095 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]arr = new int [11];
		arr[1]=1;
		arr[2]=2;
		arr[3]=4;
		for(int i=4;i<=10;i++) {
			arr[i] = arr[i-3] + arr[i-2] + arr[i-1];
		}
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			System.out.println(arr[num]);
		}
	}
}

```

## 문제풀이

n을 입력하고 n만큼 정수를 입력한다. 정수를 입력했을 때 1,2,3으로 만들 수 있는 개수를 출력하는 문제이다.<br>
맨처음에는 num의 크기만큼 배열을 만들고 1로 초기화를 한 후 앞에서 부터 2 3으로 더해 cnt값을 증가시키려 했지만 생각보다 까다로워 손코딩을 하던 중 규칙을 발견했다.<br>
(0: 0 = 1 )<br>
1 : 1 = 1<br>
2 : 1+1,2 = 2<br>
3 : 1+2 / 2+1 / 1+1+1 / 3 = 4 <br>
4 : 1+3 / 2+2 / 3+1 / 1+1+1+1 / 1+1+2 / 2+1+1 / 1+2+1= 7<br>
i 값은 i-3 + i-2 + i-1로 이루어진다는 것이다.<br>
때문에 점화식이 arr[i] = arr[i-3] + arr[i-2] + arr[i-1]로 이루어지게 된다.<br>
DP문제는 문제를 잘 보고 점화식을 구해서 풀어야 하는데 그걸 깜빡하고 바로 달려들어서 오래 걸렸던 것 같다.