package rock_paper_scissors_lizard_spock;

import rock_paper_scissors_lizard_spock.HandType;

public interface Move {
	public HandType move();
	
	public Boolean beats(HandType opponent);
	
}
