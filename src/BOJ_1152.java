import java.util.Scanner;

public class BOJ_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine().trim();
		String[] inputArr = input.split(" ");
		
		if(inputArr[0].equals("")) {
			System.out.println(inputArr.length-1);
		} else if(inputArr[0].equals("")) {
			System.out.println(inputArr.length-1);
		} else {
			System.out.println(inputArr.length);
		}
	}
}
