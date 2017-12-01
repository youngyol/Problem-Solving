// https://www.acmicpc.net/problem/10984

import java.util.*;
public class Main {
 

	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		int semester = sc.nextInt(); 
		
		while(semester-- > 0){
			int numOfSubject = sc.nextInt();
			int numForDivide = numOfSubject;
			int credit = 0;
			double grade = 0 , sum = 0;
			while(numOfSubject-- > 0){
				int tmpCredit = sc.nextInt();
				grade = sc.nextDouble();
				sum += (double)tmpCredit * grade; 
				credit += tmpCredit;
			}
			System.out.printf(credit + " " +"%.1f\n", (float)sum/credit);
		}

	

	}
 
}
