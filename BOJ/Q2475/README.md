# [2475] 검증수

## 분류
> 수학
>
> 구현
>
> 사칙연산

## 코드
```java
import java.util.Scanner;
public class Q2475 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,result=0;
		for(int i=0;i<5;i++) {
			num = sc.nextInt();
			result += num*num;
		}
		result = result%10;
		System.out.print(result);
	}

}

```

## 문제풀이

컴퓨터를 제조하는 회사인 KOI 전자에서는 제조하는 컴퓨터마다 6자리의 고유번호를 매긴다. 고유번호의 처음 5자리에는 00000부터 99999까지의 수 중 하나가 주어지며 6번째 자리에는 검증수가 들어간다. 검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.

예를 들어 고유번호의 처음 5자리의 숫자들이 04256이면, 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지인 1이 검증수이다.

반복문을 만들어 변수 num에 총 5번의 입력을 받으며 결과를 출력할 result에 num의 제곱수를 더해주었다. 

반복문이 끝나고 난 후 result에 10으로 나눈 나머지를 저장해준후 result를 출력해준다.