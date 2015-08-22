package rock_paper_scissors_lizard_spock;

public final class Paper implements Move {

	@Override
	public HandType move() {
		return HandType.PAPER;
	}

	@Override
	public Boolean beats(HandType opponent) {
		switch(opponent) {
		case ROCK:
			return true;
		case SPOCK:
			return true;
		default:
			return false;
		}
	}

}
