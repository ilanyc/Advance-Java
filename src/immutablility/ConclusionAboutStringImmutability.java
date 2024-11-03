package immutablility;

public class ConclusionAboutStringImmutability {

	public static void main(String[] args) {
	
     String s1 = new String("durga");
     String s2 = s1.toUpperCase();
     String s3 = s1.toLowerCase();
     System.out.println(s1==s2);//false
     System.out.println(s1==s3);//true
		
     
     String s4 = "durga";
     String s5 = s4.toString();
     String s6 = s4.toLowerCase();
     String s7 = s4.toUpperCase();
     System.out.println(s4 == s5);
     System.out.println(s4 == s6);
     System.out.println(s4 == s7);
     
     
		
		
	}

}
