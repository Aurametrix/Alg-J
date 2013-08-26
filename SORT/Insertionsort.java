public class Insertionsort {

	public static void main(String a[]){
		int i;
		int array[] = {12,9,4,99,120,1,3,10};
		System.out.println("This is how the list looks before the sort:\n");
		for(i = 0; i < array.length; i++)
			System.out.print( array[i]+"  ");
		System.out.println();
		InsSort(array);
		System.out.print("The list after sorting:\n");
		for(i = 0; i <array.length; i++)
			System.out.print(array[i]+"  ");
		System.out.println();
		System.out.println("PAUSE");
	}	
	

// if array is sorted, n - 1 comparisons, n(n-1)/2 otherwise 
  public static void InsSort (int [] array) {
    for (int i=1; i < array.length; i++) { 
      int temp = array[i];
      int j;
      for (j= i-1; j>=0 && temp < array[j]; j--)
        array[j+1] = array[j];
      array[j+1] = temp;
	}
  }
}
