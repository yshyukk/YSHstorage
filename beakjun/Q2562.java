package beakjun;

import java.util.Scanner;

public class Q2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int index=0;
		//9개의 숫자를 배열에 넣는다.
		int num[] = new int [9];
		for(int i=0; i<9; i++) { // <-- index= 0~9까지니까 i를 9로해야 9개
			num[i]=sc.nextInt();
		}
		for(int i=1; i<num.length; i++) { //<--- 배열의 위치 구하기위해 index값 찾기
			if(num[index]<num[i]) {
				index = i;						//M--- 숫자는 1번부터 시작하니까
			}
			
		}
		System.out.println(num[index]);
		System.out.println(index+1);
	}

}
