// https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem

import java.util.*;

public class Solution {

 
    public static int fibonacci(int n) {
    	if(n<=1) return n;
    	else return fibonacci(n-2) +fibonacci(n-1) ;

        // Complete the function.
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
