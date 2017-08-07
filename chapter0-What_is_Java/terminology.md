**Compiler:** The compiler converts source code into a  low-level program.
In most compiled languages, the file containing the resulting low-level code is called an object  file.

**Linker:** A collection of object files are linked together to create an executable file (i.e., the operating system can load the executable into RAM to run the program). Another term for an executable is "(relocatable) machine code".

**Object File:** The result from compiling source code. An object file isn't easily read by a human but it may not be runnable on a computer. For example, if your program takes a square root of a number, your program will rely on the mathematical program (provided by the math library of the language) that actually determines how to compute a square root. The object file for the program will refer to the square root but will not have the code explaining how the square root computation works.

**Interpreter** An interpreted language takes each high-level statement, determines its low-level version and executes (while linking if need be) the result. This is done for each statement in succession (before the next high-level statement is even looked at). This  conversion is "on-the-fly", also called "as needed".

**Bytecode** The result from the Java compiler (often called the JVM compiler). Essentially it is an object file for a virtual machine, which allows it to be used on any machine that has Java. (However, bytecode is not an executable file.  To execute a bytecode file, you need to invoke a Java interpreter).

**Machine code:** The result from linking compiled source code (a collection of object files) together

**Source code** A high level programming language

**Platform** A specific target machine that code can be executed on. For example, if you compile a C++ program on a Windows machine, the executable file can be copied to any other machine but it will only run on other Windows machines but never another machine (e.g., a Mac or a Linux machine). A platform is determined by the target machine (along with its operating system).

**Java Runtime Environment (JRE):** A set of software tools for development of Java applications. It combines the Java Virtual Machine (JVM), platform core classes and supporting libraries.

**The Java Development Kit (JDK):** A software development environment used for developing Java applications and applets. It includes the Java Runtime Environment (JRE), an interpreter/loader (java), a compiler (javac), an archiver (jar), a documentation generator (javadoc) and other tools needed in Java development.

**JAR:** A Java Archive, or JAR file, contains all of the various components that make up a self-contained, executable Java application, deployable Java applet or, most commonly, a Java library to which any Java Runtime Environment can link. Java applications and libraries can contain hundreds of different files, including compiled Java source code, a manifest file, XML-based configuration data, JSON-based data files, images, sound clips and even security certificates. A JAR file is simply an aggregation of all of these resources into a single, compressed file.

**Java Virtual Machine (JVM):** An abstraction layer between a Java application and the underlying platform. As the name implies, the JVM acts as a “virtual” machine or processor. To the bytecodes comprising the program, they are communicating with a physical machine; however, they are actually interacting with the JVM.
