import java.util.Scanner;

public class BOJ_1316 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		
		String test = "";
		boolean isDupl = false;
		int result = 0;
		
		for(int i = 0; i < num; i++) {
			String input = sc.nextLine();
			String[] inputArr = input.split("");
			
			if(inputArr.length==1) {
				result++;
			}
			
			for(int j = 1; j < inputArr.length; j++) {
				
				
				if(!inputArr[j-1].equals(inputArr[j])) {
					if(test.contains(inputArr[j])) {
						isDupl = true;
					} else {
						test += inputArr[j-1];
					}
				}
				
				if(j == (inputArr.length-1) && isDupl == false) {
					result++;
				}
			}
			test = "";
			isDupl = false;
		}
		System.out.println(result);
		
	}
}
