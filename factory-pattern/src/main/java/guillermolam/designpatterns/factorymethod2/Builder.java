package guillermolam.designpatterns.factorymethod2;

import java.util.function.Supplier;

@FunctionalInterface
public interface Builder {
	void add(WeaponType name, Supplier<Weapon> supplier);
}