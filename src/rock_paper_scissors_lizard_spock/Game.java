package rock_paper_scissors_lizard_spock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
	public Game(Integer max) {
		br = new BufferedReader(new InputStreamReader(System.in));
		
		player1 = "";
		player2 = "";
		score1 = 0;
		score2 = 0;
		maxScore = max;
	}
	
	public void start() throws IOException {
        System.out.print("Enter player1:\n");
        player1 = br.readLine();
        System.out.print(player1 + " was added.\n");
        System.out.print("Enter player2:\n");
        player2 = br.readLine();
	}
	
	public void play() throws IOException, RuntimeException {
		Move m1 = getMove(player1);
		Move m2 = getMove(player2);
		
		if(m1.beats(m2.move())) {
			score1++;
			System.out.print(player1 + " wins!\n");
		}
		else if (m2.beats(m1.move())) {
			score2++;
			System.out.print(player2 + " wins!\n");
		}
		
		if(score1 >= maxScore) {
			System.out.print(player1 + " IS THE WINNER");
			return;
		}
		else if (score2 >= maxScore) {
			System.out.print(player2 + " IS THE WINNER");
			return;
		}
		play();
	}

	private Move getMove(String player) throws IOException, RuntimeException {
		System.out.print(player + ", make a choice:\n");
		printMoves();
		try {
			int choice = Integer.parseInt(br.readLine());
			switch(choice) {
			case 1:
				return new Rock();
			case 2:
				return new Paper();
			case 3:
				return new Scissors();
			case 4:
				return new Lizard();
			case 5:
				return new Spock();
			default:
				//retry
				return getMove(player);
			}
				
		} catch(IOException ioexc) {
			System.err.println("Failed to read input");
		}
		return null;
	}
	
	private void printMoves() {
		System.out.print("1. Rock\n"
				+ "2. Paper\n"
				+ "3. Scissors\n"
				+ "4. Lizard\n"
				+ "5. Spock\n");
	}
	
	private String player1;
	private String player2;
	private Integer score1;
	private Integer score2;
	private Integer maxScore;
	private BufferedReader br;
	
}
