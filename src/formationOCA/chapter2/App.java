package formationOCA.chapter2;

enum Day {
	MONDAY, TUESDAY, WEDNESDAY
};

public class App {

	public static void main(String[] args) {
		/*
		int x = 10;
		x++;
		final int y = 4;
		
		  switch(x) { 
		  //default : System.out.println("Autre valeur");
		 case 0 : System.out.println("zéro"); break; 
		 case 2 : System.out.println("Deux");break; 
		 case y : System.out.println("Quatre"); break;
	
		 }
		
		Day d = Day.MONDAY;
		switch(d)
		{
		case MONDAY: System.out.println("C'est Lundi"); break;
		case TUESDAY: System.out.println("C'est Mardi"); break;
		}*/
		/*
		String names[] = {"Aala","Maher","Safwen"};
		for(int i = 0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}
		
		for(String name : names)
		{
			System.out.println(name);
		}*/
		
		
		outer:for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				//if(j==5) break outer;
				if(j==5) continue outer;
				System.out.println("(i,j) = "+i+","+j);
			}
		}
		
		System.out.println("Fin du programme");
	}

}
