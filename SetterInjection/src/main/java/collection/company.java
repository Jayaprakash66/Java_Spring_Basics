package collection;

import java.util.List;


public class company {

	private String name;
	private String loc;
	private String mail;
	
	private List<String> namelist;

	@Override
	public String toString() {
		return "company [name=" + name + ", loc=" + loc + ", mail=" + mail + ", namelist=" + namelist + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<String> getNamelist() {
		return namelist;
	}

	public void setNamelist(List<String> namelist) {
		this.namelist = namelist;
	}

}
