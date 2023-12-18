package com.sortingtechniques;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] num= {4,2,1,3};
		int size=num.length;
		int temp=0;
		System.out.println(Arrays.toString(num));
		System.out.println("======================= ");
		for (int i = 0; i < size; i++) 
		{
			int minIndex=i;
			for (int j = i+1; j < num.length; j++) 
			{
				if(num[minIndex]<num[j])
					minIndex=j;
			}
			temp = num[minIndex];
			num[minIndex]=num[i];
			num[i]=temp;	
			System.out.println(Arrays.toString(num));
		}
		System.out.println();
		

System.out.println(Arrays.toString(num));
	}

}
