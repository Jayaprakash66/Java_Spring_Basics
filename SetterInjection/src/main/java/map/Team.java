package map;

import java.util.Map;

public class Team {
	private String sports;
	private Map<Integer,String> players;
	private String color;
	public String getSports() {
		return sports;
	}
	public void setSports(String sports) {
		this.sports = sports;
	}
	public Map<Integer, String> getPlayers() {
		return players;
	}
	public void setPlayers(Map<Integer, String> players) {
		this.players = players;
	}
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return "Team [sports=" + sports + ", players=" + players + ", color=" + color + "]";
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
