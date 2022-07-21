package beakjun;

import java.util.Scanner;

public class Q8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt(); // ox문장의 입력 횟수
		int result[] = new int[len]; // 더할값들이 들어가는 배열

		for (int i = 0; i < len; i++) {
			String ox = sc.next(); // ox문장 입력
			int count = 1;// 더할 점수
			
			for (int k = 0; k < ox.length(); k++) {
				if (ox.charAt(k) == 'O') {
					result[i] += count++;
				}else {
					count = 1;
				}
			}
		}
		for (int i : result) {
			System.out.println(i);
		}
	}
}
