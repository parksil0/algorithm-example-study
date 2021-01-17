import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = Integer.parseInt(br.readLine());

        double result1 = r * r * Math.PI;
        double result2 = r * r * 2;

        System.out.println(String.format("%.6f", result1));
        System.out.println(String.format("%.6f", result2));
    }
}
