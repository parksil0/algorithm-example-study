import java.util.Scanner;

public class BOJ_8958 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        
        int total = 0;	//통합점수
        int score = 0;	//연속점수
        
        for(int i = 0; i < length; i++) {
        	String ox = sc.nextLine();
        	String[] ox2 = ox.split("");
        	
        	for(int j = 0; j < ox2.length; j++) {
        		
        		
        		if(ox2[j].equals("O")) {
        			score += 1;
        			total += score;
        		} else if(ox2[j].equals("X")) {
        			score = 0;
        		}
        		
        		if(j == ox2.length-1) {
        			score = 0;
        		}
        	}
        	System.out.println(total);
        	total = 0;
        }
	}
}
