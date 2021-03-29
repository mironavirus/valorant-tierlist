package model.entities;

public class Ability extends AbstractAbility {

	private Integer cooldown;
	
	public Ability() {
		super();
	}

	public Ability(String name, String description, String hotKey, Integer cooldown) {
		super(name, description, hotKey);
		this.cooldown = cooldown;
	}

	public Integer getCooldown() {
		return cooldown;
	}

	public void setCooldown(Integer cooldown) {
		this.cooldown = cooldown;
	}
	
}
