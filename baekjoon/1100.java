// https://www.acmicpc.net/problem/1100

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOnWhite = 0;
		int time = 0;
		while (time < 8) { 
			char[] oneLine = sc.next().toCharArray();
			for (int i = time % 2 ; i < 8; i += 2) {
				numOnWhite += (oneLine[i] == 'F') ? 1 : 0;
			}
			time++;
		}
		System.out.println(numOnWhite);

	}
}
