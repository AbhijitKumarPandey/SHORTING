package Sorting;

public class Insertion_Sort {
	public static void InsertionSort(int[]arr) {
		for(int i=1; i<arr.length; i++) {
			int num = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>num) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = num;
		}
	}
	
	public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}
 
	public static void main(String[] args) {
		int [] arr = {45,67,20,12,10};
		
		System.out.println("Original Array ");
		printArray(arr);
		InsertionSort(arr);
		
		System.out.println("\nSorted Array ");
		InsertionSort(arr);
		printArray(arr);
	}

}
