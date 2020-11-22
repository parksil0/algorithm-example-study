import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1193 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		int deno = 3; //분모
		int num = 1; //분자
		
		int temp1 = 3;
		int temp2 = 1;
		
		int count = 0;
		
		while(true) {
			if(input <= 3) {
				if(input == 2) {
					deno = input;
				} else {
					deno = 1;
				}
				break;
			} else if(temp1 < input) {
				deno += 4;
				temp1 += deno;
			} else {
				count = input - (temp1 - deno);
				if(count > Math.round((double)deno/2)) {
					deno = (int)(Math.round((double)deno/2) - (count-Math.round((double)deno/2)));
				} else {
					deno = count;
				}
				break;
			}
			
		}
		
		while(true) {
			if(input == 1) {
				num = input;
				break;
			} else if(temp2 < input) {
				num += 4;
				temp2 += num;
			} else {
				count = input - (temp2 - num);
				if(count > Math.round((double)num/2)) {
					num = (int)(Math.round((double)num/2) - (count-Math.round((double)num/2)));
				} else {
					num = count;
				}
				break;
			}
			
		}
		
		System.out.println(num+"/"+deno);

	}
}
