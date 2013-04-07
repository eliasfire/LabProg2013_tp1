package ar.edu.untdf.labprog.tp1.ejer4;

public class Quicksort implements Ordenacion{

	@Override
	public void ordenar(int[] list) {
		this.quicksort(list);
	}

	 private void quicksort(int[] list){
	     quicksort(list, 0,list.length-1);
	    }
	    private void quicksort(int[] list,int low,int high) {                         
			int i=low, j =high;
			int pivot = list[low + (high-low)/2];
			while (i <= j) {
				while (list[i] < pivot) {
					i++;
				}
				while (list[j] > pivot) {
					j--;
				}

				if (i <= j) {
					exchange(list, i, j);
					i++;
					j--;
				}
			}
			// Recursion
			if (low < j)
				quicksort(list, low, j);
			if (i < high)
				quicksort(list, i, high);
		}

		private void exchange(int[] list, int i, int j) {
			int temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}


}
