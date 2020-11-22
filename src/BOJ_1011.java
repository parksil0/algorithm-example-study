import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1011 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long length = Long.parseLong(br.readLine());
		
		long k = 1;
		long count = 0;
		
		for(long i = 0; i < length; i++) {
			String[] input = br.readLine().split(" ");
		
			long start = 0;
			long end = Long.parseLong(input[1]) - Long.parseLong(input[0]);

			while(true) {
				
				if(end - start <= 0) {
					if(start - end > k) {
						count--;
						break;
					}
					break;
				} else if(end - start >= k-2 && end - start <= k) {
					count++;
					break;
				} else {
					start += k;
					end -= k;
					k++;
					count += 2;
				}
				
			}
			System.out.println(count);
			k = 1;
			count = 0;
		}
	}
}
