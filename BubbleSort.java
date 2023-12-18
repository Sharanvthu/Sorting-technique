package com.sortingtechniques;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		int[] num= {4,2,1,3};
		int size=num.length;
		int temp=0;
		System.out.println("Before Sort");
		for (int i : num) {
			System.out.print(i+" ");
		}
		/////////////////////using swap 
		for (int i = 0; i < size; i++) 
		{
			for (int j = 0; j < num.length-1; j++) 
			{
				if(num[j]>num[j+1])
				{
					temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					System.out.println();
					
				}
				
			}
			
		}
		System.out.println();
		System.out.println("After Sorting");
		for (int n : num) 
		{
			System.out.print(n+" ");
		}
		
	}

}
