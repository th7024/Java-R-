# 없는 숫자 더하기

## 문제 설명

0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 `numbers`가 매개변수로 주어집니다. `numbers`에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

------

##### 제한사항

- 1 ≤ numbers의 길이 ≤ 9
- 0 ≤ `numbers`의 모든 원소 ≤ 9
- `numbers`의 모든 원소는 서로 다릅니다.

------

##### 입출력 예

| numbers           | result |
| ----------------- | ------ |
| [1,2,3,4,6,7,8,0] | 14     |
| [5,8,4,0,6,7,9]   | 6      |

------

##### 입출력 예 설명

**입출력 예 #1**

- 5, 9가 `numbers`에 없으므로, 5 + 9 = 14를 return 해야 합니다.

**입출력 예 #2**

- 1, 2, 3이 `numbers`에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.

## 코드
```java
package Programmers;

//없는 숫자 더하기
public class Q220216_1 {
	class Solution {
	    public int solution(int[] numbers) {
	        int answer = 0;
	        int [] check = new int [10];
	        for(int i=0;i<numbers.length;i++){
	            int n = numbers[i];
	            check[n]=1;
	        }
	        for(int i=0;i<10;i++){
	            if(check[i]==0)answer+=i;
	        }
	        return answer;
	    }
	}
}


```

## 문제 풀이

numbers배열이 넘어 왔을 때 check배열을 만들어 numbers에 있는 정수를 체크해준다.

그 다음 반복문에서 check[i]==0 일 때 answer를 더해준다. 

check[i]가 0인 경우는 numbers에 없는 정수이기 때문에 answer에 더해주면 된다.