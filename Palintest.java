import testpackage.*;

class Palintest
{
    public static void main(String args[])
    {
        Palindrome objPalindrome = new Palindrome();
		
		if (args.length < 1) {
			System.out.println ("You did not type anything to test, I suppose you are testing \"abba:\" ");
			System.out.println(objPalindrome.test("abba"));
		}
		else {
			System.out.println ("You typed: " + args.length + " args: " + args[0]);
			System.out.println(objPalindrome.test(args[0]));}
    }
}