// Neil Doherty A00226313

import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		boolean output = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int u1 = sc.nextInt();
		int u2 = sc.nextInt();
		if ((u1 > u2) || (u2 > u1)){
			output = true;
		}
		else {
			output = false;
		}
		System.out.println("One number is greater than the other? " + output);
		
		System.out.println("Enter 2 more numbers:");
		int u3 = sc.nextInt();
		int u4 = sc.nextInt();
		if (u3 == u4) {
			output = true;
		}
		else {
			output = false;
		}
		System.out.println("The 2 numbers are equal? " + output);
	}
}