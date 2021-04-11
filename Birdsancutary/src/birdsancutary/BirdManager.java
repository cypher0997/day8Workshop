package birdsancutary;

import java.util.ArrayList;
import java.util.List;

class BirdManager {
	List<Bird> birdList = new ArrayList();
	
	public void addBird(Bird bird) {
		birdList.add(bird);
	}
	
	
	public void addEatingBirds() {
		for(Bird bird: birdList) {
			bird.eat();
		}
	}
		
	public void addFlyingBirds() {
		for(Bird bird: birdList) {
			if(bird instanceof Flyable) {
				((Flyable) bird).fly();
			}
		}
	}
	
	public void addSwimmingBirds() {
		for(Bird bird: birdList) {
			if(bird instanceof Swimable) {
				((Swimable) bird).swim();
			}
		}	
	}
}