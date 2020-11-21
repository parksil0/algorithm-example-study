import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeakJoon_2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] apart = new int[15][15];
		
		for(int i = 0; i < apart.length; i++) {
			for(int j = 0; j < apart.length; j++) {
				
				if(i == 0) {
					apart[i][j] = j+1;
				} else {
					if(j == 0) {
						apart[i][j] = 1;
					} else {
						apart[i][j] = apart[i-1][j] + apart[i][j-1];
					}
				}
			}
		}
		
		int length = Integer.parseInt(br.readLine());
		for(int i = 0; i < length; i++) {
			int floor = Integer.parseInt(br.readLine());
			int num = Integer.parseInt(br.readLine());
			
			System.out.println(apart[floor][num-1]);
		}
	}
}