import java.util.Scanner;

public class BeakJoon_2941 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputArr = input.split("");
		
		int result = 0;
		
		for(int i = 0; i < inputArr.length; i++) {
			
			int temp = i;
			
			if(!(i+3 > inputArr.length)) {
				if(input.substring(i, i+3).contains("dz=")) {
					result++;
					i += 2;
				}
			}
			
			if(!(i+2 > inputArr.length)) {
				if(input.substring(i, i+2).contains("c=") || input.substring(i, i+2).contains("c-") || input.substring(i, i+2).contains("d-") || 
						input.substring(i, i+2).contains("lj") || input.substring(i, i+2).contains("nj") || input.substring(i, i+2).contains("s=") || input.substring(i, i+2).contains("z=")) {
					result++;
					i += 1;
				}
			}
			
			if(temp == i) {
				result++;
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
