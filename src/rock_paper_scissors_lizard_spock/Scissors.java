package rock_paper_scissors_lizard_spock;

public final class Scissors implements Move {

	@Override
	public HandType move() {
		return HandType.SCISSORS;
	}

	@Override
	public Boolean beats(HandType opponent) {
		switch(opponent) {
		case PAPER:
			return true;
		case LIZARD:
			return true;
		default:
			return false;
		}
	}

}
