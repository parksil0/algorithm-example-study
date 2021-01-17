import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        while(!input.equals("0 0 0")) {

            String[] arr = input.split(" ");
            int[] nums = { Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]) };
            Arrays.sort(nums);

            int num1 = (int)Math.pow(nums[0], 2);
            int num2 = (int)Math.pow(nums[1], 2);
            int num3 = (int)Math.pow(nums[2], 2);

            if(num3 == (num1 + num2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

            input = br.readLine();
        }
    }
}
