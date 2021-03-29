package model.entities;

public class Sentinel extends Agent {

	public Sentinel() {
		super();
	}

	@Override
	public Double totalScore() {
		return (entryFraggerScore + 2 * defenderScore + 1.5 * infoCatcherScore + 1.5 * infoDenierScore + mobilityScore + ultimateScore) / 8;
	}

}
