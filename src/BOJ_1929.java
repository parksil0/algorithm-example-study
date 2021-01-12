import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        boolean isPrime = true;

        for(int i = Integer.parseInt(arr[0]); i <= Integer.parseInt(arr[1]); i++) {
            if(i <= 1) {
                isPrime = false;
            } else if (i > 1 && i < 4) {
                isPrime = true;
            } else if(i >= 4) {
                for(int j = 2; j <= Math.sqrt(i); j++) {
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime) {
                System.out.println(i);
            }
            isPrime = true;
        }
    }
}
