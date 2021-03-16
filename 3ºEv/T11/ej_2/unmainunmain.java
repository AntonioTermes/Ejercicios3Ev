package ej_2;

public class unmainunmain {
	
	public static void main(String[] args) {
		
		ListaDoujins lis1 = new ListaDoujins();
		Libro l1 = new Libro(177013, "Metamorphosis", 2002);
		Libro l2 = new Libro(222222, "AAAAAAAAAAAAAAAA", 2021);
		Revista r1 = new Revista(123123, "Quiero procrastinar", 1995, 2);
		Revista r2 = new Revista(323323, "AsDfGh", 1945, 7);
		lis1.agregar(l1);
		lis1.agregar(l2);
		lis1.agregar(r1);
		lis1.agregar(r2);
		l1.prestar();
		System.out.println(lis1);
		System.out.println(lis1.cuentaPrestados());
		System.out.println(lis1.publicacionesAnterioresA(1980));
		
	}

}
