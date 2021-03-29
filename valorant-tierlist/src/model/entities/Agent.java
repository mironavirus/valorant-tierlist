package model.entities;

import java.util.ArrayList;
import java.util.List;

import model.entities.enums.Role;

public abstract class Agent {
	
	private String name;
	private Role role;
	private List<Ability> abilities = new ArrayList<>();
	private Ultimate ultimate;
	protected Double entryFraggerScore;
	protected Double defenderScore;
	protected Double infoCatcherScore;
	protected Double infoDenierScore;
	protected Double mobilityScore;
	protected Double ultimateScore;
	
	public Agent() {
	}

	public Agent(String name, Role role, Ultimate ultimate) {
		this.name = name;
		this.role = role;
		this.ultimate = ultimate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Ability> getAbilities() {
		return abilities;
	}

	public void addAbility(Ability ability) {
		abilities.add(ability);
	}
	
	public void removeAbility(Ability ability) {
		abilities.remove(ability);
	}
	
	
	public Ultimate getUltimate() {
		return ultimate;
	}

	public void setUltimate(Ultimate ultimate) {
		this.ultimate = ultimate;
	}
	
	public Double getEntryFraggerScore() {
		return entryFraggerScore;
	}

	public void setEntryFraggerScore(Double entryFraggerScore) {
		this.entryFraggerScore = entryFraggerScore;
	}

	public Double getDefenderScore() {
		return defenderScore;
	}

	public void setDefenderScore(Double defenderScore) {
		this.defenderScore = defenderScore;
	}

	public Double getInfoCatcherScore() {
		return infoCatcherScore;
	}

	public void setInfoCatcherScore(Double infoCatcherScore) {
		this.infoCatcherScore = infoCatcherScore;
	}

	public Double getInfroDenierScore() {
		return infoDenierScore;
	}

	public void setInfroDenierScore(Double infroDenierScore) {
		this.infoDenierScore = infroDenierScore;
	}

	public Double getMobilityScore() {
		return mobilityScore;
	}

	public void setMobilityScore(Double mobilityScore) {
		this.mobilityScore = mobilityScore;
	}

	public Double getUltimateScore() {
		return ultimateScore;
	}

	public void setUltimateScore(Double ultimateScore) {
		this.ultimateScore = ultimateScore;
	}

	public abstract Double totalScore();
	
}
