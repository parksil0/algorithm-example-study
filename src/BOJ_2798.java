import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        String[] inputArr2 = br.readLine().split(" ");

        int length = Integer.parseInt(inputArr[0]);
        int M = Integer.parseInt(inputArr[1]);

        int[] nums = new int[inputArr2.length];
        for(int i = 0; i < inputArr2.length; i++) {
            nums[i] = Integer.parseInt(inputArr2[i]);
        }

        // 합계가 M을 넘지 않는 수들의 집합,
        // 경우의 수는 : length P 3, 중복을 허용하지 않음
        int[] results = new int[(length * (length-1) * (length-2))];
        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = (i+1); j < nums.length; j++) {
                for(int k = (j+1); k < nums.length; k++) {

                    if(nums[i] + nums[j] + nums[k] <= M) {
                        results[index] = nums[i] + nums[j] + nums[k];
                        index++;
                    }
                }
            }
        }

        Arrays.sort(results);
//        System.out.println(Arrays.toString(results));

        System.out.println(results[results.length-1]);

    }
}
