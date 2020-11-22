import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		int temp = 0;
		int min = 0;
		int total = 0;
		
		for(int i = 0; i <= num2 - num1; i++) {
			temp = num1 + i;
			
			if(temp == 2) {
				total += 2;
				if(min == 0) {
					min = 2;
				}
			}
			
			for(int j = 2; j < temp; j++) {
				if(temp % j == 0) {
					break;
				}
				
				if(j == temp -1) {
					total += temp;
					if(min == 0) {
						min = temp;
					}
				}
			}
		}
		if(total != 0) {
			System.out.println(total);
			System.out.println(min);
		} else {
			System.out.println("-1");
		}
		
	}
}
