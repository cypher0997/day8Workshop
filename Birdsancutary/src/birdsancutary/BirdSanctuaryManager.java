package birdsantuary;

import java.util.ArrayList;
import java.util.List;

public class BirdSanctuaryManager {
	List<Bird> birdList = new ArrayList();

	public void add(Bird bird) {
		birdList.add(bird);
		bird.incrementCount();
	}

	public void remove(Bird bird) {
		birdList.remove(bird);
		bird.decrementCount();
	}

	public void printEatingBirds() {
		for (Bird bird : birdList) {
			bird.eat();
//			if(bird instanceof Parrot) {
//				((Parrot) bird).eat();
//			}
//			else if(bird instanceof Duck) {
//				((Duck) bird).eat();
//			}
		}
	}

	public void printFlyableBirds() {
		for (Bird bird : birdList) {
			if (bird instanceof Flyable) {
				((Flyable) bird).fly();
			}
		}
	}

	public void printSwimmableBirds() {
		for (Bird bird : birdList) {
			if (bird instanceof Swimable) {
				((Swimable) bird).swim();
			}
		}
	}

}