package stringBufferBuilder;

import java.util.Scanner;

public class TrimMethode {

	public static void main(String[] args) {

		String s = "Durga Soft";
		System.out.println(s.length());// 10
		System.out.println(s.trim().length());// 10
		// s.length() returns 10 because "Durga Soft" has 10 characters, including the
		// space in the middle.
		// s.trim() removes any leading and trailing whitespace from s,
		// but since "Durga Soft" doesn’t have extra whitespace around it,
		// s.trim().length() also returns 10.
		
		
		
		

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your City Name: ");
        String name = sc.nextLine().toLowerCase().trim();

        if (name.equals("hyderabad")) {
            System.out.println("Hello Hyderabadi, Aadaab...");
        } else if (name.equals("chennai")) {
            System.out.println("Hello Madrasi, Vanakkam...");
        } else if (name.equals("bangalore")) {
            System.out.println("Hello Kannadiga, Namaskara...");
        } else {
            System.out.println("Hello New|York");
        }
    }
}