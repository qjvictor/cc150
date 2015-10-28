package array_strings;
/**
 * replace all space with "%20" in place.  
 * char[] has enough space to hold the additional chars. 
 * length is the true length of char, which excludes the spare space at the end of the chars
 * @author VictorQian
 *
 */
public class ReplaceSpace {
	public void replaceChars(char[] str, int length){
		int spaceCount=0;
		for(int i=0;i<length;i++){
			if(str[i]==' ')
				spaceCount++;
		}
		int newLength = length+spaceCount*2-1;
		int pos=length-1;
		while(pos>=0){
			if(str[pos]!=' '){
				str[newLength]=str[pos];
				newLength--;
			}else{
				str[newLength--]='0';
				str[newLength--]='2';
				str[newLength--]='%';
			}
			pos--;
		}
	}
	
	public static void main(String[] args){
		ReplaceSpace r = new ReplaceSpace();
		char[] str = new char[10];
		str[0]='a';
		str[1]='b';
		str[2]=' ';
		str[3]='c';
		str[4]=' ';
		r.replaceChars(str, 5);
		System.out.println(str);
	}

}
