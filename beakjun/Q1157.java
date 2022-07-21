package beakjun;

import java.util.Arrays;
import java.util.Scanner;

public class Q1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] count = new int[26];
		String str = sc.nextLine().toUpperCase();
		
		for (int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - 'A';
			count[num]++;
		}
		int max = 0;
		char answer = '?';
		for (int i = 0; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
				answer = (char) (i + 'A');
			} else if (max == count[i]) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}
}
