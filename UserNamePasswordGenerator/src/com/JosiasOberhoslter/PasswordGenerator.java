package com.JosiasOberhoslter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PasswordGenerator 
{
	public void Generator()
	{
		String[] number = {"1","2","3","4","5","6","7","8","9","0"};
		String[] extra = {"!","@","#","$","%","&","*"};
		
		String userName = null;
		int x;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please insert name to be converted to password");
		
		try
		{
			userName = reader.readLine();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		char[] name = userName.toCharArray();
		int nameLength = name.length;	
		int numberLength = number.length;
		int extraLength = extra.length;
		
		for(x = 1; x <= nameLength; x++)
		{

			int rand = (int) Math.ceil(Math.random()* 5);
			String numRand = Integer.toString(rand);
			
			if(numRand.equals("1"))
			{
				int nameRand = (int) (Math.random()* nameLength);
				char namePass = name[nameRand];
				
				System.out.print(namePass);
			}
			else if(numRand.equals("2"))
			{
				int nameRand = (int) (Math.random()* nameLength);
				char namePass = name[nameRand];
				
				System.out.print(namePass);
			}
			else if(numRand.equals("3"))
			{
				int nameRand = (int) (Math.random()* nameLength);
				char namePass = name[nameRand];
				
				System.out.print(namePass);
			}
			else if(numRand.equals("4"))
			{
				int numberRand = (int) (Math.random()* numberLength);
				String numberPass = number[numberRand];
				
				System.out.print(numberPass);
			}
			else if(numRand.equals("5"))
			{
				int extraRand = (int) (Math.random()* extraLength);
				String extraPass = extra[extraRand];
				
				System.out.print(extraPass);
			}
		}		
	}
}
