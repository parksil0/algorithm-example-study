import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String[][] arr = new String[length][2];

        StringTokenizer st;
        for(int i = 0; i < length; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        br.close();

        Arrays.sort(arr, (c1, c2) -> {
            if(Integer.parseInt(c1[0]) == Integer.parseInt(c2[0])) {
                return 0;
            } else {
                return Integer.parseInt(c1[0]) - Integer.parseInt(c2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i][0] + " " + arr[i][1] + '\n');
        }
        System.out.println(sb);
    }
}
