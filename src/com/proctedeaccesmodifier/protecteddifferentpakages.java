package com.proctedeaccesmodifier;

import com.accesmodifier.eaxmples.subclassprotected;

public class protecteddifferentpakages  extends subclassprotected 
{
 int se=111;
 public void main()
 {
System.out.println("scuba");
 }
public static void main (String []args)
{
protecteddifferentpakages 	a=new protecteddifferentpakages();
	System.out.println(a.se);
	//System.out.println(a.s);
 }}


