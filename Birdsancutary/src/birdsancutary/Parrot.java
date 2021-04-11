package birdsantuary;

public class Parrot extends Bird implements Flyable {
	static int count;

	public void eat() {
		System.out.println("Parrot can eat.");
	}

	public void fly() {
		System.out.println("Parrot can fly.");
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void incrementCount() {
		count++;
	}

	@Override
	public void decrementCount() {
		count--;
	}
}