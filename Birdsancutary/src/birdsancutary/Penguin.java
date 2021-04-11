package birdsantuary;

public class Penguin extends Bird implements Swimable {
	static int count;

	public void swim() {
		System.out.println("Penguin can Swim.");
	}

	public void eat() {
		System.out.println("Penguin can Eat.");
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
