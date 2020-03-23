package br.com.lucasalbertoni.sort;

public class QuickSort implements Sort{

	@Override
	public void sort(int[] val) {
		sort(val,0,val.length-1);
	}

	private void sort(int[] val, int ini, int end) {
		if(ini<end) {
			int piv=split(val,ini,end);
			sort(val,ini,piv-1);
			sort(val,piv+1,end);
		}
	}

	private int split(int[] val, int ini, int end) {
		int pivot = val[end];
		int iniLessOne = ini-1;
		
		for(int i=ini; i<end; i++) {
			if(val[i]<=pivot) {
				iniLessOne++;
				swap(val,i,iniLessOne);
			}
		}
		swap(val,iniLessOne+1,end);
		
		return iniLessOne+1;
	}
	
	private void swap(int[] val, int from, int to) {
		int temp=val[from];
		val[from]=val[to];
		val[to]=temp;
	}

}
