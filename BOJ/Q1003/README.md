# [1149] RGB거리

## 분류
> 다이나믹 프로그래밍

## 코드
```java
1)
import java.util.*;
public class Q1003 {
	static int N,num,zcnt=0,ocnt=0;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i=0;i<N;i++) {
			num=sc.nextInt();
			fibo(num);
			System.out.println(zcnt + " " + ocnt);
			zcnt=0;
			ocnt=0;
		}
	}
	static int fibo(int N) {
		if(N==0) {
			zcnt++;
			return 0;
		}
		if(N==1) {
			ocnt++;
			return 1;
		}
		else {
			return fibo(N-2) + fibo(N-1);
		}
		
	}
}

2)
import java.util.*;
public class Q1003 {
	static int N,num;
	static int[]zcnt = new int[41];
	static int[]ocnt = new int[41];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		N = sc.nextInt();
		zcnt[0]=1;
		zcnt[1]=0;
		ocnt[0]=0;
		ocnt[1]=1;
		for(int i=2;i<41;i++) {
			zcnt[i]=zcnt[i-2]+zcnt[i-1];
			ocnt[i]=ocnt[i-2]+ocnt[i-1];
		}
		for(int i=0;i<N;i++) {
			num=sc.nextInt();
			sb.append(zcnt[num]).append(' ').append(ocnt[num]).append('\n');
		}
		System.out.print(sb);
	}
}

```

## 문제풀이

숫자 N을 입력받고 N개만큼의 정수 num을 입력받는다.<br>
num번째 피보나치 수를 구할 때 나오는 0과 1의 개수를 출력하는 문제이다.<br>
처음에(1) 0의 개수를 체크하는 zcnt와 1의 개수를 체크하는 ocnt를 만들었다. 그 다음 num이 입력될 때 마다 fibo재귀함수를 호출하여 zcnt,ocnt개수를 증가시키고 출력시켜 주었다.<br>
하지만 문제에서 요구하는 시간제한이 0.25초이기 때문에 시간초과가 나왔고 찾아보니 재귀로 호출하게되면 함소호출이 많아져 시간초과가 뜬다고 했다.<br>
때문에 이중배열을 만들어 arr[num][1] 이런식으로 num에 해당하는 0, 1 개수를 배열에 저장해주려 했지만 배열을 num의 개수만큼 생성해주면 시간제한이 뜰거 같아 다른 방법을 생각했다.<br>
0을 카운트하는 zcnt배열과 1을 카운트하는 ocnt배열을 만들어 문제에서 제시한 40까지의 각각 피보나치를 다 구한 다음 StringBuilder를 통해 값을 한번에 출력해 주니 통과가 떴다.<br>
확실히 자바는 출력도 시간제한에 영향을 많이 주는 것 같다.