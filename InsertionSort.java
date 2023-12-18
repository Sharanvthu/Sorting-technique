package com.sortingtechniques;

import java.util.Arrays;

public class InsertionSort 
{

	public static void main(String[] args) 
	{
		int j,key=0;
		int[] arr= {5,2,1,4,3};
		for (int i = 1; i < arr.length; i++)
		{
			 key=arr[i];
			 System.out.println("i VALUE IS : "+i+" and value is :"+key);
			 j=i-1;
			 
			while (j>=0 && arr[j]>key ) 
			{
				System.out.println("J VALUE IS :"+j+" and value is :"+arr[j]);
				arr[j+1]=arr[j];
				j=j-1;
				
			}
			arr[j+1]=key;
			System.out.println("===============================");
		}
		System.out.println(Arrays.toString(arr));
	}

}
