package day6;

import java.util.Scanner;

public class Q11726 {
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		if(n<3) {
			n %=10007;
			System.out.println(n);
		}
		else {			
			int pren = 1,nexn=2,temp=0;
			for(int i=2;i<n;i++) {
				temp = pren + nexn ; 
				temp %=10007;				
				pren = nexn;
				nexn = temp;
			}
			System.out.println(temp);
		}

	}
}
