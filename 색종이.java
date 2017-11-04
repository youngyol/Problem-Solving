// https://www.acmicpc.net/problem/2563
 
import java.util.*;
public class Main {
 

	public static void main(String[] args){ 
		int [][] paper = new int[100][100]; 
		Scanner sc = new Scanner(System.in);
		int numOfColored = sc.nextInt();
		int area = 0;
		while(numOfColored-- > 0 ){

			int x = sc.nextInt();
			int y = sc.nextInt();		
			
			for(int i = x; i < x+10; i++){
				for(int j =y; j <y+10; j++){
					paper[i][j] = 1;
				}
			}
			
		}

		for(int i = 0; i <100; i++){
			for(int j =0; j <100; j++){
				if(paper[i][j]  == 1) area++;
			}
		}
		 
		
		System.out.println(area);

	}
 
}
