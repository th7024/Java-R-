package Programmers;
import java.util.ArrayList;
// ũ���� �����̱� ����
public class Q220217_1 {
	class Solution {
	    public int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        ArrayList<Integer> q = new ArrayList<Integer>();
	        for(int i=0;i<moves.length;i++){
	            for(int j=0;j<board.length;j++){
	                int num = board[j][moves[i]-1];
	                if(num!=0){
	                    if(q.size()==0){
	                        q.add(num);
	                        board[j][moves[i]-1] = 0;
	                        break;
	                    }
	                    else{
	                        if(num==q.get(q.size()-1)){
	                            q.remove(q.size()-1);
	                            board[j][moves[i]-1] = 0;
	                            answer+=2;
	                            break;
	                        }
	                        else{
	                            q.add(num);
	                            board[j][moves[i]-1] = 0;
	                            break;
	                        }
	                    }
	                }
	            }
	        }
	        return answer;
	    }
	}
}
