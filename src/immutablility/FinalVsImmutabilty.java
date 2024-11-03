package immutablility;

public class FinalVsImmutabilty {

	public static void main(String[] args) {
		
		
		final StringBuffer sb = new StringBuffer("durga");
		sb.append("software");
		System.out.println(sb);
		
		//sb = new StringBuffer("ravi");
	
		//This line causes an error because sb is final.
		//You’re trying to make sb point to a new StringBuffer ("ravi"), which isn’t allowed with final.
		
	}

}
