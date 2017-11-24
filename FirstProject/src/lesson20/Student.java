package lesson20;

public class Student {
	
	String name;
	int age;
	
	static int numberOfStudents = 0;
	
	Student()
	{
		numberOfStudents++;
	}
	
	public static int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
