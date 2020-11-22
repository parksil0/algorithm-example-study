import java.util.Scanner;

public class BOJ_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		sc.nextLine();

		String result = "";
		
		for(int i = 0; i < times; i++) {
			String input = sc.nextLine();
			String[] inputArr = input.split("");
			
			for(int j = 2; j < inputArr.length; j++) {
				for(int k = 0; k < Integer.parseInt(inputArr[0]); k++) {
					result += inputArr[j];
				}
			}
			System.out.println(result);
			result = "";
		}
		
	}
}
