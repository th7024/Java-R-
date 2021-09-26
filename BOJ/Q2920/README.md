# [2920] 음계

## 분류
> 구현

## 코드
```java
import java.util.Scanner;
public class Q2920 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		int acnt=1,dcnt=1;
		for(int i=0;i<8;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<8;i++) {
			if(arr[i]!=i+1) {
				acnt=0;
				break;
			}
		}
		for(int i=0;i<8;i++) {
			if(arr[i]!=8-i) {
				dcnt=0;
				break;
			}
		}
		if(acnt==1) System.out.print("ascending");
		if(dcnt==1) System.out.print("descending");
		if(acnt==0&&dcnt==0) System.out.print("mixed");
	}
}

```

## 문제풀이

먼저 숫자 8개를 배열에 담아준다. 

그 다음 오름차순 확인용 변수acnt와 내림차순 확인용 변수 dcnt를 만들어 오름차순이 아니거나 내림차순이 아니라면 0으로 만들어준다. 둘 다 0인경우가 mixed이기 때문에 그 경우에는 mixed를 출력해주고 나머지의 경우에는 오름차순 내림차순을 출력해준다.