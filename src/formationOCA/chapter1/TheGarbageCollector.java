package formationOCA.chapter1;

public class TheGarbageCollector {

	public static void somme(int ...tab)
	{
		int som=0;
		for(int i =0; i<tab.length; i++)
		{
			som = som+tab[i];
		}
		System.out.println("Somme = "+som);
	}
	
	public static void main(String ...X ) {
		
		/*somme();
		somme(12,4);
		somme(3,8,9,10,55);*/
		/*
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant();
		Etudiant e3 = new Etudiant();
		
		
		e1=e2;
		e3=null;
		System.gc();
		for(int i =0; i<10000; i++)
		{
			System.out.println("i = "+i);
		}
		System.out.println("Suite du programme");
*/
	}

}
