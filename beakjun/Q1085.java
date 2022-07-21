package beakjun;

import java.util.Arrays;
import java.util.Scanner;

public class Q1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int xLeng = Math.abs(w-x);
		int yLeng = Math.abs(h-y);
		
		int result[] = {x,y,xLeng,yLeng};
		
		Arrays.sort(result);
		
		System.out.println(result[0]);

	}
	
}
