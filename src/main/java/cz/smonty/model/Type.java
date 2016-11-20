package cz.smonty.model;

public class Type {

	private String name;
	private String description;
	private String extension;

	public Type() {

	}

	public Type(String name, String description, String extension) {
		this.name = name;
		this.description = description;
		this.extension = extension;
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

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Override
	public String toString() {
		return "name = " + this.name + " description = " + this.description + " extension = " + this.extension;
	}

}
