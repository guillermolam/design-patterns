package guillermolam.designpatterns.factorymethod2;

import java.util.EnumMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

@FunctionalInterface
public interface WeaponFactory {

	Weapon create(WeaponType name);

	static WeaponFactory factory(Consumer<Builder> consumer) {
		EnumMap<WeaponType, Supplier<Weapon>> map = new EnumMap<>(WeaponType.class);
		consumer.accept(map::put);
		return name -> map.get(name).get();
	}
}