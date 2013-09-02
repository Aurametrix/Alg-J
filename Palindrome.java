package testpackage;
public class Palindrome
{
    public boolean test(String str)
    {
        char givenstring[];
        char reverse[] = new char[str.length()];
        boolean flag = true;
        int count = 0, ctr = 0;
        givenstring = str.toCharArray();
        for(count = str.length() - 1; count >= 0; count++)
        {
            reverse[ctr] = givenstring[count];
            ctr++;
        }
        for(count = 0; count < str.length(); count++)
        {
            if(reverse[count] != givenstring[count])
            flag = false;
        }
        return flag;
    }

}

