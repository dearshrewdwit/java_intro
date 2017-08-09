# Chapter4-JavaBuzz-TDD-style

## Learning Objectives

- How to install and run JUnit tests in your console
- What annotations are
- Writing that first test
- Red, Green, Refactor in Java

## Instructions

### To complete this challenge, you will need to:
- [ ] Use the JUnit github repo as your guide.
- [ ] install the `.jar` (What's a jar?) that we'll use as a testing framework for Java called JUnit. You'll need the `.jar` of matchers too.
- [ ] make sure that you save or move the jars to the `/exercises` folder where we'll do our work at the moment
- [ ] double check that it's working by compiling `Example.java` and `ExampleTest.java` and then running the test class. You should get no failures.

*what does `-cp` mean? Run the command `java` to see what options we can pass it*
- [ ] change the assertion to break the test, re-compile, and then run it. Investigate the stack trace to see what information you can find about the test failure.

### Good job so far!! Spend perhaps a few minutes to investigate the new things in this JUnit test.

- [ ] what imports are needed?
- [ ] investigate what the `@Test` means. How does it work? Where does it come from?
- [ ] why are all the methods `public void`? What does it mean?
- [ ] investigate where our assertion method comes from. What else do we have available?

## OK. Back to JavaBuzz!

How are we going to do this for JavaBuzz? Take a few minutes to think about how this is going to work.

Have a look back at chapter 3's code for JavaBuzz. At the moment we have 1 big main method that executes if we run our program. And it executes by printing to the console. How could we break this down into its parts to test it?

- [ ] with your pair partner map some ideas down about how you could isolate functionality of JavaBuzz into testable units.

*We won't yet cover how to test printing to the console, so just test the logic you've written.*

---
*NB: we're going to do a lot of manual work here which would be automated in an IDE like intelliJ. This is the last chapter using just an editor. So if you're feeling brave go ahead and install one already!*
```sh
# terminal
> brew cask install intellij-idea
```

---
- [ ] prepare for Red, Green, Refactor :tada:
- [ ] write your first test. Keep it as small as possible. Follow the structure of `ExampleTest.java`.
- [ ] How can you use `@Before` to help dry out your tests? What import do you need to add to use it?
- [ ] Keep on going until you've written all the tests you think you need!

From scratch, you've just test-driven the development of fizzbuzz in Java.

# CONGRATS!!

### Resources

https://github.com/junit-team/junit4/wiki/Getting-started

[github: JUnit github][1]

[junit: how to write a simple test][2]

[stackoverflow: junit before and test][3]

[stackoverflow: do you need a main method][4]

[wikipedia: java annotation][5]

[oracle docs: java annotations][6]

[beginners book: static v non-static methods][7]

[oracle docs: defining a method][8]

[github: JUnit test runners][9]


## All done?! NICE! :tada:
Reflect on this exercise with your pair partner, maybe dive deeper into an area. Then keep on moving -> [chapter5][0]

[0]: ../chapter5-SOMETHING/README.md
[1]: https://github.com/junit-team/junit4/wiki/Getting-started
[2]: http://junit.org/junit4/faq.html#atests_1
[3]: https://stackoverflow.com/questions/531371/junit-before-and-test
[4]:https://stackoverflow.com/questions/2896322/is-the-main-method-must-needed-in-a-java-program
[5]:https://en.wikipedia.org/wiki/Java_annotation
[6]: https://docs.oracle.com/javase/tutorial/java/annotations/
[7]:http://beginnersbook.com/2013/05/static-vs-non-static-methods/
[8]:https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
[9]: https://github.com/junit-team/junit4/wiki/Test-runners
