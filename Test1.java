package tuozhan;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {
	//5.String s = "sdfkhew24353dsvifsougfouu"; 计算每个字符出现的次数，通过两种方式遍历Map
	public static void main(String[] args) {
		String s = "sdfkhew24353dsvifsougfouu";
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(!map.containsKey(c)){
				map.put(c, 1);
			}else {
				int num = map.get(c)+1;
				map.put(c, num);
			}
		}
		
		Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet) {
			Character key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + "出现" + value + "次");
		}
	}
}
