package rock_paper_scissors_lizard_spock;

public final class Lizard implements Move {

	@Override
	public HandType move() {
		return HandType.LIZARD;
	}

	@Override
	public Boolean beats(HandType opponent) {
		switch(opponent) {
		case SPOCK:
			return true;
		case PAPER:
			return true;
		default:
			return false;
		}
	}

}
