package com.scubatraing.examples;

public class you extends Thread
{
		public void run()
		{
			for (int i=1; i<=5; i++)
			{
				System.out.println("You");
				try
				{
					Thread.sleep(1000);
				}
				catch (Exception e)
				{

				}
			}
		}
	}

class Me extends Thread
{
public void run()
	{
		for (int i=1; i<=5; i++)
		{
			System.out.println("Me");
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{

			}}}}


		
	
