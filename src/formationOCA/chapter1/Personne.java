package formationOCA.chapter1;

public class Personne {
	
	//attribut de classe
	static int nbrePersonne;
	
	
	// attributs d'instance
	String nom;
	int age;
	double moyenne;
	

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
		System.out.println("Une personne m�thode d'instance");
	}
	
	static void affichage()
	{
		System.out.println("M�thode statique");
	}

}

