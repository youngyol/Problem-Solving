// https://www.hackerrank.com/challenges/ctci-ransom-note/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		HashMap<String, Integer> magazine = new HashMap<String, Integer>();

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < num1; i++) {
			String tmp = sc.next();
			if (magazine.containsKey(tmp)) {
				magazine.replace(tmp, magazine.get(tmp) + 1);
			} else {
				magazine.put(tmp, 1);
			}
		}
    
		for (int i = 0; i < num2; i++) {
			String tmp = sc.next();
			if (magazine.containsKey(tmp) && magazine.get(tmp) > 0) {
				magazine.replace(tmp, magazine.get(tmp) -1);
			} else {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "Yes" : "No");

	}
}
