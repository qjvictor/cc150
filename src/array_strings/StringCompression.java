package array_strings;
/**
 * implement a method to perform basic string compression using the counts of repeated characters.
 * aabcccccaaa -> a2b1c5a3.
 * if the compression string is not smaller than the orginal one, return original string. 
 * string only contains A-Z and a-z
 * @author VictorQian
 *
 */
public class StringCompression {
	public String compress(String s){
		if (s == null || s.length() < 3)
			return s;
		char[] cs = s.toCharArray();
		int pos = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < s.length(); i++) {
			if (cs[i] != cs[i - 1]) {
				sb.append(cs[i - 1]).append(i - pos);
				pos = i;
			}
		}
		if (pos != s.length()) {
			sb.append(cs[s.length() - 1]).append(s.length() - pos);
		}
		if (sb.length() < s.length())
			return sb.toString();
		else
			return s;
	}
	
	public static void main(String[] args){
		StringCompression s = new StringCompression();
		System.out.println(s.compress("aabcccccaaa"));
		System.out.println(s.compress("aabb"));
		System.out.println(s.compress("aabbccccb"));
	}
}
