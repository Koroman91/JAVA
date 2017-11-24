package lesson36;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class MyClass {
	
	public static void main(String[] args)
	{
		try {
		File file = new File("fileName.txt");
		
		if (!file.exists())
		{
			
				file.createNewFile();
			} 
		
		PrintWriter pw = new PrintWriter(file);
		pw.println(10000);
		pw.close();
		System.out.println("Done");
		
		
		}  catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


