import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		int deno = 3; //분모
		int num = 1; //분자
		
		int temp1 = input-3;
		int temp2 = input-1;
		
		while(true) {
			if(input <= 3) {
				break;
			} else if(input-4 > deno) {
				deno += 4;
				temp1 -= 4;
				System.out.println("deno : " + deno + ", temp : " + temp1);
			} else {
				break;
			}
			
		}
		
		while(true) {
			if(input <= 1) {
				break;
			} else if(input-4 > num) {
				num += 4;
				temp2 -= 4;
				System.out.println("num : " + num + ", temp : " + temp2);
			} else {
				break;
			}
			
		}
		System.out.println(num+"/"+deno);
	}
}

