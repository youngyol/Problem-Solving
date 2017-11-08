// https://www.acmicpc.net/problem/2935

import java.math.BigInteger;
import java.util.*; 
public class Main {
 

	public static void main(String[] args){ 

		Scanner sc = new Scanner(System.in);
		String number1 = sc.nextLine();
		String operator = sc.nextLine();
		String number2 = sc.nextLine();
	
		BigInteger A = new BigInteger(number1);
		BigInteger B = new BigInteger(number2);
			
		
		System.out.print(operator.equals("*")? A.multiply(B) : A.add(B) );
		
	}
 
}	
