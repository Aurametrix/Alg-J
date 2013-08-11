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
		while (f < l)
		{
			if (A[f] == pivot || A[l] == pivot) 
			{
				System.out.println("list to sort should consist of distinct integers");
				System.exit(0);
			}
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
	
	// Usage: java QuickSort [integer] ...
	public static void main(String argv[])
	{
		int A[] = new int[argv.length];
		for (int i=0 ; i < argv.length ; i++)
			A[i] = Integer.parseInt(argv[i]);
		
		QuickSort(A, 0, argv.length-1);
		
		for (int i=0 ; i < argv.length ; i++) System.out.print(A[i] + " ");
		System.out.println();
	}
}