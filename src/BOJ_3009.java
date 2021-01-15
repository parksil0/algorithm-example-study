import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[3];
        int[] y = new int[3];

        for(int i = 0; i <= 2; i++) {
            String[] arr = br.readLine().split(" ");
            x[i] = Integer.parseInt(arr[0]);
            y[i] = Integer.parseInt(arr[1]);
        }
        int num1 = 0;
        int num2 = 0;

        for(int i = 0; i <= 2; i++) {

            for(int j = i+1; j <= 2; j++) {

                if(x[i] == x[j]) {
                    x[i] = 0;
                    x[j] = 0;
                }
                if(y[i] == y[j]) {
                    y[i] = 0;
                    y[j] = 0;
                }
            }
        }

        for(int i = 0; i <= 2; i++) {
            if(x[i] != 0) {
                num1 = x[i];
            }
            if(y[i] != 0) {
                num2 = y[i];
            }
        }

        System.out.println(num1 + " " + num2);
    }
}
