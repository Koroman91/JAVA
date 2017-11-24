package package1;

public class SelectSort {
	
	public static void main(int[] num)
	{
		int i;
		int j;
		int first;
		int temp;
		for (i = num.length - 1; i > 0; i--)
		{
			first = 0; 
			for (j = 0; j <=i; j++)
			{
				if (num[j] < num[first])
					first = j;
			}
			temp = num[first];
			num[first] = num[i];
			num[i] = temp;
		}
	}

}
