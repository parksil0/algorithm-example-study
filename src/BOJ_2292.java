import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2292 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		double input2= input-1.0;
		
		int test = 1;
		int temp = 0;
		int count = 1;
		
		if(input == 1) {
			System.out.println("1");
			return;
		} else if(input > 1 && input < 6) {
			System.out.println("2");
			return;
		}
		
		for(int i = 0; i <= input; i++) {
			if(temp < (input2/6) && (i+1) >= (input2/6)) {
				
				//System.out.println(temp + " < n <= " + (i+1));
				System.out.println(count+1);
			}
			temp = (i+1);
			i += test;
			test++;
			count++;
		}
		
	}
}
