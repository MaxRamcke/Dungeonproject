package application;

public class Character {
	private double maxHealth;
	private double currentHealth;
	private double attack;
	private NPC enemy;
	
	public Character() {
		maxHealth = 100.00;
		currentHealth = maxHealth;
		attack = 0.00;
		enemy = null;
	}
	
	public Character(double maxHealth , double attack) {
		this.maxHealth = maxHealth;
		this.currentHealth = this.maxHealth;
		this.attack = attack;
		this.enemy = null;
	}
	
	public NPC getEnemy() {
		return enemy;
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

	public void setEnemy(NPC enemy) {
		this.enemy = enemy;
	}
	
		
	}

	