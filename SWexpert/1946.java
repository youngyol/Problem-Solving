import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by nasos on 2018-04-09.
 */
public class Solution {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());
        int num = 1;
        
        while (testCase-- > 0) {
            System.out.println("#" + num++);
            int compressedCharCnt = Integer.parseInt(br.readLine());
            int token = 0;
            
            while (compressedCharCnt-- > 0) {
                st = new StringTokenizer(br.readLine());
                String character = st.nextToken();
                int cnt = Integer.parseInt(st.nextToken());

                for (int i = 0; i < cnt; i++) {
                    System.out.print(character);
                    token++;
                    if (token == 10) {
                        token = 0;
                        System.out.println();
                    }

                }

            }           
            System.out.println();


        }
    }


}
