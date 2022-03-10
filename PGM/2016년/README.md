# 2016년

## 문제 설명

2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 `SUN,MON,TUE,WED,THU,FRI,SAT`

입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

##### 제한 조건

- 2016년은 윤년입니다.
- 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)

#### 입출력 예

| a    | b    | result |
| ---- | ---- | ------ |
| 5    | 24   | "TUE"  |

## 코드
```java
package Programmers;
//2016년
public class Q220310_1 {
	class Solution {
	    public String solution(int a, int b) {
	        int[] arr = {0,31,60,91,121,152,182,213,244,274,305,335};
	        int sum = arr[a-1] + b;
	        String answer = "";
	        switch(sum%7){
	            case 0:
	                answer = "THU";
	                break;
	            case 1:
	                answer = "FRI";
	                break;
	            case 2:
	                answer = "SAT";
	                break;
	            case 3:
	                answer = "SUN";
	                break;
	            case 4:
	                answer = "MON";
	                break;
	            case 5:
	                answer = "TUE";
	                break;
	            case 6:
	                 answer = "WED";                
	                break;    
	        }
	        return answer;
	    }
	}
}
```

## 문제 풀이

직전달 일수를 담고 있는 배열 arr을 만들어준다. 1월은 직전달이 없기 때문에 0일이고, 2월의 경우에는 1월의 일수인 31일, 이런식으로 증가한다.

그 다음에 일수를 더한 후, 7로 나누어준다. 

7을 나눴을 때 나머지를 기준으로 0이면 목 1이면 금 이런식 으로 진행한다.

