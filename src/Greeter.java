
public class Greeter {
	private String name;
	private int age;
	
	public Greeter()
	{
		name = "Greeter";
		age = 0;
	}
	
	public Greeter(String inputName, int inputAge)
	{
		name = inputName;
		age = inputAge;
	}
	
	public String toString()
	{
		return "Name: " + name+ ". Age: " + age + ".";
	}
	
}
