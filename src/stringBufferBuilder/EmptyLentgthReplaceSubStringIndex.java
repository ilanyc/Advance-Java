package stringBufferBuilder;

public class EmptyLentgthReplaceSubStringIndex {

	public static void main(String[] args) {
		
		
		String s = "";
		System.out.println(s.isEmpty());//True
		
		
		String A = "durga";
		System.out.println(A.length());//5
		//This methode applicable for String not Arrays
		
		
		
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println(numbers.length); // Outputs: 5
		
		
		String B = "ababab";
		System.out.println(B.replace('a', 'b'));//output:bbbbbb
		//The replace('a', 'b') method replaces all occurrences of the character 'a' with 'b',
		//resulting in "bbbbbb".
		
		
		String C = "abcdefg";
		System.out.println(C.substring(3));//output:defg
		//C.substring(3) returns the substring starting from index 3 to the end, which is "defg".
		System.out.println(C.substring(3,6));//def
		//C.substring(3, 6) returns the substring starting from index 3 up to, but not including,
		//index 6, which is "def".
		
		
		String D = "durga";
		System.out.println(D.indexOf('g'));//output:3
		//D.indexOf('g') finds the first occurrence of 'g', which is at index 3
		System.out.println(D.indexOf('z'));//output:-1
		//D.indexOf('z') returns -1 because 'z' is not present in the string.
		
		
		String E = "babbab";
		System.out.println(E.indexOf('a'));//output:1
		//E.indexOf('a') finds the first occurrence of 'a', which is at index 1.
		System.out.println(E.lastIndexOf('a'));//4
		//E.lastIndexOf('a') returns 4 because the last occurrence of the character 'a' 
		//in the string "babbab" is at index 4.
		
		
		


	}

}
