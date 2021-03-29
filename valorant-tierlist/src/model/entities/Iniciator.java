package model.entities;

public class Iniciator extends Agent {

	public Iniciator() {
		super();
	}

	@Override
	public Double totalScore() {
		return (1.5 * entryFraggerScore + defenderScore + 2 * infoCatcherScore + infoDenierScore + 1.5 * mobilityScore + ultimateScore) / 8;
	}

}
