package Programmers;
//2016³â
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
