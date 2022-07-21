package beakjun;

import java.util.Scanner;

public class Q2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int music[] = new int[8];
		for (int i = 0; i < 8; i++) {
			music[i] = sc.nextInt();
		}
		if(music[0]==1) { // 오름차순 or mixed
			for(int i=0; i<music.length-1;i++) {
				if(music[i] != music[i+1]) {
					System.out.println("mixed");
					return;
				}
			}
			System.out.println("asecnding");
		}else if(music[0]==8) {
			for(int i=0; i<music.length-1;i++) {
				if(music[i]-1 != music[i+1]) {
					System.out.println("mixed");
					return;
				}
			}
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}
