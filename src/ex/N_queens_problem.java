package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_queens_problem {
	static int N = 0;
	static int[] cols = new int[N+1];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("number N : ");
		N = Integer.parseInt(br.readLine());
		System.out.println(N);
		queens(0);
	}
	
	public static boolean queens(int level) {
		if(!promising(level)) {
			return false;
		}
		else if(level == N) {
			for(int i = 1; i <= N; i++) {
				System.out.println("(" + i + ", " + cols[i] + ")");
			}
			return true;
		} else {
			for(int i = 1; i <= N; i++) {
				cols[level+1] = i;
				if(queens(level+1)) {
					return true;
				}
			}
			return false;
		}
	}
	
	public static boolean promising(int level) {
		for(int i = 1; i < level; i++) {
			if(cols[i] == cols[level]) {
				return false;
			} else if(level-i == Math.abs(cols[level] - cols[i])) {
				return false;
			}
		}
		return true;
	}
}
