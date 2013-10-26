/*
 * The java.util.regex package primarily consists of three classes:  
 * * Pattern
 * * Matcher
 * * PatternSyntaxException
 *
 */


import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class textcollector {
	
    public static void main(String[] args){
        Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        while (true) {
			
            Pattern pattern = 
            Pattern.compile(console.readLine("%nEnter your pattern: "));
			
            Matcher matcher = 
            pattern.matcher(console.readLine("Enter your text to search for patterns: "));
			
            boolean found = false;
            while (matcher.find()) {
                console.format("I found the pattern" +
							   " \"%s\" starting at " +
							   "position %d and ending at position %d.%n",
							   matcher.group(),
							   matcher.start(),
							   matcher.end());
                found = true;
            }
            if(!found){
                console.format("I did not find any matches.%n");
            }
        }
    }
}
