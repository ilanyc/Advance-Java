package stringBufferBuilder;

public class ConcatAppend {

	public static void main(String[] args) {
		
		String s = new String("Durga");
		
		s.concat("software");
		System.out.println("Hellow World");
		
		
		StringBuffer sb = new StringBuffer("durga");
		sb.append("software");
		
		System.out.println(sb);
		
		String s1 = new String("durga");
		String s2 = new String("durga");
		System.out.println(s1 = s2);  // This will assign s2 to s1 and print s2
		System.out.println(s1.equals(s2));  // This will check if s1 and s2 are equal

		
		StringBuffer sb1 = new StringBuffer("durga");
		StringBuffer sb2 = new StringBuffer("durga");
		System.out.println(sb1 = sb2);  // This will assign sb2 to sb1 and print sb2
		System.out.println(sb1.equals(sb2));  // This will compare references, not content

		

		String ss1 = new String("Spring");
		ss1.concat("Fall");
		//The concat() method returns a new String object with the value "SpringFall", but since the result is not assigned to any variable, it is discarded. 
		//Therefore, ss1 remains "Spring".
		String ss2 = ss1.concat("winter");
		//The concat("winter") method creates a new String object with the value "Springwinter" and assigns it to ss2.
		//Now, ss2 holds "Springwinter", but ss1 is still "Spring"
		ss2.concat("summer");
		//This creates a new String object "Springwintersummer", but the result is not assigned to any variable.
		//Therefore, the new string is discarded, and ss2 remains "Springwinter".
		System.out.println(ss1);
		System.out.println(ss2);
		
		
		
		
		
		
	}

}
