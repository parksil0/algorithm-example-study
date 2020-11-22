import java.util.Scanner;

public class BOJ_10720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		sc.nextLine();
		
		String input = sc.nextLine();
		String[] nums = new String[length];
		nums = input.split("");
		
		int total = 0;
		
		for(int i = 0; i < nums.length; i++) {
			total += Integer.parseInt(nums[i]);
		}
		
		System.out.println(total);
	}
}
