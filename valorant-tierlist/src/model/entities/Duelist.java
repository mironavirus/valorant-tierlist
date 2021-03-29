package model.entities;

public class Duelist extends Agent {

	public Duelist() {
		super();
	}

	@Override
	public Double totalScore() {
		return (2 * entryFraggerScore + defenderScore + infoCatcherScore + 1.5 * infoDenierScore + 1.5 * mobilityScore + ultimateScore) / 8;
	}

}
