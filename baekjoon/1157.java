// https://www.acmicpc.net/problem/1157


import java.util.*;
public class Main {
 

	public static void main(String[] args){ 
		int [] alphabetCnt = new int[27];
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine().toUpperCase(); 
		for(char one : sentence.toCharArray()){
			alphabetCnt[one-'A']++;
		}
		
		int flag = 0, max = 0,position = 0 ;
		for(int i = 0; i < 26; i++){
			if(alphabetCnt[i] > max && alphabetCnt[i] != max ){
				max = alphabetCnt[i];
				flag = 0;
				position = i;
			}
			if(alphabetCnt[i] == max ){
				flag++;
			}
			
		}	
		System.out.printf("%c",flag!=1?'?':'A'+ position);
		
	}
 
}
