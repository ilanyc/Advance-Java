package stringBufferBuilder;

public class CharAtConcatEqualsIgnorClass {

	public static void main(String[] args) {
		
		String s = "durga";
		System.out.println(s.charAt(3));// Prints 'g'
		//System.out.println(s.charAt(30));//StringIndexOutOfBoundsException
		//charAt() returns the character at the specified index,
		//and trying to access an invalid index throws StringIndexOutOfBoundsException.
		
		//s=s.concat("software");
		//s = s+"software";
		s += "software";
		System.out.println(s);//output is "durgasoftware"
		//Using += or + to concatenate strings creates a new String in Java,
		//as String objects are immutable.
		
		String A = "DURGA";
		System.out.println(A.equals("durga"));///output false
		//The string "DURGA" (in all uppercase) is not equal to "durga" (in all lowercase)
		//because the equals() method is case-sensitive.
		//Hence, the result of s.equals("durga") will be false 
		//because "DURGA" and "durga" are different due to case differences.
		System.out.println(A.equalsIgnoreCase("durga"));//true
		//In your case, A.equalsIgnoreCase("durga") compares the string "DURGA" (stored in A) with "durga" and 
		//returns true because the content is the same, even though the cases are different.

	}

}
