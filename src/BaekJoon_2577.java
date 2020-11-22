import java.util.Scanner;

public class BaekJoon_2577 {
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int[10];
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		String result = Integer.toString(A * B * C);
		String[] nums = result.split("");
		
		for(int i = 0; i < nums.length; i++) {
			
			for(int j = 0; j < number.length; j++) {
				if(Integer.parseInt(nums[i]) == j) {
					number[j]++;
				}				
			}
		}
		
		for(int i = 0; i<number.length; i++) {
			System.out.println(number[i]);
		}
	}
}