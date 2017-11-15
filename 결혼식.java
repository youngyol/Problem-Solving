// https://www.acmicpc.net/problem/5567

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numOfFriends = sc.nextInt();
		int numOfRelations = sc.nextInt();
		boolean[] vistedFriends = new boolean[numOfFriends+1];

		int numOfVisted = 0;

		ArrayList<ArrayList<Integer>> relation = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i <= numOfFriends; i++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			relation.add(tmp);
		}

		while (numOfRelations-- > 0) {
			int left = sc.nextInt(), right = sc.nextInt();
			relation.get(left).add(right);
			relation.get(right).add(left);
		}

		vistedFriends[1] = true;
		Queue<Integer> q = new LinkedList<Integer>();
	 
		q.add(1);
		while (!q.isEmpty()) {
			int tmp = q.peek();
			for (int i : relation.get(q.poll())) {
				if (!vistedFriends[i]) {
					if(tmp == 1) q.add(i);
					vistedFriends[i] = true;
					numOfVisted++;
				}
			}
		}
		
		System.out.println(numOfVisted);

	}

}
