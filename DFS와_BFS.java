// https://www.acmicpc.net/problem/1260

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main { 
	
    static ArrayList<Integer>[] graph;
    static boolean[] check;
    
    

	private static void dfs(int start) {
		// TODO Auto-generated method stub 
		if(check[start]) return;
		check[start] = true;
		System.out.print(start+" ");
		
		for(int y : graph[start])
			if(!check[y]) dfs(y);
	
	}
	private static void bfs(int start) {
		// TODO Auto-generated method stub
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
		check[start] =true;
		while(!q.isEmpty()){
			int x = q.remove();
			System.out.print(x+" ");
		    for (int y : graph[x]) {
                if (check[y] == false) {
                    check[y] = true;
                    q.add(y);
                }
            }	
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int edge1,edge ;
		int N = sc.nextInt();
		int M = sc.nextInt();
		int start = sc.nextInt();
		
        graph = (ArrayList<Integer>[]) new ArrayList[N+1];
        for (int i=1; i<=N; i++) {
            graph[i] = new ArrayList<Integer>();
        }
	
		for(int i = 0; i < M; i++){
			edge1 = sc.nextInt();
			edge= sc.nextInt();
			graph[edge].add(edge1);
			graph[edge1].add(edge);
		}
		

        for (int i=1; i<=N; i++) {
            Collections.sort(graph[i]);
        }
        
        check = new boolean[N+1];
        dfs(start);
        System.out.println();
        check = new boolean[N+1];
        bfs(start);
        System.out.println();
	}
}
