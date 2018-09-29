package application;

public class NPC {
	private String nname;
	private double maxHealth;
	private double currentHealth;
	private double attack;
	
	public NPC() {
		nname = "loser";
		maxHealth = 100.00;
		currentHealth = maxHealth;
		attack = 0.00;
	}
	
	public NPC(String nname , double maxHealth , double attack) {
		this.nname = nname;
		this.maxHealth = maxHealth;
		this.currentHealth = this.maxHealth;
		this.attack = attack;
	}

	public String getNname() {
		return nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	public double getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(double maxHealth) {
		this.maxHealth = maxHealth;
	}

	public double getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(double currentHealth) {
		this.currentHealth = currentHealth;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}
	
}
	
	