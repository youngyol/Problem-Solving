// https://www.acmicpc.net/problem/5218

import java.util.*;
public class Main {
 

	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		int testcaseNum = sc.nextInt();
		sc.nextLine();
		
		while(testcaseNum-- > 0){
			String sentence = sc.nextLine();
			int dist = 0;
			
			char[] leftStr = sentence.split(" ")[0].toCharArray();
			char[] rightStr = sentence.split(" ")[1].toCharArray();
			
			System.out.print("Distances: ");
			for(int i = 0; i < leftStr.length; i++){
				System.out.print(((rightStr[i]>=leftStr[i])?rightStr[i]-leftStr[i] :26+(int)(rightStr[i]-leftStr[i]))  + " ");				
			}

			System.out.println("");
		}
		 
		
		
	}
 
}
