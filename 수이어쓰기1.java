// https://www.acmicpc.net/problem/1748

import java.util.*; 
public class Main {
 

	public static void main(String[] args){ 

		Scanner sc = new Scanner(System.in);
		int[] digits = new int[] { 0, 9, 90, 900, 9000, 90000, 900000, 9000000, 90000000 };
		String targetNum = sc.next();

		long sum = 0;
		for (int i = 1; i < targetNum.length(); i++){
			sum += digits[i] * i;
		}
		sum += (Integer.parseInt(targetNum) - (int) Math.pow(10, targetNum.length() - 1) + 1) * targetNum.length();
		
		System.out.print(sum);
	} 
}	
