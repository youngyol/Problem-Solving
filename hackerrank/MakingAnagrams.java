// https://www.hackerrank.com/challenges/ctci-making-anagrams/problem

import java.util.*;

public class Main {
	public static int numberNeeded(String first, String second) {
		int [] alphabetsNum1 = new int[26];
		int [] alphabetsNum2 = new int[26];
		
		if(first.length() > second.length()){
			for(char alphabet : first.toCharArray()){
				alphabetsNum1[alphabet-'a']++;
			}

			for(char alphabet : second.toCharArray()){
				alphabetsNum2[alphabet-'a']++;
			}
		}
		else{
			for(char alphabet : second.toCharArray()){
				alphabetsNum1[alphabet-'a']++;
			}

			for(char alphabet : first.toCharArray()){
				alphabetsNum2[alphabet-'a']++;
			}
		}
		int answer = 0;
		for(int i=0; i<26; i++){
			answer += (alphabetsNum2[i] -alphabetsNum1[i])>0?alphabetsNum2[i] -alphabetsNum1[i]:((alphabetsNum2[i] -alphabetsNum1[i])*-1);
		}
		
		
		return answer;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}
