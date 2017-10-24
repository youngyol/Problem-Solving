// https://www.acmicpc.net/problem/2864

import java.io.IOException; 
import java.util.Scanner; 
public class Main { 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int min,max ;
		String num1 = sc.next();
		String num2 = sc.next();
		
		min = Integer.parseInt(num1.replace('6', '5')) +  Integer.parseInt(num2.replace('6', '5')) ;
		max = Integer.parseInt(num1.replace('5', '6')) +  Integer.parseInt(num2.replace('5', '6')) ;
	
		System.out.println(min+" "+max);
	}
}
