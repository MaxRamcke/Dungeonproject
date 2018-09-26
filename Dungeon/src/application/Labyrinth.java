package application;

public class Labyrinth {
	private Room floor;
	private Room westRoom;
	private Room northRoom; 
	private Room eastRoom;
	private Room southRoom;
	private Room currentRoom;
	//Erzeugung der R�ume
	public Labyrinth() {
		floor = new Room("Flur" , "Dies ist der Flur" , null , null , null , null);
		westRoom = new Room("Westraum" , "Dies ist der Westraum" , null , floor , null , null);
		northRoom = new Room("Nordraum" , "Dies ist der Nordraum" , null , null , floor , null);
		eastRoom = new Room("Ostraum" , "Dies ist der Ostraum" , null , null , null , floor);
		southRoom = new Room("S�draum" , "Dies ist der S�draum" , floor , null , null , null);
		//Verkn�pfung des Flurs mit anderen R�umen, da sie nun erzeugt wurden.
		floor.setEast(eastRoom);
		floor.setNorth(northRoom);
		floor.setSouth(southRoom);
		floor.setWest(westRoom);
		//Festlegung des Startraums
		currentRoom = westRoom;
	}
	//s�mtliche getter und setter
	public Room getFloor() {
		return floor;
	}

	

	public Room getWestRoom() {
		return westRoom;
	}

	

	public Room getNorthRoom() {
		return northRoom;
	}

	

	public Room getEastRoom() {
		return eastRoom;
	}

	

	public Room getSouthRoom() {
		return southRoom;
	}

	

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
}
