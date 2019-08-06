// https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    
    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {

        Map<Integer, Integer> values = new HashMap<>();
        int key = 1;

        for (int value : cost) {
            values.put(value, key++);
        }

        key = 1;
        for(int value : cost){
           int diff = money - value;
           if(isPurchase(diff,values, key)){
               System.out.println(key + " "+ values.get(diff));
               return;
           }
           key++;
        }
    }

    private static boolean isPurchase(int diff, Map<Integer,Integer> values, int key) {
        return diff > 0 && values.containsKey(diff)&& values.get(diff) != key;
    }
    
    
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money); 
        }

        scanner.close();
    }
}
