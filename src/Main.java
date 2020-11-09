import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] alphabet = new int[26];
		
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
			System.out.println(alphabet[i]);
		}
	}
}