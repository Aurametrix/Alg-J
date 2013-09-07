import testpackage.*;

class Palintest
{
    public static void main(String args[])
    {
        Palindrome objPalindrome = new Palindrome();
        System.out.println(objPalindrome.test(args[0]));
    }
}
