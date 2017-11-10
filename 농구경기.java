// https://www.acmicpc.net/problem/1159

import java.util.*;

public class Main {  
	 	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		boolean none = true;
		
		sc.nextLine();
		int [] alphabets = new int[26];
		
		while(testCase-- > 0){
			alphabets[sc.nextLine().toCharArray()[0]-'a']++;
		}
		for(int i = 0; i < 26; i++){
			if(alphabets[i]>= 5) {
				System.out.print((char)('a'+i));
				none = false;
			}
		}
		if(none) System.out.println("PREDAJA");
	}

}
