package br.com.lucasalbertoni.sort;

public class InsertionSort implements Sort{

	@Override
	public void sort(int[] val) {
		for(int i=1; i<val.length; i++) {
			int init=val[i];
			int j=i-1;
			while(j>=0 && init<val[j]) {
				val[j+1]=val[j];
				j--;
			}
			val[j+1]=init;
		}
	}

}
