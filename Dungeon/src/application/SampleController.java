package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SampleController {
	//Erzeugung des Labyrinths um Funktionen möglich  zu machen
	@FXML
	private TextArea description;
	@FXML
	private Label roomName;
	@FXML
	private Label enemyName;
	@FXML
	private Label enemyHealth;
	@FXML 
	private Label health;
	private Labyrinth labyrinth;
	public void initialize() {
		labyrinth = new Labyrinth();
		description.setText(labyrinth.getCurrentRoom().getDescription());
		roomName.setText(labyrinth.getCurrentRoom().getRoomName());
		health.setText(Double.toString(labyrinth.getDu().getCurrentHealth()));
		if (labyrinth.getCurrentRoom().getEnemy() != null) {
			enemyName.setText(labyrinth.getCurrentRoom().getEnemy().getNname());
			enemyHealth.setText(Double.toString(labyrinth.getCurrentRoom().getEnemy().getCurrentHealth()));
		}
		else {
			enemyName.setText("");
			enemyHealth.setText("");
		}
	}
		
	//Funktion um nach Norden zu gehen, bricht ab, falls nicht möglich.
	public void moveNorth() {
		if(labyrinth.getCurrentRoom().getEnemy() != null && labyrinth.getCurrentRoom().getEnemy().getCurrentHealth() > 0.00) {
			description.setText("Du kannst den Raum nicht verlassen, solange sich darin ein lebender Gegnder befindet.");
		}
			else {
		if (labyrinth.getCurrentRoom().getNorth() != null) {
			labyrinth.setCurrentRoom(labyrinth.getCurrentRoom().getNorth());
			description.setText(labyrinth.getCurrentRoom().getDescription());
			roomName.setText(labyrinth.getCurrentRoom().getRoomName());
			health.setText(Double.toString(labyrinth.getDu().getCurrentHealth()));
			if (labyrinth.getCurrentRoom().getEnemy() != null) {
				enemyName.setText(labyrinth.getCurrentRoom().getEnemy().getNname());
				enemyHealth.setText(Double.toString(labyrinth.getCurrentRoom().getEnemy().getCurrentHealth()));
			}
			else {
				enemyName.setText("");
				enemyHealth.setText("");
			}
		}
		else {
			description.setText("Du kannst nicht nach Norden!");
		}
		}
		
		}
	
	//Funktion um nach Osten zu gehen, bricht ab, falls nicht möglich.
	public void moveEast() {
	if(labyrinth.getCurrentRoom().getEnemy() != null && labyrinth.getCurrentRoom().getEnemy().getCurrentHealth() > 0.00) {
		description.setText("Du kannst den Raum nicht verlassen, solange sich darin ein lebender Gegnder befindet.");
	}
		else {
			if (labyrinth.getCurrentRoom().getEast() != null) {
				labyrinth.setCurrentRoom(labyrinth.getCurrentRoom().getEast());
				description.setText(labyrinth.getCurrentRoom().getDescription());
				roomName.setText(labyrinth.getCurrentRoom().getRoomName());
				health.setText(Double.toString(labyrinth.getDu().getCurrentHealth()));
				if (labyrinth.getCurrentRoom().getEnemy() != null) {
					enemyName.setText(labyrinth.getCurrentRoom().getEnemy().getNname());
					enemyHealth.setText(Double.toString(labyrinth.getCurrentRoom().getEnemy().getCurrentHealth()));
				}
				else {
					enemyName.setText("");
					enemyHealth.setText("");
				}
			}
			else {
				description.setText("Du kannst nicht nach Osten!");
			}
		}
		
	}
	//funktion um nach Süden zu gehen, bricht ab falls nicht  möglich.
	public void moveSouth() {
		if(labyrinth.getCurrentRoom().getEnemy() != null && labyrinth.getCurrentRoom().getEnemy().getCurrentHealth() > 0.00) {
			description.setText("Du kannst den Raum nicht verlassen, solange sich darin ein lebender Gegnder befindet.");
		}
			else {
		if (labyrinth.getCurrentRoom().getSouth() != null) {
			labyrinth.setCurrentRoom(labyrinth.getCurrentRoom().getSouth());
			description.setText(labyrinth.getCurrentRoom().getDescription());
			roomName.setText(labyrinth.getCurrentRoom().getRoomName());
			health.setText(Double.toString(labyrinth.getDu().getCurrentHealth()));
			if (labyrinth.getCurrentRoom().getEnemy() != null) {
				enemyName.setText(labyrinth.getCurrentRoom().getEnemy().getNname());
				enemyHealth.setText(Double.toString(labyrinth.getCurrentRoom().getEnemy().getCurrentHealth()));
			}
			else {
				enemyName.setText("");
				enemyHealth.setText("");
			}
			 
		}
	}
}
	//Funktion um nach Westen zu gehen, bricht ab falls nicht mögich.
	public void moveWest() {
		if(labyrinth.getCurrentRoom().getEnemy() != null && labyrinth.getCurrentRoom().getEnemy().getCurrentHealth() > 0.00) {
			description.setText("Du kannst den Raum nicht verlassen, solange sich darin ein lebender Gegnder befindet.");
		}
			else {
		if (labyrinth.getCurrentRoom().getWest() != null) {
			labyrinth.setCurrentRoom(labyrinth.getCurrentRoom().getWest());
			description.setText(labyrinth.getCurrentRoom().getDescription());
			roomName.setText(labyrinth.getCurrentRoom().getRoomName());
			health.setText(Double.toString(labyrinth.getDu().getCurrentHealth()));
			if (labyrinth.getCurrentRoom().getEnemy() != null) {
				enemyName.setText(labyrinth.getCurrentRoom().getEnemy().getNname());
				enemyHealth.setText(Double.toString(labyrinth.getCurrentRoom().getEnemy().getCurrentHealth()));
			}
			else {
				enemyName.setText("");
				enemyHealth.setText("");
				
			}
		}
		}	
		
	}
	public void attack() {
		if (labyrinth.getCurrentRoom().getEnemy() != null && labyrinth.getCurrentRoom().getEnemy().getCurrentHealth() > 0.00) {
			labyrinth.getCurrentRoom().getEnemy().setCurrentHealth(labyrinth.getCurrentRoom().getEnemy().getCurrentHealth() - labyrinth.getDu().getAttack());
			description.setText("Du hast " + labyrinth.getDu().getAttack() + " Schaden gemacht");
			if (labyrinth.getCurrentRoom().getEnemy().getCurrentHealth() > 0.00) {
				enemyHealth.setText(Double.toString(labyrinth.getCurrentRoom().getEnemy().getCurrentHealth()));
			}
			else {
				enemyHealth.setText("tot");
			}
		}
		else {
			description.setText("Es gibt niemanden den du angeifen kannst.");
		}
	}
	
	//public void attackBack() {
		//labyrinth.getDu().setCurrentHealth(labyrinth.getDu().getCurrentHealth() - labyrinth.getCurrentRoom().getEnemy().getAttack());
		
	//}






















}



































