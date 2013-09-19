package testpackage;

public class Palindrome
{
    public boolean test(String str)
    {
		System.out.println ("You passed " + str.length() + "-length string: " + str);
        char givenstring[];
        char reverse[] = new char[str.length()];
        boolean flag = true;
        int count = 0, ctr = 0;
        givenstring = str.toCharArray();
				System.out.println(givenstring);
        for(count = str.length() - 1; count >= 0; count++)
        {
            reverse[ctr] = givenstring[count];
			System.out.println ("count & ctr " + count + " " + ctr + " reverse: " + reverse[ctr]);
            ctr++;
			System.out.println ("count & ctr " + count + " " + ctr);
        }
        for(count = 0; count < str.length(); count++)
        {
            if(reverse[count] != givenstring[count])
            flag = false;
        }
        return flag;
    }

}

