package stringBufferBuilder;

public class Test01 {

	public static void main(String[] args) {
		
		String s1 = new String("you can't cange");
		String s2 = new String("you can't cange");
		System.out.println(s1 == s2);  // Output: false
//		s1 and s2 are two different objects created in heap memory, 
//		even though they contain the same text. Since == checks for reference equality, 
//		this will print false.
		
		
		String s3 = "you can't cange";
		System.out.println(s1 == s3);  // Output: false
//		s1 is in heap memory, and s3 is in the string pool (since it’s declared with "").
//		Therefore, the two references point to different locations, and == returns false.

		
		
		String s4 = "you can't cange";
		System.out.println(s3 == s4);  // Output: true
//		Both s3 and s4 point to the same string in the string pool 
//		because literals with the same content are reused in the pool. Hence, == returns true.
		
		
		String s5 = "you can't " + "cange";
		System.out.println(s4 == s5);  // Output: true
//		The expression "you can't " + "cange" is evaluated at compile-time (since both parts are literals).
//		This means s5 is optimized to be the same as s4 and stored in the string pool. Thus, == returns true.

		
		
		String s6 = "you can't ";
		String s7 = "change ";
		System.out.println(s4==s7);
//		s4 contains the string "you can't cange", while s7 contains "change ",
//		which is completely different. Therefore, == returns false.
		
		
		final String s8 = "you can't";
		String s9 = s8 + "change";
		System.out.println(s4==s9);
//		Even though s8 is final, the concatenation s8 + "change" happens at runtime, 
//		which creates a new String object in heap memory. 
//		Thus, s9 is not the same as the string pool object referenced by s4. So, == returns false.
		
		
		
		
		
		
	}

}
