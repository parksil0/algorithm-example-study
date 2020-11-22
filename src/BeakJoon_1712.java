import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeakJoon_1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] inputArr = input.split(" ");

		int A = Integer.parseInt(inputArr[0]);
		int B = Integer.parseInt(inputArr[1]);
		int C = Integer.parseInt(inputArr[2]);
		
		if(B >= C) {
			System.out.println("-1");
		} else {
			System.out.println((A/(C-B)+1));
		}
		
	}
}
