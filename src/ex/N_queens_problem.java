package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_queens_problem {
	private int N = 0;
	private int[] cols;
	
	public N_queens_problem(int n, int[] cols) {
		N = n;
		this.cols = cols;
	}
	
	private boolean queens(int level) {
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
	
	private boolean promising(int level) {
		for(int i = 1; i < level; i++) {
			if(cols[i] == cols[level]) {
				return false;
			} else if(level-i == Math.abs(cols[level] - cols[i])) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("number N : ");
		int N = Integer.parseInt(br.readLine());
		
		int[] cols = new int[N+1];
		N_queens_problem test = new N_queens_problem(N, cols);
		
		test.queens(0);
	}
}
