// https://www.acmicpc.net/problem/10942

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numSize = sc.nextInt();

		int[] digits = new int[numSize + 1];

		for (int i = 1; i <= numSize; i++) {
			digits[i] = sc.nextInt();
		}

		int testCase = sc.nextInt();
		while (testCase-- > 0) {
			System.out.println(isPalindrome(sc.nextInt(), sc.nextInt(), digits) ? "1" : "0");
		}

	}

	private static boolean isPalindrome(int start, int end, int[] digits) {
		while (start < end) {
			if (digits[start++] != digits[end--]) {
				return false;
			}
		}
		return true;
	}

}
