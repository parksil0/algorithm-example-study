import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2750 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        int[] arr = new int[length];

        for(int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < length; i++) {
            int min = arr[i];
            int index = i;
            for(int j = i+1; j < length; j++) {

                if(min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }

        for(int num : arr) {
            System.out.println(num);
        }

    }
}
