package practice;

public class QuestionAndInterview05 {

	public static void main(String[] args) {
	
		 String s1 = "Java";
		    String s2 = new String("java");
		
		    // Line 1: Comparison
//		    String s3 = s2;
//		    if(s1==s3)
		    
		    if (s1.equalsIgnoreCase(s2))
		     {
		        System.out.println("Equal");
		    } else {
		        System.out.println("Not Equal");
		    }
		}
		
	}

