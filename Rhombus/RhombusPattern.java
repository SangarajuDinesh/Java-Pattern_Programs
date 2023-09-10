package com.kn.Rhombus;

public class RhombusPattern 
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=8;j++)
			{
				if(i<=j && j-i<=3)
				{
					System.out.print("*");
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
