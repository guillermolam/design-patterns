package guillermolam.designpatterns.factorymethod;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		startEnemyShip();
	}

	public static void startEnemyShip() {
		// Create the factory object
		EnemyShipFactory shipFactory = new EnemyShipFactory();

		// Enemy ship object
		Scanner userInput = new Scanner(System.in);
		System.out.print("What type of ship? (U / R / B) > ");

		if (userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine();
			EnemyShip theEnemy = shipFactory.makeEnemyShip(typeOfShip);
			if (theEnemy != null) {
				theEnemy.displayEnemyShip();
				theEnemy.followHeroShip();
				theEnemy.enemyShipShoots();
			} else
				System.out.print("Please enter U, R, or B next time");
		}
	}

}
