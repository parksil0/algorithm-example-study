import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String[] inputArr = br.readLine().split(" ");
		
		int count = 0;
		
		for(int i = 0; i < length; i++) {
			
			if(Integer.parseInt(inputArr[i]) <= 1) {
				count++;
			} else {
				for(int j = 2; j < Integer.parseInt(inputArr[i]); j++) {
					if(Integer.parseInt(inputArr[i]) % j == 0) {
						count++;
						break;
					}
				}
			}
		}
		System.out.println(length - count);
	}
}
