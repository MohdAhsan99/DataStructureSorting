package InsertionSort;

public class Insertion {

	public static void display(int a[])
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(" " + a[i]);
		}
	}
	public static void InsertionAssign(int a[]) 
	{
		int key, j, size;
		size = a.length;
		for (int i = 1; i < size; ++i) 
		{
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > key) 
			{
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
		display(a);
	}
	public static void main(String[] args)
	{
		int arr[] = { 7, 5, 4, 6, 3 };
		InsertionAssign(arr);
		// display(arr);
	}
}
