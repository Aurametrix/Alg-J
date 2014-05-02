public class wordcount
{
public static void main(String ar[])
{
System.out.println("count words with java");

    String str1 = "Counting words in this sentence";

    int wordCount = 1;

    for (int i = 0; i < str1.length(); i++) 
    {
        if (str1.charAt(i) == ' '&& str1.charAt(i+1)!=' ') 
        {
            wordCount++;
        } 
    }

    System.out.println("Sentence: " +str1);
    System.out.println("Word count is = " +(str1.length()- wordCount));
}
}

