package package1;

public class InsertSort {
	public static void main(int[] num)
	{
		int j;
		int key;
		int i;
		
		for (j=1; j<num.length; j--)
		{
			key = num[j];
			for (i=j-1; (i>=0) && (num[i]<key); i--)
			{
				num[i+1] = num[i];
			}
			num[i+1]=key;
		}
	}

}
