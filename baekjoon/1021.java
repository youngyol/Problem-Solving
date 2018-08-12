// https://www.acmicpc.net/problem/1021

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String...args){

        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt(), M= sc.nextInt();
        Deque<Integer> dq = new LinkedList<>();

        int cnt = 0;
        for(int i=1; i<=N; i++)
            dq.add(i);

        for(int i=0; i<M; i++){
            int pick = sc.nextInt();
            int curIdx = ((LinkedList<Integer>) dq).indexOf(pick);


            int left = curIdx;
            int right = dq.size()-curIdx-1;

            while(true){
                if(pick == dq.getFirst()) {
                    dq.pollFirst();
                    break;
                }

                if(left <= right){
                        dq.addLast(dq.pollFirst());
                        cnt++;
                }else{
                        dq.addFirst(dq.pollLast());
                        cnt++;
                }
            }


        }
        System.out.println(cnt);
    }
}
