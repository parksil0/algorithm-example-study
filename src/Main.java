import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		
		int member = 1;
		int increment = 0;
		
		for(int i = 0; i < length; i++) {
			int floor = Integer.parseInt(br.readLine());
			int num = Integer.parseInt(br.readLine());

			increment = floor + 1;
			
			for(int j = 0; j < num; j++) {
				if(floor == 0) {
					member = num;
					break;
				} else {
					if(j == 0) {
						member = 1;
						System.out.println(member);
					} else {
						member += increment;
						increment += floor + (floor-1);
						System.out.println(member);
						
					}
				}
			}
		}
		System.out.println(member);
	}
}
