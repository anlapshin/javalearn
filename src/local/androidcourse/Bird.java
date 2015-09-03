package local.androidcourse;

public class Bird extends Animal 
{
	private int height;
	public Bird(int weight, int length, int age, String name, int height)
	{
		super(weight,length,age,name);
		this.height = height;
	}
	public Bird()
	{
		
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
