// https://www.acmicpc.net/problem/10826

import java.math.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<BigInteger> fibo = new ArrayList<BigInteger>();
        if (n == 0) {
            System.out.println("0");
        } else if (n == 1) {
            System.out.println("1");
        } else {
        	fibo.add(BigInteger.ZERO);
        	fibo.add(BigInteger.ONE); 
            BigInteger a = BigInteger.ZERO;
            BigInteger b = BigInteger.ONE;
            BigInteger c = BigInteger.ZERO;
            for (int i=2; i<=n; i++) {
                c= fibo.get(i-2).add(fibo.get(i-1));
                fibo.add(c); 
            }
            System.out.println(c);
        }
    }
}

 
