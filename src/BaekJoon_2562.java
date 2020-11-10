import java.util.Scanner;

public class BaekJoon_2562 {
	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
		
		int[] input = new int[9];
		
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < 9; i++) {
			input[i] = scanner.nextInt();
			if(input[i] > max) {
				max = input[i];
				index = i + 1;
			}
		}

		System.out.println(max + "\n" + index);
	}
}
