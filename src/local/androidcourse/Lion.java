package local.androidcourse;

public class Lion extends Animal implements Predator {

	public Lion(int weight, int length, int age, String name) {
		super(weight, length, age, name);
		// TODO Auto-generated constructor stub
	}

	public Lion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eatPray() {
		// TODO Auto-generated method stub
		System.out.println("lion is eating a pray");
	}


}
