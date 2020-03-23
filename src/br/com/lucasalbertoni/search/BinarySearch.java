package br.com.lucasalbertoni.search;

public class BinarySearch implements Search{

	@Override
	public int positionSearch(int[] val, int num) {
		return positionSearch(val, num, 0, val.length-1);
	}

	private int positionSearch(int[] val, int num, int ini, int end) {
		int mid = (end+ini)/2;
		if(ini>=end) {
			if(val[mid] == num) {
				return mid;
			}else {
				throw new RuntimeException("The number " + num + " does not exist!");
			}
		}
		if(val[mid] == num) {
			return mid;
		}else if(num > val[mid]) {
			return positionSearch(val, num, mid+1, end);
		}else {
			return positionSearch(val, num, ini, mid-1);
		}
	}

}
