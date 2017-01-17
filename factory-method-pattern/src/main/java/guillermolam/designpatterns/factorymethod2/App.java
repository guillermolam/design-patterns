package guillermolam.designpatterns.factorymethod2;

import java.util.logging.Logger;

public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());
	
	public static void main(String[] args) {
	    WeaponFactory factory = WeaponFactory.factory(builder -> {
	      builder.add(WeaponType.SWORD, Sword::new);
	      builder.add(WeaponType.AXE, Axe::new);
	      builder.add(WeaponType.SPEAR, Spear::new);
	      builder.add(WeaponType.BOW, Bow::new);
	    });
	    Weapon axe = factory.create(WeaponType.AXE);
	    LOGGER.info(axe.toString());
	}

}
