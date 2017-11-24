package lesson17;

public class Cube {
	
	int length;
	int bredth;
	int height;
	
	public int getCubeValue()
	{
		return (length * bredth * height);
	}
	
	Cube()
	{
		length = 10;
		bredth = 20;
		height = 30;
	}
	
	Cube(int l, int b, int h)
	{
		length = l;
		bredth = b;
		height = h;
	}

}
