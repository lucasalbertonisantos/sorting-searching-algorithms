package br.com.lucasalbertoni.sort;

public class SelectionSort implements Sort{

	@Override
	public void sort(int[] val) {
		for(int i=0; i<val.length-1; i++) {
			int min=i;
			for(int j=i;j<val.length;j++) {
				if(val[min]>val[j]) {
					min=j;
				}
			}
			if(i!=min) {
				int temp=val[i];
				val[i]=val[min];
				val[min]=temp;
			}
		}
	}

}
