import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1436 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int six = 666;
        int count = 1;

        while (count != input) {
            six++;
            if (String.valueOf(six).contains("666")) {
                count++;
            }
        }
        System.out.println(six);

    }
}
