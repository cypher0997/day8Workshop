package birdsantuary;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to bird Sanctuary");

		BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();

		Duck duck = new Duck();
		Duck duck2 = new Duck();
		Parrot parrot = new Parrot();
		Penguin penguin = new Penguin();

		birdSanctuaryManager.add(parrot);
		birdSanctuaryManager.add(duck);
		birdSanctuaryManager.add(duck2);
		birdSanctuaryManager.add(penguin);

		birdSanctuaryManager.printEatingBirds();
		birdSanctuaryManager.printFlyableBirds();
		birdSanctuaryManager.printSwimmableBirds();

		birdSanctuaryManager.remove(parrot);
		birdSanctuaryManager.remove(duck);

		System.out.println("Duck Count: " + Duck.count);
		System.out.println("Parrot Count: " + Parrot.count);
		System.out.println("Penguin Count: " + Penguin.count);

	}
}