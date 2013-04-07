package ar.edu.untdf.labprog.tp1.ejer4;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	            int [] test={34,6,3,3,5,6,4,434,5,7,8,535,67,8,8,4,63464,7,8,6,86,85,54,6346,346,4,546,985};
	            ListaInt l =new ListaInt(test);
	            l.printMe();
	            l.setOrdenacion(new Quicksort()); // o new Mergesort()
	            l.sort(test);
	            l.printMe();
	            
	    }
}
