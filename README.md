Alg-J
=====

Algorithms in Java

Every public class is in a separate .java file where the first part 
of the file name is identical to the class name. File can also
contain protected and private classes.

To compile:
javac [ options ] [ sourcefiles ] [ classes ] [ @argfiles ]

Examples:
javac -g SourceCode.java
(-g  generates all debugging information, including local variables)

javac -d . Palindrome.java
running this creates a directory testpackage

Palindrome.java file must be moved to the package folder testpackage as
it should not located in the same directory as the Palintest.java file. 

To run:
java <class with main method to run> [<command line args>, ...] 

== Fitness
+ [Google Fit's REST API](https://developers.google.com/fit/rest/)
+ [Android fit examples](https://github.com/googlesamples/android-fit)
