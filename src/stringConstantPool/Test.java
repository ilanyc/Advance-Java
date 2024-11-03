package stringConstantPool;

public class Test {

	public static void main(String[] args) {
		
		char[] ch = {'j','a','v','a'};
		String  s = new String(ch);
		System.out.println(s);
		//This creates a String object s from the character array ch. 
		//The String(char[] value) constructor converts the character array into a String,
		//where each character in the array is concatenated in the same order to form the String.
		//So, s will hold the value "java".
		
		byte[] b = {97,98,99,100};
		String  a = new String(b);
		System.out.println(a);
		//The byte values 97, 98, 99, 100 are converted to the characters 'a', 'b', 'c', and 'd' respectively. 
		//So, the String a will hold "abcd".
		
	}

}
