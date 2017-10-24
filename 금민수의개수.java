// https://www.acmicpc.net/problem/1527

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Queue <BigInteger>q = new LinkedList<BigInteger>();
		int cnt =0;
		Scanner sc = new Scanner(System.in);

		BigInteger min  = sc.nextBigInteger();
		BigInteger max  = sc.nextBigInteger();
		 
		q.offer(BigInteger.valueOf(4));
		q.offer(BigInteger.valueOf(7));
 
		
		do {
			BigInteger tmp = q.peek();
			q.poll();
			 
			BigInteger number = new BigInteger(tmp.toString()+"4");
			BigInteger number2 = new BigInteger(tmp.toString()+"7");

			q.offer(number);
			q.offer(number2);
			
			if (max.compareTo(tmp) == -1) break;
			if ((( min.compareTo(tmp) == 0) ||   (min.compareTo(tmp) == -1  ))
					&& (( tmp.compareTo(max) == 0) ||   (tmp.compareTo(max) == -1  ))){
				cnt++; 
			}
		} while (true);


		System.out.println(cnt); 
	} 
	
	
}

 
