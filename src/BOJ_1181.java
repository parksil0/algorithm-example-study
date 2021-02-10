import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BOJ_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        Set words = new HashSet();

        for(int i = 0; i < length; i++) {
            words.add(br.readLine());
        }
        br.close();

        ArrayList<String> list = new ArrayList<>(words);
        Collections.sort(list, (c1, c2) -> {
            if(c1.length() == c2.length()) {
                char[] charArr1 = c1.toCharArray();
                char[] charArr2 = c2.toCharArray();
                int result = 0;
                for(int i = 0; i < charArr2.length; i++) {
                    if(charArr1[i] < charArr2[i]) {
                        result = -1;
                        break;
                    } else if(charArr1[i] > charArr2[i]) {
                        result = 1;
                        break;
                    }
                }
                return result;
            } else {
                return c1.length() - c2.length();
            }

        });
        StringBuilder sb = new StringBuilder();
        for(String str : list) {
            sb.append(str+'\n');
        }
        System.out.println(sb);
    }
}
