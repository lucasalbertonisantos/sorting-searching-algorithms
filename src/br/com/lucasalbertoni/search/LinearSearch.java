package br.com.lucasalbertoni.search;

public class LinearSearch implements Search{

	@Override
	public int positionSearch(int[] val, int num) {
		for(int i=0; i<val.length; i++) {
			if(val[i] == num) {
				return i;
			}
		}
		throw new RuntimeException("The number " + num + " does not exist!");
	}

}
