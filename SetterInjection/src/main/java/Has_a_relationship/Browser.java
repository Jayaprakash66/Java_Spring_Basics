package Has_a_relationship;

public class Browser {
	private String name;
	private String version;
	private double size;
	
	private Person p;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Browser [name=" + name + ", version=" + version + ", size=" + size + ", p=" + p + "]";
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	

}
