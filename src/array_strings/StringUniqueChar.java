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
		if(s.length()>128)
			return false;

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
	
	public boolean _uniqueChar(String s) {
		int checker = 0;
		for (char c : s.toCharArray()) {
			int val = c - 'a';
			if ((checker & (1 << val)) > 0) {
				return false;
			} else {
				checker = checker | (1 << val);
			}
		}
		return true;
	}
	
	
	public static void main(String[] args){
		StringUniqueChar s = new StringUniqueChar();
		System.out.println(s._uniqueChar("Akldjfajf;adfja"));
		System.out.println(s._uniqueChar("akldjf"));
	}
}
