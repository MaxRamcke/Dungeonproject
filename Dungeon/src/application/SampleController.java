package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SampleController {
	//Erzeugung des Labyrinths um Funktionen m�glich  zu machen
	@FXML
	private TextArea description;
	@FXML
	private Label roomName;
	private Labyrinth labyrinth;
	public void initialize() {
		labyrinth = new Labyrinth();
		description.setText(labyrinth.getCurrentRoom().getDescription());
		roomName.setText(labyrinth.getCurrentRoom().getRoomName());
	}
	//Funktion um nach Norden zu gehen, bricht ab, falls nicht m�glich.
	public void moveNorth() {
		if (labyrinth.getCurrentRoom().getNorth() != null) {
			labyrinth.setCurrentRoom(labyrinth.getCurrentRoom().getNorth());
			description.setText(labyrinth.getCurrentRoom().getDescription());
			roomName.setText(labyrinth.getCurrentRoom().getRoomName());
		}
		else {
			description.setText("Du kannst nicht nach Norden!");
		}
	}
	//Funktion um nach Osten zu gehen, bricht ab, falls nicht m�glich.
	public void moveEast() {
		if (labyrinth.getCurrentRoom().getEast() != null) {
			labyrinth.setCurrentRoom(labyrinth.getCurrentRoom().getEast());
			description.setText(labyrinth.getCurrentRoom().getDescription());
			roomName.setText(labyrinth.getCurrentRoom().getRoomName());
		}
		else {
			description.setText("Du kannst nicht nach Osten!");
		}
	}
	//funktion um nach S�den zu gehen, bricht ab falls nicht  m�glich.
	public void moveSouth() {
		if (labyrinth.getCurrentRoom().getSouth() != null) {
			labyrinth.setCurrentRoom(labyrinth.getCurrentRoom().getSouth());
			description.setText(labyrinth.getCurrentRoom().getDescription());
			roomName.setText(labyrinth.getCurrentRoom().getRoomName());
			 
		}
		else {
			description.setText("Du kannst nicht nach S�den!");
		}
	}
	//Funktion um nach Westen zu gehen, bricht ab falls nicht m�gich.
	public void moveWest() {
		if (labyrinth.getCurrentRoom().getWest() != null) {
			labyrinth.setCurrentRoom(labyrinth.getCurrentRoom().getWest());
			description.setText(labyrinth.getCurrentRoom().getDescription());
			roomName.setText(labyrinth.getCurrentRoom().getRoomName());
		}
		else {
			description.setText("Du kannst nicht nach Westen!");
		}
	}
}
