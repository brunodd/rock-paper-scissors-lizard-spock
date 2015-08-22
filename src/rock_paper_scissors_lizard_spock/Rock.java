package rock_paper_scissors_lizard_spock;

import rock_paper_scissors_lizard_spock.HandType;

public final class Rock implements Move {

	@Override
	public HandType move() {
		return HandType.ROCK;
	}

	@Override
	public Boolean beats(HandType opponent) {
		switch(opponent) {
		case LIZARD:
			return true;
		case SCISSORS:
			return true;
		default:
			return false;
		}
	}

}
