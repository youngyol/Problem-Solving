// https://www.acmicpc.net/problem/2902

import java.io.IOException; 
import java.util.Scanner; 
public class Main { 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] arr = str.split("-");
		for(String tmp : arr){
			System.out.print(tmp.charAt(0));
		}
	}
	  
	   
	   
}
