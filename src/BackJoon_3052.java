import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BackJoon_3052 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		List<Integer> nums = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			num %= 42;
			if(!nums.contains(num)) {
				nums.add(num);
			}
				
		}
		
		System.out.println(nums.size());

	
	}
}
