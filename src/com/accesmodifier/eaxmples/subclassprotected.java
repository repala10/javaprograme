package com.accesmodifier.eaxmples;

public class subclassprotected extends accesmodifierProtected
{
  int s=10;
public void main()
{
System.out.println("run the java programe ");
}
public static void main(String []args)
{
subclassprotected  d= new subclassprotected() ;
System.out.println(d.s);
System.out.println(d.i);
}
}

