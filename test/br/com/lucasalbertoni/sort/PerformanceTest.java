package br.com.lucasalbertoni.sort;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class PerformanceTest {
	
	public static void main(String[] args) {
		int total = 100000;
		int[] valToSelectionSort = new int[total];
		int[] valToInsertionSort = new int[total];
		int[] valToMergeSort = new int[total];
		int[] valToQuickSort = new int[total];
		
		Random random = new Random();
		for(int i=0; i<total; i++) {
			int randomValue = random.nextInt();
			valToSelectionSort[i] = randomValue;
			valToInsertionSort[i] = randomValue;
			valToMergeSort[i] = randomValue;
			valToQuickSort[i] = randomValue;
		}
		
		long selectionSortSecondsTime = calculateTimeInSeconds(new SelectionSort(), valToSelectionSort);
		System.out.println("SelectionSort seconds time: " + selectionSortSecondsTime);
		long insertionSortSecondsTime = calculateTimeInSeconds(new InsertionSort(), valToInsertionSort);
		System.out.println("InsertionSort seconds time: " + insertionSortSecondsTime);
		long mergeSortSecondsTime = calculateTimeInSeconds(new MergeSort(), valToMergeSort);
		System.out.println("MergeSort seconds time: " + mergeSortSecondsTime);
		long quickSortSecondsTime = calculateTimeInSeconds(new QuickSort(), valToQuickSort);
		System.out.println("QuickSort seconds time: " + quickSortSecondsTime);
	}
	
	private static long calculateTimeInSeconds(Sort sort, int[] val) {
		LocalDateTime startTime = LocalDateTime.now();
		sort.sort(val);
		LocalDateTime endTime = LocalDateTime.now();
		return ChronoUnit.SECONDS.between(startTime, endTime);
	}

}
