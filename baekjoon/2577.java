//  https://www.acmicpc.net/problem/2577

import java.math.*;
import java.util.*;
public class Main {
static int [] digitCountArr;

    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	int numberA = sc.nextInt();
    	int numberB = sc.nextInt();
    	int numberC = sc.nextInt();
    	int multiplyResult = numberA*numberB*numberC;
    	digitCountArr = new int[10];
    	
        Arrays.fill(digitCountArr,0);
        while(multiplyResult > 0){
        	int tmp = multiplyResult % 10;
        	digitCountArr[tmp]++;
        	multiplyResult /= 10;
        }
        for(int cntForDigit :digitCountArr){
        	System.out.println(cntForDigit);
    	}
    }
 

	 
}




 
