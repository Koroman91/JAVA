package lesson8;

public class MyClass {
	public static void main(String args[])
	{
		int score = 90;
		
		switch(score)
		{
		case 100:
		case 90:
		System.out.println("Very good");
		break;
		case 80:
		case 70:
		case 60:
		System.out.println("Good");
		break;
		case 40:
		System.out.println("Ok");
		break;
		default:
		System.out.println("The grades are not defined");
		break;
		}
	}

}
