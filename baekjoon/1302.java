// https://www.acmicpc.net/problem/1302

import java.util.*;

public class Main {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ValueComparator bvc = new ValueComparator(map);
		Map<String, Integer> sortedMap = new TreeMap<String, Integer>(bvc);
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		sc.nextLine();

		while (testCase-- > 0) {
			String book = sc.nextLine();
			if (map.containsKey(book)) {
				map.replace(book, map.get(book) + 1);
			} else {
				map.put(book, 1);
			}
		}

		sortedMap.putAll(map);

		Iterator<String> treeMapReverseIter = sortedMap.keySet().iterator();
		System.out.println(treeMapReverseIter.next());
		 

	}

}

class ValueComparator implements Comparator<String> {
	Map<String, Integer> base;

	public ValueComparator(Map<String, Integer> base) {
		this.base = base;
	}
 
	public int compare(String a, String b) {
		if (base.get(a) > base.get(b)) {
			return -1;
		}
		else if(base.get(a) ==  base.get(b)){
			if(a.compareTo(b) > 0 ){
				return 1;
			}
			else 
				return -1;
			
		}
		else {
			return 1;
		}  
	}
}
