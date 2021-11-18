# [1644] 소수의 연속합

## 분류
> 수학
>
> 정수론
>
> 두 포인터
>
> 소수 판정
>
> 에라토스테네스의 체

## 코드
```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q1644 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int s=0,e=0,sum=0,cnt=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		boolean[] sosu = new boolean[N+1];
		if(N==0) {
			System.out.println("0");
			return;
		}
		sosu[0]=sosu[1]=true;
		
		for(int i=2;i<=N;i++) { // 소수 구하는 알고리즘
				for(int j=i*2;j<=N;j+=i) { //i는 소수이고 i의 배수를 다 지워줌
					sosu[j] = true;
				}
		}
		for(int i=1;i<=N;i++) { // 구한 소수를 AL에 담아줌(가변 크기이기 때문에 arrayList 사용)
			if(!sosu[i]) {
				arr.add(i);
			}
		}
		
		while(true) {
			// e가 끝지점이면 s증가, 값이 크거나 같으면 s증가, 작다면 e증가
			if(e==arr.size()) {
				if(s==arr.size()) break;
				sum -=arr.get(s++);
			}
			else {
				if(sum<N) sum += arr.get(e++);
				else sum -=arr.get(s++);
			}
			if(sum==N) cnt++;
		}
		System.out.println(cnt);
		
	}
}

```

## 문제풀이

정수 N이 주어지면 1부터 N까지의 소수들의 합으로 N을 만들 수 있는 개수를 출력하는 문제이다.

먼저 N을 입력받으면 에라토스테네스의 체를 이용한 소수 판정 알고리즘으로 소수의 배수들을 다 true로 만들어 false인 소수들만 ArrayList에 담아주었다.

ArrayList를 사용한 이유는 N까지의 수 중에 소수가 몇개일지 모르기 때문에 가변 크기를 가진 ArrayList를 사용하였다.

그 다음 While문을 돌면서 합을 구하는데 두 포인터 알고리즘이 적용되었다.

두 포인터 알고리즘이란 시작 인덱스를 나타내는 S와 마지막 인덱스를 나타내는 E를 만들어 비교 연산을 O(N)으로 수행할 수 있는 알고리즘이다.

S와 E를 선언해준 후 합을 기록할 변수 sum과 개수를 담을 cnt를 만들어 주었다.

while문의 구조는 다음과 같다.

먼저 e의 위치에 따라 바뀐다. e가 마지막 인덱스에 위치한다면, 그 다음에는 s의 위치를 확인하는데 s역시 마지막 인덱스라면 break를 시켜주고 아니라면 sum에 arr[s]값을 빼주고 s값을 증가시켜준다. s를 마지막 인덱스 까지 기다린 이유는 마지막 위치에 있는 값이 소수라면 그 수 역시 카운트 시켜주어야 하기 떄문이다.

e가 마지막 인덱스가 아니라면 sum의 값에 따라 위치가 바뀐다. sum이 N보다 작다면 아직 합이 부족하다는 것이기 때문에 e를 하나 증가키셔 sum에 더해준다.

그게 아니라면 N과 같거나 작은 경우인데 그 경우에는 sum에서 arr[s]를 빼주고 s를 증가시켜준다.

위 연산이 끝나면 sum이 N를 비교하는데 두 수가 같으면 cnt를 증가시켜준다.