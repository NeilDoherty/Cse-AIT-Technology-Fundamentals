// Neil Doherty A00226313

import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter quiz, mid-term and final scores, line seperated:");
		int quizScore = sc.nextInt();
		int midTermScore = sc.nextInt();
		int finalScore = sc.nextInt();
		System.out.println(scores(quizScore, midTermScore, finalScore));
	}
	
	public static String scores(int quizScore, int midTermScore, int finalScore) {
		String grade = null;
		double average = ((quizScore + quizScore + finalScore) / 3);
		if ((average > 100) || (average < 0)) {
			System.out.println("INVALID SCORE");
		}
		else if (average > 89) {
			grade = "A1";
		}
		else if (average > 79) {
			grade = "A2";
		}
		else if (average > 69) {
			grade = "B";
		}
		else if (average > 49) {
			grade = "C";
		}
		else if (average > 39) {
			grade = "D";
		}
		else if ((average > 0) && (average < 40)) {
			grade = "F";
		}
		System.out.print("Quiz score: " + quizScore + "\n"
						+ "Mid-term score: " + quizScore + "\n"
						+ "Final score: " + finalScore + "\n");
		return grade;
	}
}