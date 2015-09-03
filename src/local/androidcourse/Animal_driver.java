package local.androidcourse;

public class Animal_driver {

	public static void main(String[] args) 
	{
		Animal kittie = new Animal(1,30,3,"catcatcat");
		System.out.println(kittie.getName());
		
		Bird dove = new Bird(1,30,5,"Dove",140);
		System.out.println("Dove flies on height "+ dove.getHeight() + " meters");
		
		Lion leo = new Lion(1,400,4,"Leo");
		leo.eatPray();
		System.out.println("created " + Animal.total + " animal instances");
	}

}
