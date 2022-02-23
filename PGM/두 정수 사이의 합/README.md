# 없는 숫자 더하기

## 문제 설명

두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

##### 제한 조건

- a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
- a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
- a와 b의 대소관계는 정해져있지 않습니다.

##### 입출력 예

| a    | b    | return |
| ---- | ---- | ------ |
| 3    | 5    | 12     |
| 3    | 3    | 3      |
| 5    | 3    | 12     |

## 코드
```java
package Programmers;

//두 정수 사이의 합
public class Q220223_1 {
	class Solution {
	    public long solution(int a, int b) {
	        long answer = 0;
	        if(a > b){
	            for(int i=b;i<=a;i++) answer+=i;
	        }
	        else if(a < b){
	            for(int i=a;i<=b;i++) answer+=i;
	        }
	        else {
	            answer = a;
	        }
	        return answer;
	    }
	}
}

```

## 문제 풀이

정수 a와 b가 주어졌을 때 a-b사이의 숫자를 더하는 문제이다.

경우의 수는 총 3가지로 나뉘는데

1. a > b

2. a < b

3. a = b

   총 3가지이다.

   1의 경우에는 b~a까지 반복문을 돌려주고, 2의 경우에는 a~b까지 마지막 3은 a를 return해준다.