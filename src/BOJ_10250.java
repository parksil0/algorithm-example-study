import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < length; i++) {
			String[] input = br.readLine().split(" ");
			int h = Integer.parseInt(input[0]);
			int w = Integer.parseInt(input[1]);
			int num = Integer.parseInt(input[2]);
			
			int count = (int)(Math.ceil((double)num / (double)h));
			int floor = num % h;
			
			if(num % h == 0) {
				floor = h;
			} else {
				floor = num % h;
			}
			
			if(count < 10) {
				System.out.println(floor + "0"+ count);
			} else {
				System.out.println(floor + "" + count);
			}
		}
	}
}
