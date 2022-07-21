package beakjun;

import java.util.Scanner;

public class Q2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int result=0;
		
		for(int i=0; i<5; i++) {
			int x= sc.nextInt();
			result += (x*x);	
		}
		System.out.println(result % 10);
	}

}
