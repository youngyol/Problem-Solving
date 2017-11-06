// https://www.acmicpc.net/problem/2908


import java.util.*;
public class Main {
 

	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);

    StringBuilder sentence = new StringBuilder();
    sentence.append(sc.nextLine());
    sentence.reverse();
    
		int leftNum = Integer.parseInt(sentence.toString().split(" ")[0]);
		int rightNum = Integer.parseInt(sentence.toString().split(" ")[1]);
		
		System.out.println((leftNum > rightNum)?leftNum :rightNum);
		
		
	}
 
}
