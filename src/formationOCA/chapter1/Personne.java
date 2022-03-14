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
		System.out.println("Une personne méthode d'instance");
	}
	
	static void affichage()
	{
		System.out.println("Méthode statique");
	}

}

