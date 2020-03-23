package br.com.lucasalbertoni.sort;

import br.com.lucasalbertoni.search.BinarySearch;
import br.com.lucasalbertoni.search.Search;

public class BinarySearchTest {
	
	public static void main(String[] args) {
		int[] sor = {1,2,4,6,8,9,14,15,33,55,56,57,74,87,99};
		int numberSearch = 14;
		int expectedPosition = 6;
		
		Search search = new BinarySearch();
		
		int foundPosition = search.positionSearch(sor, numberSearch);
		if(expectedPosition == foundPosition) {
			System.out.println("Everything is ok! Found the number in the position " + foundPosition);
		}else {
			throw new RuntimeException("Wrong position! Expected: " + expectedPosition + " but Found: " + foundPosition);
		}
	}

}
