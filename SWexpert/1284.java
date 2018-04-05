// https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV189xUaI8UCFAZN&categoryId=AV189xUaI8UCFAZN&categoryType=CODE#

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int P; //  A사 : 1리터당 P원의 돈을 내야 한다.
        int Q, R, S; //B사 : 기본 요금이 Q원이고, 월간 사용량이 R리터 이하인 경우 요금은 기본 요금만 청구된다. 하지만 R 리터보다 많은 양을 사용한 경우 초과량에 대해 1리터당 S원의 요금을 더 내야 한다.
        int W; // 종민이가 사용하는 수도양

        int a = 0, b = 0, num = 1;
        while (testCase-- > 0) {
            P = sc.nextInt();
            Q = sc.nextInt();
            R = sc.nextInt();
            S = sc.nextInt();
            W = sc.nextInt();


            a = P * W;
            b = (R >W )? Q : Q + ((W - R) * S);

            System.out.println("#" + (num++) + " " + Math.min(a, b));
        }
    }


}
