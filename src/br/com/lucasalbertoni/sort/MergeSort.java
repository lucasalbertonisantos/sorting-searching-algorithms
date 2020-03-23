package br.com.lucasalbertoni.sort;

public class MergeSort implements Sort{

	@Override
	public void sort(int[] val) {
		sort(val, 0, val.length);
	}

	private void sort(int[] val, int ini, int end) {
		if(end-ini>1) {
			int mid=(ini+end)/2;
			sort(val,ini,mid);
			sort(val,mid,end);
			merge(val,ini,mid,end);
		}
	}

	private void merge(int[] val, int ini, int mid, int end) {
		int[] temp = new int[end-ini];
		int tempCounter = 0;
		int iniCounter = ini;
		int midCounter = mid;
		
		while(iniCounter<mid && midCounter<end) {
			if(val[iniCounter]<val[midCounter]) {
				temp[tempCounter]=val[iniCounter];
				iniCounter++;
			}else {
				temp[tempCounter]=val[midCounter];
				midCounter++;
			}
			tempCounter++;
		}
		while(iniCounter<mid) {
			temp[tempCounter]=val[iniCounter];
			iniCounter++;
			tempCounter++;
		}
		while(midCounter<end) {
			temp[tempCounter]=val[midCounter];
			midCounter++;
			tempCounter++;
		}
		for(int i=0; i<temp.length; i++) {
			val[i+ini]=temp[i];
		}
	}

}
