// https://programmers.co.kr/learn/challenge_codes/125

public class GetMinMaxString {
    public String getMinMaxString(String str) {
      	int max, min ;
      	String [] array = str.split(" ");
      
      	max = min = Integer.parseInt(array[0]);
      
      	for( String num : array ) {
            int numInArray = Integer.parseInt(num); 
        		max = (numInArray  >=  max) ? numInArray : max;
        		min = (min >=  numInArray) ? numInArray : min;
        }	
      
        return min + " " + max;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}
