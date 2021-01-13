import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_4948 {
    public static void main(String[] args) throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int count = 0;
        boolean isPrime = true;

        while(input != 0) {

            for(int i = input+1; i <= input*2; i++) {
                if(i == 2 && i == 3) {
                    isPrime = true;
                } else {
                    for(int j = 2; j <= Math.sqrt(i); j++) {
                        if(i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                if(isPrime) {
                    count++;
                }
                isPrime = true;
            }
            System.out.println(count);
            input = Integer.parseInt(br.readLine());
            count = 0;
        }
    }
}
