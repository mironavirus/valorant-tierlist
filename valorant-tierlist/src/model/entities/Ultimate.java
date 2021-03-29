package model.entities;

public class Ultimate extends AbstractAbility{

	private Integer orbsNeededToCompletion;
	
	public Ultimate() {
		super();
	}

	public Ultimate(String name, String description, Integer orbsNeededToCompletion) {
		super(name, description, "X");
		this.orbsNeededToCompletion = orbsNeededToCompletion;
	}

	public Integer getOrbsNeededToCompletion() {
		return orbsNeededToCompletion;
	}

	public void setOrbsNeededToCompletion(Integer orbsNeededToCompletion) {
		this.orbsNeededToCompletion = orbsNeededToCompletion;
	}
	
}
