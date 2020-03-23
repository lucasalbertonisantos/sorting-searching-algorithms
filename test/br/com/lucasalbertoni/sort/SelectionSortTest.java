package br.com.lucasalbertoni.sort;

public class SelectionSortTest {
	
	public static void main(String[] args) {
		int[] val = {99,1,55,6,33,4,2,15,74,14,87,56,57,9,8};
		int[] sor = {1,2,4,6,8,9,14,15,33,55,56,57,74,87,99};
		
		Sort sort = new SelectionSort();
		
		sort.sort(val);
		
		for(int i=0; i<val.length; i++) {
			if(val[i] != sor[i]) {
				throw new RuntimeException("The value "+val[i]+" is not equals with "+sor[i]+". Position: "+i);
			}
		}
		System.out.println("Everything is ok!");
	}

}
