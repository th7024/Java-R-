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
