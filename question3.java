// Neil Doherty A00226313

import java.util.Scanner;

public class question3 {
	public static void main(String[] args) {
		System.out.println(digitsAreOdd());
	}
	
	public static boolean digitsAreOdd() {
		boolean output = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		String u1 = sc.next();
		for (int x = 0 ; x < u1.length() ; x ++) {
			int i1 = (int) u1.charAt(x);
			if ((i1 % 2) == 1) {
				output = false;
			}
			else {
				output = true;
			}
		}
		System.out.print("All digits in the number are even? ");
		return output;		
	}
}