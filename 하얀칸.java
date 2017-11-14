// https://www.acmicpc.net/problem/1100

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOnWhite = 0; 
		int time = 1;
		while(time <= 8){
			int startSearch = (time%2 == 0)?1:0;
			char[] oneLine = sc.next().toCharArray();
			for(int i = startSearch; i <8; i+=2){
				numOnWhite += (oneLine[i]== 'F')?1:0;
			}
			time++;
		}
		System.out.println(numOnWhite);
		
	}
}
