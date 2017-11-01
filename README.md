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


[Run Java in the browser (Console/AWT/Swing)](http://javafiddle.leaningtech.com/)
[Chrome Extension to run old Java Applets](http://dogfeathers.com/java/octicos.html)


Top mistakes
+ Neglecting Existing Libraries
+ Missing the ‘break’ Keyword in a Switch-Case Block
+ Memory Leaks
+ Excessive Garbage Allocation
+ Using Null References without Need
+ Ignoring Exceptions
+ Concurrent Modification Exception
+ Breaking Contracts
+ Using Raw Type Instead of a Parameterized One

+ Forgetting to Free Resources
+ Memory Leaks
+ Excessive Garbage Allocation
+ Using Null References without Need
+ Ignoring Exceptions
+ Concurrent Modification Exception
+ Breaking Contracts
+ Using Raw Type Instead of a Parameterized One
