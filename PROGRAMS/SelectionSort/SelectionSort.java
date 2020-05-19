/**
 * ===============================================================================
	4. To which complexity class does the following algorithm belong? 
	Consider N to be the length or size of the array or collection passed to
	the method. Explain your reasoning.
	public static int[] mystery1(int[] list) {
		int[] result = new int[2 * list.length];
		for (int i = 0; i < list.length; i++) {
			result[2 * i] = list[i] / 2 + list[i] % 2;
			result[2 * i + 1] = list[i] / 2;
		}
		return result;
	}
 * --------------------------------------------------------------------------
	This algorithm belongs to O(N) due to the following reason.
	
	* let Ci represents some constant time, N represents the number of inputs passes to the function
	* the time of each step can be computed as the 'time cost' multiply the 'frequency' of the code executed
		int[] result = new int[2 * list.length]; 	<-- C1*1
		for (int i = 0; i < list.length; i++) {		<-- C2*1 + C3*(N+1) + C4*N 
														(initialization is executed only once, comparison will be executed N+1 times, incrementation will be executed N times) 
			result[2 * i] = list[i] / 2 + list[i] % 2;	<-- C5*N
			result[2 * i + 1] = list[i] / 2;		<-- C6*N
		}
		return result;		<-- C7*1

		Sum of all steps 	T(N) = C1*1 + C2*1 + C3*(N+1) + C4*N + C5*N + C6*N + C7*1
							 = C7*N + C8
							 = O(N)			<-- Big O ignore constants and only take the dominant term

 * ===============================================================================
	5. To which complexity class does the following algorithm belong?
	public static void mystery2(int[] list) {
		for (int i = 0; i < list.length / 2; i++) {
			int j = list.length – 1 – i;
			int temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}
	}
* --------------------------------------------------------------------------
	This algorithm belongs to O(N) due to the following reason.
	
	* let Ci represents some constant time, N represents the number of inputs passes to the function
	* the time of each step can be computed as the 'time cost' multiply the 'frequency' of the code executed
		for (int i = 0; i < list.length / 2; i++) {		<-- C1*1 + C2*(N/2+1) + C3*(N/2)
															(initialization is executed only once, comparison will be executed N/2+1 times, incrementation will be executed N/2 times)
			int j = list.length – 1 – i;				<-- C4*(N/2)
			int temp = list[i];							<-- C5*(N/2)
			list[i] = list[j];							<-- C6*(N/2)
			list[j] = temp;								<-- C7*(N/2)
		}

		Sum of all steps 	T(N) = C1*1 + C2*(N/2+1) + C3*(N/2) + C4*(N/2) + C5*(N/2) + C6*(N/2) + C7*(N/2)
							 = C8*N + C9
							 = O(N)		<-- Big O ignore constants and only take the dominant term

 * ===============================================================================
	18. Write a modified version of the selection sort algorithm that selects the
	largest element each time and moves it to the end of the array, rather
	than selecting the smallest element and moving it to the beginning. Will
	this algorithm be faster than the standard selection sort? What will its
	complexity class (big-Oh) be?
 * =============================================================================== 
 */
public class SelectionSort {
	public static void swap(int[] list, int i, int j) {	// <-- just take some constant time since the time does not change with respect of the input size
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	
	public static void selectionSort(int[] a) {
		for (int i = a.length - 1; i > 0; i--) {		// <-- C1*1 + C2*N + C3*(N-1) 
			// find index of the largest element
			int largest = i;							// <-- C4*(N-1)
			for (int j = 0; j < i; j++) {				// <-- C5*(N-1) + (C6*(N*(N+1))/2 + 1) + (C7(N*(N+1))/2)
				if (a[j] > a[largest]) {				// <-- C8*(N*(N+1))/2
					largest = j;						// <-- C9*(N*(N+1))/2
				}
			}
			// swap largest to the end of array
			swap(a, i, largest); 						// <-- C10*(N-1)
		}
	}
}
/*
 * Both standard selection sort and the selection sort which takes the largest elements and moves it to the end of the array 
 * belong to the same time complexity of O(N^2). 
 * Therefore, we can not say that the algorithm that selects and moves the largest element to the end of array
 * is faster than the standard selection sort.
 *
 * 	T(N)	= C1*1 + C2*N + C3*(N-1) +  C4*(N-1) + C5*(N-1) + (C6*(N*(N+1))/2 + 1) + (C7(N*(N+1))/2) + C8*(N*(N+1))/2 + C9*(N*(N+1))/2 + C10*(N-1)
 *  		= C11*(N^2) + C12*(N) + C13
 *  		= O(N^2)	<-- Big O ignore constants and only take the dominant term
 */
