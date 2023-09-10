package com.kn.Practice;

public class PracticePatterns6 
{
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i>=j)
			{
				System.out.print(j+" ");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i+j<=5)
			{
				System.out.print(j+" ");
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
