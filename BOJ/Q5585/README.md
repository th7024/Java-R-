# [5585] 거스름돈

## 분류
> 

## 코드
```java
import java.util.*;
public class Q5585 {
	public static void main(String ags[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 1000 - num;
		int cnt=0,temp=0;
		while(n>0) {
			if(n>=500) {
				temp = n/500;
				n -= temp*500;
				cnt += temp;
			}
			if(n>=100) {
				temp = n/100;
				n -= temp*100;
				cnt += temp;
			}
			if(n>=50) {
				temp = n/50;
				n -= temp*50;
				cnt += temp;
			}
			if(n>=10) {
				temp = n/10;
				n -= temp*10;
				cnt += temp;
			}
			if(n>=5) {
				temp = n/5;
				n -= temp*5;
				cnt += temp;
			}
			if(n>=1) {
				temp = n/1;
				n -= temp*1;
				cnt += temp;
			}
		}
		System.out.print(cnt);
		
	}
}

```

## 문제풀이

거스름돈을 구하는 문제이다. 가격 n을 입력한 후에 1000원을 고객이 지불했다 가정하고 고객에게 거슬러 줄 거스름돈의 최소 개수를 구하는 문제이다.<br>
거스름 돈은 500, 100, 50, 10, 5, 1 원이 있고 이걸 조합해서 최적의 경우를 구하는 것이다.<br>
개수를 줄일려면 값이 큰 동전부터 먼저 사용하여 거스름돈 금액을 줄여나가는 것이 최적의 방법이기 때문에 500부터 차례대로 비교해준다.<br>
temp를 사용한 이유는 각 동전이 하나만 들어가지 않고 여러개가 들어갈 수 있기 때문에 n에서 동전을 나눈 값을 즉 동전의 개수를 담고 있다.<br>
동전이 있을 경우 cnt를 증가시켜주고 반복문이 종료되면 cnt를 출력해준다.<br>