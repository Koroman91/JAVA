
public class tutorial41 {
	
	public static void main(String[] args)
	{
		tutorial39 tunaObject = new tutorial39();
		tutorial39 tunaObject2 = new tutorial39(5);
		tutorial39 tunaObject3 = new tutorial39(5,13);
		tutorial39 tunaObject4 = new tutorial39(5,13,43);
		
		System.out.printf("%s\n", tunaObject.toMilitary());
		System.out.printf("%s\n", tunaObject2.toMilitary());
		System.out.printf("%s\n", tunaObject3.toMilitary());
		System.out.printf("%s\n", tunaObject4.toMilitary());
	}

}
