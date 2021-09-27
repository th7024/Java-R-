# [1149] RGB거리

## 분류
> 구현

## 코드
```java
import java.util.*;
import java.io.IOException;
public class Q10817 {
	public static void main(String args[]){
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(arr[1]);
	}
}

```

## 문제풀이

세개의 수를 입력받고 중간 수를 출력하는 문제이다. 3의 크기인 배열 arr을 입력받아 정렬을 해준 후 2번쨰 인덱스를 출력해주면 된다.