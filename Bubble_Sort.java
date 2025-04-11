package Sorting;

public class Bubble_Sort {
	static void Bubblesort(int[]a) {
		int n = a.length;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]= temp;
				}
			}
		}
	}


public static void main(String[] args) {
	int [] a= {4,5,6,7,8,9,2,3,1};
	Bubblesort(a);
	for(int i=0; i<a.length; i++) {
		System.out.print(i+" ");
	}
	
}

}
