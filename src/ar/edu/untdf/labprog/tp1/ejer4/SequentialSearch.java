package ar.edu.untdf.labprog.tp1.ejer4;

public class SequentialSearch implements Busqueda {

	@Override
	public boolean buscar(int[] a, int b) {
		return this.contains(a, b);
	}

	public boolean contains(int[] a, int b) {
		for (int i : a) {
			if (i == b) {
				return true;
			}
		}
		return false;
	}


}