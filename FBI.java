// https://www.acmicpc.net/problem/2857

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> idxFbi = new ArrayList<Integer>();

		for (int i = 1; i <= 5; i++) {
			if (sc.nextLine().contains("FBI")) {
				idxFbi.add(i);
			}
		}

		if (idxFbi.isEmpty()) {
			System.out.print("HE GOT AWAY!");
		} else {
			for (int idx : idxFbi) {
				System.out.print(idx + " ");
			}
		}

	}
}
