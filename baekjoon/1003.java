// https://www.acmicpc.net/problem/1003


import java.util.Scanner;

public class Main {
	
	static int cntOne = 0;
	static int cntZero = 0;
	public static void fibonacci(int n) {
	    if (n==0) {
	        cntOne ++;
	    } else if (n==1) {
	    	cntZero ++;
	    } else {
	    	fibonacci(n-1);
	        fibonacci(n-2);
	    }
	}
	public static void main(String[] args){
		int cnt, tmp;
		Scanner scan = new Scanner(System.in); 

		cnt = scan.nextInt();
		for(int i = 0 ; i < cnt;){
			 tmp = scan.nextInt();
			 if (tmp <= 40 && tmp >= 0) {
				 fibonacci(tmp);
				 i++ ;
			 }
			 else continue;
			 System.out.println(cntOne+" "+cntZero);
			 cntOne = 0;
			 cntZero = 0;
		}
			
		
		
	}
}
