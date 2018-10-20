// https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5V61LqAf8DFAWu



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        for(int tc = 1; tc<=t; tc++){
             int n,m,homeCnt=0, range = 0;
             n=sc.nextInt();
             m=sc.nextInt();

             List<Points> home;
             home = new ArrayList<>();
             for(int i=0; i<n; i++) {
                 for(int j=0; j<n; j++) {
                      if(sc.nextInt()==1) home.add(new Points(i,j));
                 }
             }

             for(int i=0; i<n; i++) {
                 for(int j=0; j<n; j++) {
                     int k=0;
                     while(true) {
                         int cnt=0;
                         for(Points h : home) {
                             int dist = distance(i,j,h.x,h.y); 
                             if(dist <= k ) cnt++; 
                         }
                         k++;
                         if(calProfit(k,m,cnt)>=0)
                             homeCnt = (homeCnt < cnt)?cnt:homeCnt;  
                         if(k>n) break;
                     } 
                 }
             }
             System.out.println("#"+tc+" "+homeCnt);
        }
	}
	private static int distance(int x, int y, int x1, int y1) {
		return Math.abs(x-x1)+Math.abs(y-y1);
	}
	private static int calK(int k ) {
		return (k*k)+((k-1)*(k-1));
	}
	private static int calProfit(int k, int m, int homeCnt) {
		return m*homeCnt-calK(k);
		
	}
}



class Points{
	int x;
	int y;
	public Points(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
