package com.example.telas;

public class Singleton {
	private static Singleton uniqueInstance;
	private String texto;
	private Singleton() {
		
	}

	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton();
		return uniqueInstance;
	}
	
	public void setText(String text)
	{texto = text;}
	
	public String getText()
	{return texto;}

}
