
Fizz Buzz
=========

Installation
------------

**If you are familiar with Git, GitHub & Maven** clone this repository, or a fork of it, and open it in your choice of
editor or IDE. You can run the tests through an IDE or with `mvn test`. 

**If not** please follow these steps:

 - Download a zip file of this repository (click the green "Clone or download" button above, then select "Download 
   Zip"). It will be named `fizzbuzz-master.zip` by default.

 - Unzip the zip file, leaving you with a folder named `fizzbuzz-master`.

 - Start IntelliJ (you can download the free Community Edition [here][intellij] if you don't already have it).

 - Choose the "Open" option, and select the `fizzbuzz-master` folder (**note**: not the `src` folder it contains).
 
 - If you see a warning about "Invalid VCS root mapping", just dismiss it.

 - If you see a message about importing a Maven project, select "Enable Auto-
   import".

 - Wait for the dependencies to download and everything to be indexed.
 
 - Open `src/test/java/FizzBuzzTest.java`, click on the green arrows next to line 6 and "Run 'FizzBuzzTest'.

**Either way**, if everything has gone well, you should see an message telling you that 1 of 1 tests failed.

Rules
-----

The rules for Fizz Buzz are as follows:

 - If a number is divisible by 3 (e.g. `3`, `6`, `9`), return `"Fizz"`;

 - If a number is divisible by 5 (e.g. `5`, `10`), return `"Buzz"`;
 
 - If a number is divisible by both 3 and 5 (e.g. `15`), return `"Fizz Buzz"`; and
 
 - If none of the above applies (e.g. `1`), return the number as a string (e.g. `"1"`).

Test-Driven Development
-----------------------

The rules of test-driven development (TDD) are as follows:

 1. **Red**: Always start with a failing test, in this case:
 
         java.lang.AssertionError: 
         Expected: "1"
              but: was null
              
    Pro tip: *always read the error* before moving on to the next step, it may not be what you were expecting.

 2. **Green**: Write the simplest code required to make the test pass; then

 3. **Refactor**: Consider whether you need to rewrite any part of your code or tests, e.g. to make it easier to follow.

Once you're happy with your solution so far, return to step 1 and continue until the task is complete.

The `FizzBuzzTest` class contains a single test to get you started; as above, given the input `1`, the `value` method
of the `FizzBuzz` class should return `"1"`. You can therefore move immediately to step 2 to begin with.

Pair programming
----------------

The point of the exercise is to solve the problem *as a pair*, so that you both understand all of the code you've
written. If you want any pointers, the content of the presentation is available online [here][blog].

 [blog]: https://blog.jonrshar.pe/2017/Oct/13/ada-college-pairing.html
 [intellij]: https://www.jetbrains.com/idea/download
