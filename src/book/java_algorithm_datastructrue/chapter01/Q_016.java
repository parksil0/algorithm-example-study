package book.java_algorithm_datastructrue.chapter01;

import java.util.*;
import java.io.*;

public class Q_016 {

    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        sb = new StringBuilder();

        spira(num);
        System.out.println(sb.toString());
    }

    static void spira(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = n - (i+1); j > 0; j--) {
                sb.append(" ");
            }

            for(int k = 0; k < (i+1)*2-1; k++) {
                sb.append("*");
            }
            sb.append('\n');
        }
    }
}
