package beakjun;

import java.util.Scanner;

public class Q1259 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String a = sc.next();
			if (a.equals("0")) {
				break;
			} else {
				for (int i=0; i<a.length()/2;i++) {
					if (a.charAt(i) != a.charAt(a.length()-i-1)) {
						System.out.println("no");
						break;
					}
					if (i == (a.length()/2)-1) {
						System.out.println("yes");
					}
				}
			}

		}

	}
}
