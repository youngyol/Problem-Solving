import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Solution {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        int testCase = Integer.parseInt(br.readLine());
        int num = 1;


        while (testCase-- > 0) {

            System.out.print("#" + num++ + " ");
            int sum	=0;
            String[] numList = br.readLine().split(" ");
            for (String number : numList) {
                sum +=Integer.parseInt(number);
             }
            Double result = sum/10.0;

            System.out.printf("%.0f\n", result);


        }
    }


}
