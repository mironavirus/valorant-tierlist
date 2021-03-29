package model.entities;

public abstract class AbstractAbility {

	private String name;
	private String description;
	private String hotKey;
	
	public AbstractAbility() {
	}

	public AbstractAbility(String name, String description, String hotKey) {
		this.name = name;
		this.description = description;
		this.hotKey = hotKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHotKey() {
		return hotKey;
	}

	public void setHotKey(String hotKey) {
		this.hotKey = hotKey;
	}

}
