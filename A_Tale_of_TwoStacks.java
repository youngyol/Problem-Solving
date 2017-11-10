// https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
    
    private static class MyQueue<T> {
		private Stack<T> st1;
		private Stack<T> st2;

		public MyQueue() {
			super();
			st1 = new Stack<T>();
			st2 = new Stack<T>();
		}

		public T peek() {
			// TODO Auto-generated method stub
			check();
			return st2.peek();
		}

		public void enqueue(T nextInt) {
			// TODO Auto-generated method stub
			st1.push(nextInt);

		}

		public T dequeue() {
			// TODO Auto-generated method stub
			check();
			return st2.pop();
		}

		private void check() {
			if (st2.isEmpty()) {
				while (!st1.isEmpty()) {
					st2.push(st1.pop());
				}
			}
		}
	}
}
