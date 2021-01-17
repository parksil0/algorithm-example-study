import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());

        for(int i = 1; i <= length; i++) {
            String[] input = br.readLine().split(" ");

            int result = 0;

            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int x2 = Integer.parseInt(input[3]);
            int y2 = Integer.parseInt(input[4]);

            int r1 = Integer.parseInt(input[2]);
            int r2 = Integer.parseInt(input[5]);

            double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

            if(distance != 0) {

                if(Math.abs(distance - r1) < r2) {
                    result = 2;

                    if(distance + r1 < r2) {
                        result = 0;
                    } else if (distance + r1 == r2) {
                        result = 1;
                    }
                } else if (Math.abs(distance - r1) > r2) {
                    result = 0;

                    if(distance < r1) {
                        if(r1 - distance < r2) {
                            result = 2;
                        } else if(r1 - distance == r2) {
                            result = 1;
                        }
                    } else {

                    }
                } else {
                    result = 1;
                }
            } else {
                if(r1 == r2) {
                    result = -1;
                } else {
                    result = 0;
                }
            }

            System.out.println(result);
        }
    }
}
