// https://www.acmicpc.net/problem/5532

import java.util.*;


public class Main {  
	 	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vacation = sc.nextInt();
		int koreanHw = sc.nextInt(), mathHw = sc.nextInt();
		int koreanHwPerDay = sc.nextInt(), mathHwPerDay = sc.nextInt();
		
		int homeworkDay= 0;

    if(koreanHw/koreanHwPerDay > mathHw/mathHwPerDay){
			homeworkDay = (koreanHw%koreanHwPerDay == 0)?koreanHw/koreanHwPerDay:((koreanHw/koreanHwPerDay)+1);
		} else {
			homeworkDay = (mathHw%mathHwPerDay == 0)?mathHw/mathHwPerDay:((mathHw/mathHwPerDay)+1);	
		}
		
		System.out.println((vacation - homeworkDay > 0)?vacation - homeworkDay : "0");
	}

}
