package lesson16;

public class MyClass {
	public static void main(String args[])
	{
		Student mark = new Student();
		mark.setId(1);
		mark.setName("Stefan");
		mark.setAge(25);
		
		System.out.println(mark.getName() + " is " + mark.getAge() + " years old.");
	}

}
