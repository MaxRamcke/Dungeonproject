package application;

public class Room{
	private String roomName;
	private String description;
	private Room north;
	private Room east;
	private Room south;
	private Room west;
	private NPC enemy;
	
	//Erster Konstruktor
	public Room() {
		roomName = ("Doofer Raum X");
		description = ("Dieser Raum ist leer und nicht da");
		north = null;
		east = null;
		south = null;
		west = null;
		enemy = null;
	}
		
	//Zweiter Konstruktor 
	public Room(String roomName, String description , Room north , Room east , Room south , Room west , NPC enemy) {
		this.roomName = roomName;
		this.description = description;
		this.north = north; 
		this.east = east;
		this.south = south;
		this.west = west;
		this.enemy = enemy;
	}
	
	
	public NPC getEnemy() {
		return enemy;
	}

	public void setEnemy(NPC enemy) {
		this.enemy = enemy;
	}

	//sämtliche getter und setter
	public String getRoomName() {
		return roomName;
	}

	public String getDescription() {
		return description;
	}

	
	public Room getNorth() {
		return north;
	}

	public void setNorth(Room North) {
		north = North;
	}

	public Room getEast() {
		return east;
	}

	public void setEast(Room East) {
		east = East;
	}

	public Room getSouth() {
		return south;
	}

	public void setSouth(Room South) {
		south = South;
	}

	public Room getWest() {
		return west;
	}

	public void setWest(Room West) {
		west = West;
	}

	
	
}