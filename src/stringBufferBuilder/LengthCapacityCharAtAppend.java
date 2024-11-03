package stringBufferBuilder;

public class LengthCapacityCharAtAppend {

	public static void main(String[] args) {
		
//		StringBuffer sb = new StringBuffer("durga");
//		System.out.println(sb.charAt(3));
//		System.out.println(sb.charAt(30));
		//StringIndexOutOfBoundsException
		
//
//		StringBuffer ss = new StringBuffer("java");
//		ss.setCharAt(0, 'y');
//		System.out.println(ss);//output:yava
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("PI Value is ");
		sb.append(3.14);
		sb.append(" it is exactly");
		sb.append(true);
		System.out.println(sb);
	}

}
