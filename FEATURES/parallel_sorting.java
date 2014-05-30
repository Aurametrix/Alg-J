// sorting objects and primitive arrays

Array.sort(myArray);

public static void sort(Object[] a) {
  if (LegacyMergeSort.userRequested)
    legacyMergeSort(a);
  else
    ComparableTimSort.sort(a);
}


// automatically breaks up the target collection into several parts for parallelization
// benefits diminish in highly multi-threaded environments like a budy web counter
Arrays.parallelSort(myArray);


public class ArraysParallelDemo {
  public static void main(String[] args) throws FileNotFoundException {
    List<Double> arraySource = new ArrayList<>();
    
    Scanner reader = new Scanner(ClassLoader.
        getSystemResourceAsStream("java8demo/large_array_input"));
    while(reader.hasNext()){
      String line = reader.nextLine();
      String[] strNums = line.split(",");
      for ( String strN : strNums){
          arraySource.add(Double.parseDouble(strN));
      }
    }
    
    System.out.println(arraySource.size());
    
    Double [] myArray = new Double[1];
    myArray = arraySource.toArray(myArray);
    long startTime = System.currentTimeMillis();
    Arrays.sort(myArray);
    long endTime = System.currentTimeMillis();
    System.out.println("Time take in serial: "+
        (endTime-startTime)/1000.0);
    
    Double [] myArray2 = new Double[1];
    myArray2 = arraySource.toArray(myArray);
    startTime = System.currentTimeMillis();
    Arrays.parallelSort(myArray2);
    endTime = System.currentTimeMillis();
    System.out.println("Time take in parallel: "+
        (endTime-startTime)/1000.0);
      
  }
}
