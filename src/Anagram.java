import java.util.HashMap;
import java.util.Map;

public class Anagram {
	
	boolean isAnagram(String s1,String s2) {
		
		if(s1.isEmpty() || s2.isEmpty()) {
			return false;
		}
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		char c1[] =s1.toCharArray();
		
		char c2[]=s2.toCharArray();
		
		Map <Character, Integer> hm=new HashMap<Character, Integer>();
		

		for(int i=0;i<s1.length();i++) {
			hm.put(c1[i], 1);
		}
		
		
		for(int i=0;i<s2.length();i++) {
			if(hm.containsKey(c2[i])) {
				
				hm.put(c2[i], hm.get(c2[i])+1);
			}
		}
		
//		Map.Entry<Character, Integer>
//		for(Map.Entry<Character, Integer> : hm.entrySet())
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
