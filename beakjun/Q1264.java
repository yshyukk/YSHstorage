package beakjun;

import java.util.Scanner;

public class Q1264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] collect = new char[] {'a', 'e', 'i', 'o', 'u'};
		
		while(true) {
			 
			String sentence = sc.nextLine().toLowerCase().replace(" ", "");
			char[] alphabets = new char[sentence.length()];
			int count = 0;
			if(sentence.equals("#")) {
				break;
			}
			
			for(int j=0; j<5; j++) {
				for (int i=0; i<sentence.length(); i++) {
					alphabets[i] = sentence.charAt(i);
					if(collect[j] == alphabets[i]) count++;
				}	
			}
			System.out.println(count);
		}
	}
}
