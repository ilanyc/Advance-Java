package practice;

public class StringBufferClassConstructorPart01 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		//When you create a StringBuffer without specifying an initial capacity,
		//it defaults to a capacity of 16 characters.
		
		sb.append("abcdefghijklmnop");
		sb.append('q');
		sb.append("abcdefghijklmnop");
		sb.append('q');
		System.out.println(sb.capacity());

		//The first append("abcdefghijklmnop") adds 16 characters.
		//The next append('q') adds 1 character (total now is 17).
		//The second append("abcdefghijklmnop") adds 16 more characters (total now is 33).
		//The final append('q') adds 1 more character (total now is 34).
		
	}

}
