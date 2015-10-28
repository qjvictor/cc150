package array_strings;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * what if you can't use additional data structures.
 * 
 * @author VictorQian
 * 
 */
public class StringUniqueChar {
	public boolean uniqueChar(String s) {
		if (s == null || s.length() < 2)
			return true;

		boolean[] chars = new boolean[256];
		for (char c : s.toCharArray()) {
			if (chars[c] == true) {
				return false;
			} else {
				chars[c] = true;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args){
		StringUniqueChar s = new StringUniqueChar();
		System.out.println(s.uniqueChar("akldjfajf;adfja"));
		System.out.println(s.uniqueChar("akldjf"));
	}
}
