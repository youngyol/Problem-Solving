// https://www.acmicpc.net/problem/2941

import java.util.*; 
public class Main {
 

	public static void main(String[] args){ 
		
		Scanner sc = new Scanner(System.in);
		String[] croatiaAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		StringBuilder targetStr = new StringBuilder(sc.nextLine());
		int alphabetCnt = 0;
		
		for(String checkAlphabet : croatiaAlphabets){

			while(targetStr.indexOf(checkAlphabet) != -1){
				int length = checkAlphabet.equals("dz=")? 3:2;
				targetStr = targetStr.replace(targetStr.indexOf(checkAlphabet), targetStr.indexOf(checkAlphabet)+length, " " );
				alphabetCnt++;
			}
		}
		String result = targetStr.toString().replaceAll(" ", "");
		
		System.out.println(alphabetCnt+result.length() );
	}	
}
