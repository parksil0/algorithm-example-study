import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeakJoon_2839 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		//1.
		int temp = input;
		int count = 0;
		
		if((input < 5 && input != 3) || input == 7) {
			System.out.println("-1");
			return;
		} else if(input == 3) {
			System.out.println("1");
			return;
		}

		while(temp >= 5) {
			count += temp/5;
			temp %= 5;
			if(temp == 1 || temp == 4) {
				temp += 5;
				count--;
			} else if(temp == 2) {
				temp += 10;
				count -= 2;
			}
			
			if(temp == 3 || temp == 6 || temp == 9 || temp == 12) {
				while(temp != 0) {
					temp -= 3;
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
