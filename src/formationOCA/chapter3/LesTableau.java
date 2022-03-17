package formationOCA.chapter3;

public class LesTableau {

	public static void main(String[] args) {
		//Les tableaux uni-dim
		/*
		int [] tab= {10,20,30};
		int t[] = new int[4];
		System.out.println(t[0]);
		t[0]=12;
		
		String names[] = new String[3];*/
		
		//Les Tableaux Multi-dim
		
		int tab[][] = new int[3][];
		tab[0] = new int[2];
			tab[0][0]=1;
			tab[0][1]=2;
		tab[1] = new int[3];
			tab[1][0]=10;
			tab[1][1]=11;
			tab[1][2]=12;
		tab[2] = new int[4];
			tab[2][0]=100;
			tab[2][1]=101;
			tab[2][2]=102;
			tab[2][3]=103;
			
		System.out.println(tab.length);
		System.out.println(tab[0].length);
		System.out.println(tab[1].length);
		System.out.println(tab[2].length);
	}

}
