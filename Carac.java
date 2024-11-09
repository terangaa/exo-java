package javaprogram;

import java.util.Locale;

public class Carac {
	 
	static int somme;
	static char Caractere;

	public Carac(int  a,int b)
	{
		
		
		somme = a + b;
		
	}
	public Carac()
	{
		
	}
	public void afficher()
	{
		System.out.println("la somme est " + somme);
		
	}

	public static void main(String[] args)
	{
		
		Carac c = new Carac(10,6);
		c.afficher();

	}

}
