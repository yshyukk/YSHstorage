package beakjun;

import java.util.Scanner;

public class Q2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		int result = 0;

		for (int i = 1; i < input; i++) {
			result = 0;

			result += i;
			String str = String.valueOf(i);

			for (int k = 0; k < str.length(); k++) {
				result += Character.getNumericValue(str.charAt(k));
			}
			if (result == input) {
				System.out.println(i);
				break;
			}
		}
		if (result != input) {
			System.out.println("0");
		}

	}

}
