import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] number = {"3ABC", "4DEF", "5GHI", "6JKL", "7MNO", "8PQRS", "9TUV", "10WXYZ"};
		
		String input = br.readLine();
		String[] inputArr = input.split("");

		int result = 0;
		
		for(int i = 0; i < inputArr.length; i++) {
			
			for(int j = 0; j < number.length; j++) {
				if(number[j].contains(inputArr[i])) {
					if(j == number.length-1) {
						result += Integer.parseInt(number[j].substring(0, 2));
					} else {
						result += Integer.parseInt(number[j].substring(0, 1));
					}
				}
			}
		}
		System.out.println(result);
	}
}
