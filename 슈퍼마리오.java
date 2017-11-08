// https://www.acmicpc.net/problem/2851

import java.util.*; 
public class Main {
 

	public static void main(String[] args){ 

		Scanner sc = new Scanner(System.in);
		int testCase = 10;
		int result = 0;
		
		while(testCase-- > 0 ){
			int mushroom = sc.nextInt();
      
			if(checkPoints(mushroom, result)){
				result +=mushroom;
			}
			else{
				break;
			}
		}
    
		System.out.print (result);
	}

	private static boolean checkPoints(int mushroom, int result) {
		// TODO Auto-generated method stub
	
		int cmp1 = ((100 -(result)) >= 0) ?(100 - (result)) :((100-result) *-1 );
		int cmp2 = ((100 -(result+mushroom)) >= 0)? (100 - (result + mushroom)) :((100 -(result+mushroom)) *-1 );

		 
		if(cmp1 >=cmp2){
			return true;
		}
		
		return false;
	} 
}	
