import java.util.Scanner;

public class BaekJoon_4344 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        
        int total = 0;
        double avg = 0.000;
        
        double count = 0;
        
        for(int i = 0; i < length; i++) {
        	String input = sc.nextLine();
        	String[] nums = input.split(" ");
        	
        	for(int j = 1; j < nums.length; j++) {
        		total += Integer.parseInt(nums[j]);
        		
        		if(j == nums.length-1) {
        			avg = total / (nums.length-1);
        			
        			total = 0;
        		}
        	}
        	
        	for(int k = 1; k < nums.length; k++) {
        		if(Integer.parseInt(nums[k]) > avg) {
        			count++;
        		}
        		
        		if(k == nums.length-1) {
        			System.out.println(String.format("%.3f", (count/(nums.length-1) * 100)) + "%" );
        			count = 0;
        		}
        	}
        }
	}
}
