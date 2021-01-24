import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2447 {
    private static String[] star;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        star = new String[input];
        init(input);

        printStar(input);

        for(int i = 0; i < input; i++) {
            System.out.print(star[i]);
            System.out.println();
        }
    }

    private static void printStar(int num) {
        String[] output = new String[num/3];

        if(num != 3) {
            printStar(num / 3);
        }

        for(int i = 0; i < num/3; i++) {
            if(num/3 == 1) {
                output[i] = "*";
            } else {
                output[i] = star[i];
            }
        }

        init(num);
        int l = 0;

        for(int i = 0; i < num; i++) {

            for(int j = 0; j < 3; j++) {

                if((i >= (num/3) && i < ((num/3) * 2)) && j == 1) {
                    for(int k = 0; k < num/3; k++) {
                        star[i] += " ";
                    }
                } else {
                    star[i] += output[l];
                }
            }
            l++;
            if(l >= output.length) {
                l = 0;
            }
        }
    }

    private static void init(int input) {
        for(int i = 0; i < input; i++) {
            star[i] = "";
        }
    }
}
