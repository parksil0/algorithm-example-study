import java.util.Scanner;

public class BaekJoon_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] alphabet = new int[26];
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		String input = sc.nextLine();
		String[] inputArr = input.split("");
		
		for(int i = 0; i < inputArr.length; i++) {
			
			for(int j = 97; j <= 122; j++) {
				if((int)inputArr[i].charAt(0) == j) {
					
					if(alphabet[j-97] != -1) {
						
					} else {
						alphabet[j-97] = i;
					}
				}
			}
		}
		
		for(int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}
}
