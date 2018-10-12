// https://www.acmicpc.net/problem/15686

import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;

public class Main {
	private static List<Point> chickens;
	private static List<Point> houses;
	private static int K=0;
	private static int minDist=Integer.MAX_VALUE;

	public static void main(String[] args) {
		init();
		combination(0,0,new ArrayList<>());
		System.out.println(minDist);
	}
	
	private static void init() {	
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		K=sc.nextInt(); 
		chickens = new ArrayList<>();
		houses = new ArrayList<>();
		
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				switch(sc.nextInt()) {
				case 1:  
					houses.add(new Point(i,j));
					break;
				case 2:
					chickens.add(new Point(i,j));
					break;
				default :
					break;
				}
				
			}
		}

		
	}

	private static void combination( int cnt, int idx, List<Point> tmp) {
        if (cnt == K) {
            int minTmp = calculateDist(tmp); 
            minDist = (minDist > minTmp)? minTmp:minDist;
            return;
        }
        
        int len = chickens.size();
        for (int i = idx; i < len; i++) {
            tmp.add(chickens.get(i));
            combination(cnt + 1, i + 1, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
	
	private static int calculateDist(List<Point> chickensTmp) {
		int result = 0;

		for(Point house : houses) {
			int dist=Integer.MAX_VALUE;
			for(Point chicken : chickensTmp) {
				int tmpDist=distance(chicken,house);
				dist=(dist>tmpDist)?tmpDist:dist;
			}
			result+=dist;
		}
		return result;
	}

	private static int distance(Point a, Point b) {
		return Math.abs(a.x-b.x)+Math.abs(a.y-b.y); 
	}
}


class Point{
	  int x;
	  int y;
	  int dist;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
}

