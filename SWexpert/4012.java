// https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWIeUtVakTMDFAVH&categoryId=AWIeUtVakTMDFAVH&categoryType=CODE

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
   static boolean[] visited;
   static List<List<Integer>> condition;
   static int score=0;
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int idx = 1;
		int testCase = sc.nextInt();
		while(testCase-->0) {
            score=0;
			int N = sc.nextInt();
			int[][] arr = new int [N+1][N+1];
			
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) { 
					arr[i][j] =sc.nextInt();
				}
			} 
	 
			int p = N/2;
	        condition = new ArrayList<>();
	        combine(p,0,new ArrayList<>(), 1);
	        
	        int len = condition.size()-1;
	        int min =Integer.MAX_VALUE;
	        
	        for(int i=0; i<len; i++) { 
	            visited = new boolean[condition.get(0).size()];
	            
	            score=0;
	    		permute(0,new ArrayList<>(), 0,condition.get(i),arr);
	    		int cookA = score; 

	    		score = 0;
	    		permute(0,new ArrayList<>(), 0,condition.get(len-i),arr);
	     		int cookB = score;
	     		
 				int sub = cookA-cookB;	
	     		min = Math.min(min, Math.abs(sub)); 
	        }
			
	 
	        System.out.println("#"+idx+++" " +min);
		}
	}
	
	private static void combine(int len, int cnt, List<Integer> tmp, int idx){
		if(len==cnt) {
			condition.add(new ArrayList<>(tmp));
		} else {
			for(int i= idx; i<=len*2; i++) {
	            tmp.add(i);
	            combine(len, cnt + 1, tmp, i+1);
	            tmp.remove(tmp.size() - 1);
			}
		}
	}
	
	private static void permute(int cnt, List<Integer> tmp, int idx, List<Integer> origin, int[][] arr) {
		if(2==cnt) { 
 			score +=arr[tmp.get(0)][tmp.get(1)];
		} else { 
			int len = origin.size();
            for (int i = 0; i < len; i++){
                if(!visited[i]) {
    	            tmp.add(origin.get(i));
                    visited[i] =true;
    	            permute(cnt + 1, tmp, i+1, origin,arr);
                    visited[i] =false;
                    tmp.remove(tmp.size()-1);
                }  
		}
		}
	}
}
