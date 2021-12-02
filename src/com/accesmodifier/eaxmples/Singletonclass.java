package com.accesmodifier.eaxmples;

public class Singletonclass 
{
	private static final Singletonclass Singletonclass = null;
	private static Singletonclass singleton = new Singletonclass( );
	
	   private void Singleton() { }

	   public static Singletonclass getInstance( ) {
	      return Singletonclass;
	   }

	  
	   protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton");
	   }
	}

