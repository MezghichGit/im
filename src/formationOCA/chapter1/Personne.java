package formationOCA.chapter1;

import java.util.Date;

public class Personne {
	
	//attribut de classe
	static int nbrePersonne;
	
	
	// attributs d'instance
	String nom;
	int age;
	double moyenne;
	Date naissance;
	
	
	
	public Personne(String nom)
	{
		nbrePersonne++;	
		System.out.println("Constructeur avec paramètre nom");
		this.nom = nom;
	}
	
	public Personne(String nom, int age, double moy)
	{
		nbrePersonne++;
		System.out.println("Constructeur avec 3 paramètres");
		this.nom = nom;
		this.age = age;
		this.moyenne = moy;
	}
	
	
	public Personne()
	{
		nbrePersonne++;
		System.out.println("Constructeur par défaut");
	}
	
	// une méthode d'instance
	public void info()
	{
		nbrePersonne++;
		System.out.println("Une personne méthode d'instance");
	}
	
	// méthode de classe
	static void affichage()
	{
		Personne p = new Personne();
		System.out.println(p.nom);
		System.out.println("Méthode statique");
	}

	
	//bloc d'initilisation d'instance
		{
			System.out.println("Bloc d'initialisation d'instance 2");
		}
		
		
		{
			System.out.println("Bloc d'initialisation d'instance 1");
		}
		
		static{
			System.out.println("Bloc d'initialisation de classe");
		}
		
		
}

