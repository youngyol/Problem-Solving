// https://programmers.co.kr/learn/challenge_codes/112

public class StrToInt {
    public int getStrToInt(String str) {
				int answer = 0;
        int minusFlag = 1;
      	int start = 0;
      	int size = str.length();
      	
      	if(str.charAt(0) == '-'){
        	minusFlag = -1;
          start = 1;
        }
      
      	for(int i  = start; i < size; i++)
          answer = (answer * 10) + (str.charAt(i) - '0');
      
        return answer * minusFlag;
    }
    //아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}
