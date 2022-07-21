package beakjun;
import java.util.Scanner;

public class Q2530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hr = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		int addSec = sc.nextInt();
		int allSec = 0;
		int comHr = 0;
		int comMin = 0;
		int comSec = 0;

		allSec = (hr * 3600) + (min * 60) + sec + addSec;
		comHr = ((allSec / 3600)% 24);
		comMin = ((allSec % 3600) / 60);
		comSec = ((allSec % 3600) % 60);
		System.out.println(comHr + " " + comMin + " " + comSec);
	}
}
