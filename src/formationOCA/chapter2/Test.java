package formationOCA.chapter2;

public class Test {

	public static void main(String[] args) {

		int x = 10, y = 20;
		// int y = ++x; // pré-incrément
		// int y = x++; //post incrément

		// int y = x--; // post-décrement
		// int y = --x; //pré-decrement
		// System.out.println("y = "+y);
		// System.out.println("x = "+x);

		/*if ((x> 100) & (++y > 30)) {
			System.out.println("Ok");
		}*/
		
		
		/*
		if ((x > 100) & (y++ > 30)) {
			System.out.println("Ok");
		}*/
		
		/*if ((x < 100) | (++y> 30)) {
			System.out.println("Ok");
		}*/
		//System.out.println("y="+y);
		
		//boolean res = (x>y)?"true":false;
		System.out.println((x>y)?"true":false);
		
		int v = (x>y)?1:-1;
		
		//System.out.println(res);
		System.out.println(v);

	}

}
