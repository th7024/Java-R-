import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1759 {
	static int N,C;
	static char[] str;
	static boolean[] ch;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); //암호 개수
		C = sc.nextInt(); //단어 개수
		str = new char[C];
		ch = new boolean[C];
		for(int i=0;i<C;i++) {
			str[i]=sc.next().charAt(i);
		}
		Arrays.sort(str);
		find(0,0);
		
	}
	
	static void find(int start,int cnt) {
		if(cnt==N) {
			int mo = 0;
			int ja = 0;
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<C;i++) {
				if(ch[i]) {
					sb.append(str[i]);
					
					if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u') {
						mo++;
					}else {
						ja++;
					}			
				}
			}
			if(mo>=1 && ja>=2) System.out.println(sb);
		
		}
		//백트래킹
		for(int i=start;i<C;i++) {
			ch[i]=true;
			find(i+1,cnt+1);
			ch[i]=false;
		}
	}

}
