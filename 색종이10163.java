// https://www.acmicpc.net/problem/10163

import java.util.*;

public class Main {

	public static void main(String[] args){ 
		
		int [][] paper = new int[102][102]; 
		int color = 1;
		Scanner sc = new Scanner(System.in);
		int numOfColored = sc.nextInt(); 
		int size = numOfColored;
		
		
		while(numOfColored-- > 0 ){

			int startX = sc.nextInt();
			int startY = sc.nextInt();		

			int width = sc.nextInt();
			int height = sc.nextInt();		
			
			for(int i = startY; i <startY + height; i++){
				for(int j =startX; j <startX + width; j++){
					paper[i][j] = color;
				}
			}
			color++;
			
		}
		
		
		ArrayList<Integer> area = new ArrayList<>();
 
		color = 1; 
		while(size-- > 0){  
			int result = 0;
			for(int i = 0; i <102; i++){
				for(int j =0; j <102; j++){
					if(paper[i][j] == color )result++;
				}
			}
			area.add(result);
			color++;
		}
		
		for(int answer : area) System.out.println(answer);
	  

	}

}
