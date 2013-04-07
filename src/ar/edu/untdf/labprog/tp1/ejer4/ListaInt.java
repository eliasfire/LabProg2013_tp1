/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4;

/**
 * 
 * @author Abraham
 */
public class ListaInt {
    private Ordenacion ordenacion;
	private int[] lista;

	public ListaInt(int[] list) {
		lista = list;
	}

	public Ordenacion getOrdenacion() {
		return ordenacion;
	}


	public void setOrdenacion(Ordenacion ordenacion) {
		this.ordenacion = ordenacion;
	}


	public int[] getLista() {
		return lista;
	}


	public void setLista(int[] lista) {
		this.lista = lista;
	}


	public void sort(int[] list) {
		this.ordenacion.ordenar(list);
	}

	public void printMe() {
		System.out.println();
		System.out.print("(");
		for (int x : lista) {
			System.out.print(x);
			System.out.print(" ");
		}
		System.out.print(")");
		System.out.println();
	}

}
