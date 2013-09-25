import java.io.*;
import java.util.*;

public class QuickSort
{
	public static void swap (int A[], int x, int y)
	{
		int temp = A[x];
		A[x] = A[y];
		A[y] = temp;
	}
	
	// Reorganizes the given list so all elements less than the first are 
	// before the first element and all greater elements are after it.                   
	public static int partition(int A[], int f, int l)
	{
		int pivot = A[f];
		
//		for (int i=0 ; i < l ; i++)
//		    System.out.print("inside partition: " + A[i] + " \n");
// prints the list and pivot for debugging		
//		System.out.print("compare " + A[f] + " and " + A[l] + " and " + pivot + " \n");
		
		while (f < l)
		{
			//if (A[f] == pivot || A[l] == pivot) 
			//{
		//		System.out.println("list to sort should consist of distinct integers");
		//		System.exit(0);
		//	}  program will hang if there are repeated integers
			while (A[f] < pivot) f++;
			while (A[l] > pivot) l--;
			swap (A, f, l);
		}
		return f;
	}
	
	public static void QuickSort(int A[], int f, int l)
	{
		if (f >= l) return;
		int pivot_index = partition(A, f, l);
		QuickSort(A, f, pivot_index);
		QuickSort(A, pivot_index+1, l);
	}
	
	// Usage: java QuickSort [list of distinct integers]
	public static void main(String argv[])
	{

		int firstArg;		
		if (argv.length > 0) {
			try {
				firstArg = Integer.parseInt(argv[0]);
			} catch (NumberFormatException e) {
				System.err.println("Argument" + " must be an integer");
				System.exit(1);
			}
		}
		
		
			
		int A[] = new int[argv.length];
		    System.out.println("you entered " + argv.length + " values");
			System.out.println("Sorting ...");
		for (int i=0 ; i < argv.length ; i++)
			A[i] = Integer.parseInt(argv[i]);

		QuickSort(A, 0, argv.length-1);
		
		for (int i=0 ; i < argv.length ; i++) System.out.print(A[i] + " ");
		System.out.println();
	}
}