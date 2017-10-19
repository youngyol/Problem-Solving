// https://www.acmicpc.net/problem/1764

package simple_project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
 
	public static void main(String[] args){
		 int N ,M , cnt = 0;
		 Scanner sc = new Scanner(System.in);
		 
		 N = sc.nextInt(); M = sc.nextInt(); 
		 sc.nextLine();
		 Set <String> answer  = new HashSet<String> ();

		 ArrayList<String> result  = new ArrayList<String>();;
		 while(N-- > 0){
			 String name = sc.nextLine();
			 answer.add(name);
		 } 
		 while(M-- > 0){
			 String name = sc.nextLine();
			 if(answer.contains(name)) {
				 cnt++;
				 result.add(name);
			 }
		 }
		 System.out.println(cnt); 
		 Collections.sort(result);

		 for(String person : result)
			 System.out.println(person);
	}		

}
