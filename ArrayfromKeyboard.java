import java.io.*;
import java.util.*;

public class ArrayfromKeyboard
{

 public static void main (String[] args) throws java.io.IOException
 {

  String s1;
  String s2;

  double num1, num2, product;

  // set up the buffered reader to read from the keyboard
  BufferedReader br = new BufferedReader (new InputStreamReader (
			System.in));

  System.out.println ("Enter an array of numbers");

  s1 = br.readLine();

  System.out.println ("Your input is " + s1.length() + " characters long");

  System.out.println ();
  System.out.println ("Breaking it into elements:");

  int numTokens = 0;
  StringTokenizer st = new StringTokenizer (s1);

  while (st.hasMoreTokens())
     {
      s2 = st.nextToken();
      numTokens++;
      System.out.println ("    Element " + numTokens + " is: " + s2);
     }
 }
}
