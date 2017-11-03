//  https://www.acmicpc.net/problem/2577
 
import java.math.*;
import java.util.*;
public class Main {
static int [] digitCountArr;

    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	String numberA = sc.nextLine();
    	String numberB = sc.nextLine();
    	String numberC = sc.nextLine();
    	BigInteger multiplyResult = new BigInteger(numberA).multiply(new BigInteger(numberB)).multiply(new BigInteger(numberC));
    	digitCountArr = new int[10];
    	
        Arrays.fill(digitCountArr,0);
    	for(char digit : multiplyResult.toString().toCharArray()){
    		countDigit(digit);
    	}

    	for(int cntForDigit :digitCountArr){
        	System.out.println(cntForDigit);
    	}
    }

	private static void countDigit(char digit) {
		// TODO Auto-generated method stub
		digitCountArr[Integer.parseInt(digit+"")]++;
	}	

	 
}
