import java.util.Arrays;
import java.util.Scanner;

public class BeakJoon_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] inputArr = input.split("");
		
		int[] alphabet = new int[26];
		
		int index = 0;
		int max = 0;
		
		for(int i = 0; i < inputArr.length; i++) {
			for(int j = 65; j <= 90; j++) {
				if((int)inputArr[i].charAt(0) == j || (int)inputArr[i].charAt(0) == (j+32)) {
					alphabet[j-65]++;
				}
			}
		}
		
		for(int i = 0; i < alphabet.length; i++) {
			if(alphabet[i] > max) {
				max = alphabet[i];
				index = i;
			}
		}
		
		Arrays.sort(alphabet);
		if(alphabet[25] == alphabet[24]) {
			System.out.println("?");
		} else {
			char result = (char)(index+65);
			System.out.println(result);
		}
		
	}
}
