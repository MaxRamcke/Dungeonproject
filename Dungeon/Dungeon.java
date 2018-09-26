package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SampleController {
	@FXML
	Label label; 
	Labyrinth labyrinth;
	public void initialize() {
		labyrinth = new Labyrinth();
		label.setText(labyrinth.getCurrentRoom().getDescription());
	}
	
	public void moveNorth() {
		if (labyrinth.getCurrentRoom().getNorth() != null) {
			labyrinth.setCurrentRoom(labyrinth.getCurrentRoom().getNorth());
			label.setText(labyrinth.getCurrentRoom().getDescription());
		}
		else {
			label.setText("Du kannst nicht nach Norden!");
		}
	}
	
	public void moveEast() {
		if (labyrinth.getCurrentRoom().getEast() != null) {
			labyrinth.setCurrentRoom(labyrinth.getCurrentRoom().getEast());
			label.setText(labyrinth.getCurrentRoom().getDescription());
		}
		else {
			label.setText("Du kannst nicht nach Osten!");
		}
	}
	
	public void moveSouth() {
		if (labyrinth.getCurrentRoom().getSouth() != null) {
			labyrinth.setCurrentRoom(labyrinth.getCurrentRoom().getSouth());
			label.setText(labyrinth.getCurrentRoom().getDescription());
			 
		}
		else {
			label.setText("Du kannst nicht nach Süden!");
		}
	}
	
	public void moveWest() {
		if (labyrinth.getCurrentRoom().getWest() != null) {
			labyrinth.setCurrentRoom(labyrinth.getCurrentRoom().getWest());
			label.setText(labyrinth.getCurrentRoom().getDescription());
		}
		else {
			label.setText("Du kannst nicht nach Westen!");
		}
	}
}
