// https://www.acmicpc.net/problem/11724

 
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int node = sc.nextInt(), edge = sc.nextInt();
		boolean[] vistedNode = new boolean[node+1];
		int cntOfConnection = 0;


		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i <= node; i++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			graph.add(tmp);
		}

		while (edge-- > 0) {
			int u = sc.nextInt(), v = sc.nextInt();
			graph.get(u).add(v);
			graph.get(v).add(u);
		}

		Queue<Integer> q = new LinkedList<Integer>();
	 
		
		for(int i = 1; i <= node; i++){
			if(!vistedNode[i]){
				vistedNode[i] = true;
				q.add(i);
				cntOfConnection++;
				
				while (!q.isEmpty()) { 
					for (int tmp : graph.get(q.poll())) {
						if (!vistedNode[tmp]) {
							q.add(tmp);
							vistedNode[tmp] = true;
						}
					}
				}
				
				
			}
		}
		 
		
		System.out.println(cntOfConnection);

	}

}
