package birdsantuary;

public class Duck extends Bird implements Flyable, Swimable {
	static int count;

	public void swim() {
		System.out.println("Duck can Swim.");
	}

	public void eat() {
		System.out.println("Duck can Eat.");
	}

	public void fly() {
		System.out.println("Duck can Fly");
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
