package model.entities;

public class Controller extends Agent {

	public Controller() {
		super();
	}

	@Override
	public Double totalScore() {
		return (entryFraggerScore + 1.5 * defenderScore + 1.5 * infoCatcherScore + 2 * infoDenierScore + mobilityScore + ultimateScore) / 8;
	}

}
