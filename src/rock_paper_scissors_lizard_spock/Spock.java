package rock_paper_scissors_lizard_spock;

public final class Spock implements Move {

	@Override
	public HandType move() {
		return HandType.SPOCK;
	}

	@Override
	public Boolean beats(HandType opponent) {
		switch(opponent) {
		case SCISSORS:
			return true;
		case ROCK:
			return true;
		default:
			return false;
		}
	}

}
