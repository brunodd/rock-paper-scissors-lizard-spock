package rock_paper_scissors_lizard_spock;

import rock_paper_scissors_lizard_spock.HandType;

public interface Move {
	
	/**
	 * @brief Get the hand that was played.
	 * @return
	 */
	public HandType move();
	
	/**
	 * @brief Compare the hand against an opponents hand.
	 * @param opponent Opponents Hand.
	 * @return true if opponent was beaten. 
	 * Note:false for lose and draw.
	 */
	public Boolean beats(HandType opponent);
	
}
