package com.scubatraing.examples;

import java.util.HashSet;

public class Listunielement {

	public static void main(String[] args) 
	{
	 HashSet<Integer> set=new HashSet<Integer>(); 	
	 int [] arr=new int [] {1,2,3,4,2,7,8,8,3};
	 System.out.println("duplicate element in array");
	 for (int i=0;  i<arr.length ;i++)
	 {
	 for(int j=i+1;j<arr.length;j++)
	 {
	System.out.println(arr[i]);	 
	 }
	}

}}
