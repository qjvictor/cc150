package array_strings;
/**
 * have a method isSubString which check if one word is a substring of another.
 * Given 2 strings, s1 and s2, check if s2 is a rotation of s1 using only one call to isSubString.
 * @author VictorQian
 *
 */
public class IsRotation {
	public boolean isRotation(String s1, String s2){
		if(s1.length()!=s2.length()) return false;
		return isSubString(s1+s1, s2);
	}
	
	private boolean isSubString(String s1, String s2){
		for(int i=0;i<s1.length()-1;i++){
			for(int j=i+1;j<s1.length();j++){
				if(s1.substring(i, j).equals(s2))
					return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		IsRotation i = new IsRotation();
		System.out.println(i.isRotation("isSubString", "SubStringis"));
		System.out.println(i.isRotation("isSubStrings", "SubStringiss"));
	}
}
