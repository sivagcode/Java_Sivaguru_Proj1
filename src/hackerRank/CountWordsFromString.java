package hackerRank;

import java.util.HashMap;

public class CountWordsFromString {

	public static void main(String[] args) {
		String str = "This this is is done by Saket Saket";
		String[] split = str.split(" ");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int len = split.length;
		for(int i=0; i<len-1; i++) {
			if(map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count+1);
			}
			else {
				map.put(split[i], 1);
			}
			System.out.println(map);
			}
		}
}
