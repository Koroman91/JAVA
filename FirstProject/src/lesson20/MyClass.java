package lesson20;

public class MyClass {
	
	public static void main(String args[])
	{
		Student mark = new Student();
		System.out.println(mark.getNumberOfStudents());
		Student tom = new Student();
		System.out.println(tom.getNumberOfStudents());

		
		System.out.println(Student.getNumberOfStudents());
	}

}
