package local.androidcourse;

public class Animal
{
	private int weight;
	private int length;
	private int age;
	private String name;
	
	public static int total;
	
	public Animal(int weight, int length, int age, String name)
	{
		this.age = age;
		this.weight = weight;
		this.length = length;
		this.name = name;
		total ++;
	}
	
	public Animal()
	{
		
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if (weight > 0)
		{
			this.weight = weight;
		}
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		if(length > 0) 
		{
			this.length = length;
		}
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age > 0)
		{
			this.age = age;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void run()
	{
		System.out.println("the animal runs");
	}
	public void eat(String food)
	{
		System.out.println("the animal eats" + food);
	}
	
}