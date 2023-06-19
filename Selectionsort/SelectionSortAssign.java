package Selectionsort;

import java.util.Scanner;

public class SelectionSortAssign {
	public static void display(Employee[] a)
	{
		for(int i=0;i<a.length;i++)
		{
		System.out.println(" "+a[i]);
	}
	}
	
	public static void selection(Employee[] b)
	{
		int i,j,size;
		//int cnt=0,p=0;
		Employee min;
		int index;
		size=b.length;
		for(i=0;i<size;i++)
		{  
			min=b[i];
			index=i; 
			for(j=i+1;j<size;j++)
			{    
				if(b[j].getSalary()<min.getSalary())
				{
				
					min=b[j];
					index=j;
				}
				
			}
			b[index]=b[i];
			b[i]=min;
	}
		for( i=0;i<size;i++)
		{
		System.out.println(b[i]);
		}	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Employee [] e1= new Employee[size];
		int empid;
		String name;
		double salary;
		int cnt=0;
		for(int i=0;i<size;i++)
		{
			empid = sc.nextInt();
			name = sc.next();
			salary = sc.nextDouble();
			 e1[cnt]=new Employee(empid, name, salary);
			cnt++;
			
		}
		for(int i=0;i<size;i++)
		{
		System.out.println(e1[i]);
		}	
		selection(e1);
	}

}
