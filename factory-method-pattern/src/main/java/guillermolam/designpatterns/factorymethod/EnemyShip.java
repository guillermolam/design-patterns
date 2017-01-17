package guillermolam.designpatterns.factorymethod;

public abstract class EnemyShip {

	private String name;
	private double speed;
	private double directionX;
	private double directionY;
	private double amountOfDamage;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public double getDamage() {
		return amountOfDamage;
	}

	public void setDamage(double newDamage) {
		amountOfDamage = newDamage;
	}

	public void followHeroShip() {

		System.out.println(getName() + " is following the hero");

	}

	public void displayEnemyShip() {

		System.out.println(getName() + " is on the screen");

	}

	public void enemyShipShoots() {

		System.out.println(getName() + " attacks and does " + getDamage() + " damage to hero");

	}

}