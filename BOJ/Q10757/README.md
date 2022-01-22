# [10757] 큰 수 A+B

## 분류
> 수학
>
> 구현
>
> 사칙연산
>
> 임의 정밀도 / 큰 수 연산

## 코드
```java
import java.util.Scanner;
import java.math.BigInteger;
 
public class Q10757 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = new BigInteger(sc.next());
		BigInteger B = new BigInteger(sc.next());
		
		BigInteger sum = A.add(B);
		
		System.out.println(sum.toString());
	}
}
```

## 문제풀이

이 문제는 큰 수를 연산하는 문제이기 때문에 기본 자료형으로 할 수 없다.

자바에 있는 BigInteger라는 자료형을 이용해야 한다. 

BinInteger는 정수형이 아니라 값을 더할 때도 BigInteger안에 있는 매소드를 이용해야 한다.

add를 통해 연산을 진행해주고 출력할 때는 string형태로 변환해 출력해주었다.