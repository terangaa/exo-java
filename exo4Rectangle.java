package javaprogram;

public class exo4Rectangle {
	
	//longueur et largeur sont des entier privee
	private int  Longueur; 
	private int Largeur;
	
	//la class n'a aucune parametre 
	public exo4Rectangle() 
	{
	  //pour referencer l'objet courant et permet d'acceder aux membres de l'objet
		this.Longueur = 2;
		this.Largeur = 1;
	}
	
	//cette fois ci la class a un parametre qui est cote
	public exo4Rectangle(int cote) 
	{
		this.Longueur = cote;
		this.Largeur = cote;
	}
	
	// deux parametre longueur et largeur
	public exo4Rectangle(int Longueur,int Largeur) 
	{
		this.Longueur = Longueur;
		this.Largeur = Largeur;
	}
	public int perimetre()
	{
		return 2 * (Longueur + Largeur);
	}
	public int surface()
	{
		return (Longueur * Largeur);
	}
	public void afficher()
	{
		System.out.println("perimetre exo1 " + perimetre());
		System.out.println("surface exo1 " + surface());
	}
	public static void main(String[]args)
	{
		
		//creation d'un nouvelle instance de exo4Rectangle
		
		exo4Rectangle exo1 = new exo4Rectangle();
		exo4Rectangle exo2 = exo1;
		exo4Rectangle exo3 = exo1;
		exo1.afficher();
		//exo4Rectangle exo2 = new exo4Rectangle();
		//exo4Rectangle exo3 = new exo4Rectangle();
		
		//System.out.println("perimetre exo1 " + exo1.perimetre());
		//System.out.println("surface exo1 " + exo1.surface());
		
		//System.out.println("perimetre exo2 " + exo2.perimetre());
		//System.out.println("surface exo1 " + exo2.surface());
		
		//System.out.println("perimetre exo3 " + exo3.perimetre());
		//System.out.println("surface exo3 " + exo1.surface());
	}
}
