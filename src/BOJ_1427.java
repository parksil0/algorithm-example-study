import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        int[] nums = new int[arr.length];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(nums);
        for(int i = nums.length-1; i >= 0; i--) {
            System.out.print(nums[i]);
        }
    }
}
