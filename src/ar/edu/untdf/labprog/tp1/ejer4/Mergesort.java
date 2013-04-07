package ar.edu.untdf.labprog.tp1.ejer4;

public class Mergesort implements Ordenacion{

	@Override
	public void ordenar(int[] list) {
		this.mergesort(list);		
	}
	
	  private void mergesort(int[] lista){
	        mergesort(lista, 0,lista.length-1, new int[lista.length]);
	    }
	    private void mergesort(int[] lista,int low, int high,int[] helper) {		
			if (low < high) {			
				int middle = (low + high) / 2;			
				mergesort(lista,low, middle,helper);			
				mergesort(lista,middle + 1, high,helper);			
				merge(lista, low, middle, high,helper);
			}
		}

		private void merge(int[] lista,int low, int middle, int high,int [] helper) {
			for (int i = low; i <= high; i++) {
				helper[i] = lista[i];
			}
			int i = low;
			int j = middle + 1;
			int k = low;		
			while (i <= middle && j <= high) {
				if (helper[i] <= helper[j]) {
					lista[k] = helper[i];
					i++;
				} else {
					lista[k] = helper[j];
					j++;
				}
				k++;
			}		
			while (i <= middle) {
				lista[k] = helper[i];
				k++;
				i++;
			}
	        }
		
}
