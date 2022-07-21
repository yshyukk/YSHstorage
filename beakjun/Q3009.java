package beakjun;

import java.util.Scanner;

public class Q3009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] pointA = new int[] {sc.nextInt(), sc.nextInt()};
		int [] pointB = new int[] {sc.nextInt(), sc.nextInt()};
		int [] pointC = new int[] {sc.nextInt(), sc.nextInt()};

		int x=0;
		int y=0;
		
		if(pointA[0]==pointB[0]) {
			x = pointC[0];
		}else if(pointA[0]==pointC[0]) {
			x = pointB[0];
		}else {
			x = pointA[0];
		}
		if(pointA[1]==pointC[1]) {
			y = pointB[1];
		}else if(pointA[1]==pointB[1]) {
			y = pointC[1];
		}else {
			y = pointA[1];
		}
				System.out.println(x +" "+ y);
	}
}
