package application;

public class Labyrinth {
	private Character du;
	private NPC halim;
	private NPC robin;
	private NPC emilio;
	private Room floor;
	private Room westRoom;
	private Room northRoom; 
	private Room eastRoom;
	private Room southRoom;
	private Room currentRoom;
	//Erzeugung der Räume
	public Labyrinth() {
		du = new Character(100.00 , 20.0);
		halim = new NPC("Halim" , 69.00 , 12.00);
		robin = new NPC("Robin" , 110.00 , 10.0);
		emilio = new NPC("Emilio" , 80.00 , 19.0);
		floor = new Room("Flur" , "Dies ist der Flur" , null , null , null , null , null);
		westRoom = new Room("Westraum" , "Dies ist der Westraum" , null , floor , null , null , null);
		northRoom = new Room("Nordraum" , "Dies ist der Nordraum" , null , null , floor , null , halim);
		eastRoom = new Room("Ostraum" , "Dies ist der Ostraum" , null , null , null , floor , robin);
		southRoom = new Room("Südraum" , "Dies ist der Südraum" , floor , null , null , null , emilio);
		//Verknüpfung des Flurs mit anderen Räumen, da sie nun erzeugt wurden.
		floor.setEast(eastRoom);
		floor.setNorth(northRoom);
		floor.setSouth(southRoom);
		floor.setWest(westRoom);
		//Festlegung des Startraums
		currentRoom = westRoom;
		
	}
	
	public Character getDu() {
		return du;
	}

	public void setDu(Character du) {
		this.du = du;
	}

	public NPC getHalim() {
		return halim;
	}
	public void setHalim(NPC halim) {
		this.halim = halim;
	}
	public NPC getRobin() {
		return robin;
	}
	public void setRobin(NPC robin) {
		this.robin = robin;
	}
	public NPC getEmilio() {
		return emilio;
	}
	public void setEmilio(NPC emilio) {
		this.emilio = emilio;
	}
	//sämtliche getter und setter
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
