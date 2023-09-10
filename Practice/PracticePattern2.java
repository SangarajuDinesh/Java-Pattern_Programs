package com.kn.Practice;

public class PracticePattern2 
{
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i+j<=6)
			{
				System.out.print(j);
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i>=j)
			{
				System.out.print(j);
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
