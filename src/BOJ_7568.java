import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String[] arr = new String[length];

        for(int i = 0; i < length; i++) {
            arr[i] = br.readLine();
        }

        for(int i = 0; i < length; i++) {
            int rank = 1;

            for(int j = 0; j < length; j++) {
                if(i == j) continue;

                if ((Integer.parseInt(arr[i].split(" ")[0]) < Integer.parseInt(arr[j].split(" ")[0]))
                        && Integer.parseInt(arr[i].split(" ")[1]) < Integer.parseInt(arr[j].split(" ")[1])) {
                    rank++;
                }
            }

            System.out.print(rank + " ");
        }

    }
}
