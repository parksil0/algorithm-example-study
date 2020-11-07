import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < length; i++) {
        	String ox = sc.nextLine();
        	String[] ox2 = ox.split("");
        	
        	int total = 0;	//통합점수
        	for(int j = 0; j < ox2.length; j++) {
        		
        		int score = 0;	//연속점수
        		
        		if(ox2[j].equals("O")) {
        			score += 1;
        		} else if(ox2[j].equals("X")) {
        			total += score;
        			score = 0;
        		}
        		
        		if(j == ox2.length-1) {
        			total += score;
        		}
        	}
        	System.out.println(total);
        }
	}
}