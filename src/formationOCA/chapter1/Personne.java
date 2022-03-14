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
		System.out.println("Constructeur avec param�tre nom");
		this.nom = nom;
	}
	
	public Personne(String nom, int age, double moy)
	{
		nbrePersonne++;
		System.out.println("Constructeur avec 3 param�tres");
		this.nom = nom;
		this.age = age;
		this.moyenne = moy;
	}
	
	
	public Personne()
	{
		nbrePersonne++;
		System.out.println("Constructeur par d�faut");
	}
	
	// une m�thode d'instance
	public void info()
	{
		nbrePersonne++;
		System.out.println("Une personne m�thode d'instance");
	}
	
	// m�thode de classe
	static void affichage()
	{
		Personne p = new Personne();
		System.out.println(p.nom);
		System.out.println("M�thode statique");
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

