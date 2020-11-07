import java.util.Arrays;
import java.util.Scanner;

public class BackJoon_1546 {
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		
		double[] score = new double[length];
		double avg = 0;
		
		String input = sc.nextLine();
		String[] nums = input.split(" ");
		
		for(int i = 0; i < nums.length; i++) {
			score[i] = Integer.parseInt(nums[i]);
		}
		
		Arrays.sort(score);
		
		for(int i = 0; i < score.length; i++) {
			score[i] = (score[i] / score[score.length-1]) * 100;
			avg += score[i];
			
			if(i == score.length-1) {
				avg /= score.length;
			}
		}
		System.out.println(avg);
	}
}
