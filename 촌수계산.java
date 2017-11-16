// https://www.acmicpc.net/problem/2644

package solving_problem;
 
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean find = false;
		int phase = 0;

		int numOfPerson = sc.nextInt();
		int start = sc.nextInt(), target = sc.nextInt();
		int relations = sc.nextInt();

		boolean[] vistedPerson = new boolean[numOfPerson + 1];

		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i <= numOfPerson; i++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			graph.add(tmp);
		}

		while (relations-- > 0) {
			int u = sc.nextInt(), v = sc.nextInt();
			graph.get(u).add(v);
			graph.get(v).add(u);
		}

		Queue<Integer> q = new LinkedList<Integer>();

		q.add(start);
		int q_size = 0;

		while (!q.isEmpty()) {
			q_size = q.size();
			int tmp = q.peek();
			while (q_size-- > 0) {
				for (int i : graph.get(q.poll())) {
					if (!vistedPerson[i]) {
						q.add(i);
						vistedPerson[i] = true;
						if (i == target) {
							find = true; 
						}
					}
				}
			}
			phase++;
			if(find) break; 
		}

		  phase = find ? phase : -1;

		System.out.println(phase);

	}

}
