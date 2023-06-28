package BubbleSort;

public class BubbleSortAssign {
	
	public static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
		System.out.println(" "+a[i]);
	}
	}
	public static void BubbleAssign(int a[])
	{
		int i,j,temp,size;
		int cnt=0,p=0;
		size=a.length;
		for(i=0;i<size-1;i++)
		{     p++;
		 
			for(j=0;j<size-1-i;j++)
			{    
				if(a[j]>a[j+1])
				{
					cnt++;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			display(a);
			
		}
		System.out.println("total no of swapping : "+cnt);
		System.out.println("total no of passes : "+p);
		for( i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]= {7,9,-3,4,5,17,6};
		BubbleAssign(arr);
	}
}
