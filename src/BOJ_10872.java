import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int result = factorial(input);
        System.out.println(result);
    }

    static int factorial(int num) {
        if(num < 1) {
            return 1;
        }
        return num * factorial(num-1);
    }
}
