import java.util.Scanner;

public class tutorijal3 {
	public static void main(String atgs[])
	{
		Scanner bucky = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num:  ");
		fnum = bucky.nextDouble();
		System.out.println("Enter second num:  ");
		snum = bucky.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}

}
