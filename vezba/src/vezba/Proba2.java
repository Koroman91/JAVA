
package vezba;

import java.util.Scanner;


public class Proba2 {
	
	public static void main (String[] args)
	{
      float firstNumber,secondNumber, result;
     
        System.out.println("Enter first number: ");
		Scanner ins = new Scanner(System.in);
		firstNumber = ins.nextInt();
		System.out.println("Enter second number: ");
		secondNumber = ins.nextInt();
		System.out.println("1.Addition\n2.Subtract\n3.Multiplication\n4.Division\nEnter a choice number: ");
		int operator;
		operator = ins.nextInt();

		
		switch(operator)
		{
		case 1:
			result = add(firstNumber,secondNumber);
			System.out.println("Addition is: " +result);
			break;
		case 2:
			result = sub(firstNumber,secondNumber);
			System.out.println("Subtraction is: " +result);
			break;
		case 3:
			result = mul(firstNumber,secondNumber);
			System.out.println("Multiplication is: " +result);
			break;
		case 4:
			result = div(firstNumber,secondNumber);
		    System.out.println("Division is: " +result);
			break;
		default:
			System.out.println("Wrong operator!");
			break;
		}
		
	}	
		
		
		
		
		
		
		
		public static float add(float a, float b)
		{
			return a+b;
		}
		public static float sub(float a, float b)
		{
			return a-b;
		}
		public static float mul(float a, float b)
		{
			return a*b;
		}
		public static float div(float a, float b)
		{
			if (b==0)
			{
				System.out.println("Division with 0 is not possible!");
				return 0;
			}
			else
			{
			return a/b;
			}
		}
			
        
	}	
		
		
				
