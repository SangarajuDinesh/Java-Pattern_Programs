package com.kn.Practice;

public class PracticePattern7 
{
	public static void main(String[] args) 
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j>=7)
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
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if(j<=i)
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
