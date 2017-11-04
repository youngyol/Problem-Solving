// https://www.acmicpc.net/problem/10798

import java.util.*;
public class Main {
 

	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		int testcase = 0; 
		int maxSize = 0;
		String [] table = new String[5];
		
		while(testcase < 5){
			table[testcase] =  sc.nextLine();
			maxSize = table[testcase].length()>maxSize?table[testcase].length():maxSize;
			testcase++;
		}

		for(int i = 0 ; i < maxSize; i++){
			int num = 0;
			while(num < 5){
				if(table[num].length() > i)
					System.out.print(table[num].charAt(i));
				num++;
			}
		}

	}
 
}
