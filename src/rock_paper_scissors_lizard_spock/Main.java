package rock_paper_scissors_lizard_spock;

import java.io.IOException;

import rock_paper_scissors_lizard_spock.Game;

public class Main {
	private static Integer SCORE_COUNT = 3;

	public static void main(String[] args) {
		Game game = new Game(SCORE_COUNT);
		
		try {
			game.start();
			game.play();
			
		} catch (IOException exc) {
			System.out.println("Ah shit happens.");
		}
	}

}
