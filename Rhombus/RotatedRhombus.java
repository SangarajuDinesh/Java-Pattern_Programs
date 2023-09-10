package com.kn.Rhombus;

public class RotatedRhombus 
{
public static void main(String[] args) {
	for(int i=1;i<=6;i++)
	{
		for(int j=1;j<=11;j++)
		{
			if(i+j<=12 && i+j>=7)
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
