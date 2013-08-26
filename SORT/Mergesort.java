import java.io.*;
import java.util.Arrays;


public class MergeSort {
	
    public static void main(String[] args) throws IOException{

		System.out.println ("How large is your list?");

		BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(R.readLine());
				
		System.out.println ("Start entering numbers from your list, one at a time");
		
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = Integer.parseInt(R.readLine());
        }
        mergeSort(inputArray);
		
		System.out.println ("Sorted list:  ");
        for (int j = 0; j < inputArray.length; j++) {
            System.out.println(inputArray[j]);
        }
		
    }
	
    static void mergeSort(int[] A) {
        if (A.length > 1) {
            int q = A.length/2;
			
            int[] leftArray = Arrays.copyOfRange(A, 0, q);
            int[] rightArray = Arrays.copyOfRange(A,q,A.length);
			
            mergeSort(leftArray);
            mergeSort(rightArray);
			
            merge(A,leftArray,rightArray);
        }
    }
	
    static void merge(int[] a, int[] l, int[] r) {
        int totElem = l.length + r.length;
        //int[] a = new int[totElem];
        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
        //return a;
		
    }
	
}