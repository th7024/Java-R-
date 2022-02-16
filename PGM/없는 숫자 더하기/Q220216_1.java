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
