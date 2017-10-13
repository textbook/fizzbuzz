Fizz Buzz
=========

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
