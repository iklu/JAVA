public class Main {
    /**
     the name of the program. Not every class is a program. In order to define a program, a class
     must include a subroutine named main, with a definition that takes the form:
     public static void main(String[] args) {
     hstatements i
     }
     When you tell the Java interpreter to run the program, the interpreter calls this main()
     subroutine, and the statements that it contains are executed. These statements make up the
     script that tells the computer exactly what to do when the program is executed. The main()
     routine can call other subroutines that are defined in the same class or even in other classes,
     but it is the main() routine that determines how and in what order the other subroutines are
     used.
     The word “public” in the first line of main() means that this routine can be called from out-
     side the program. This is essential because the main() routine is called by the Java interpreter,
     which is something external to the program itself. The remainder of the first line of the routine
     is harder to explain at the moment; for now, just think of it as part of the required syntax.
     The definition of the subroutine—that is, the instructions that say what it does—consists of
     the sequence of “statements” enclosed between braces, { and }. Here, I’ve used hstatementsi as
     a placeholder for the actual statements that make up the program. Throughout this textbook,
     I will always use a similar format: anything that you see in hthis style of texti (italic in angle
     brackets) is a placeholder that describes something you need to type when you write an actual
     program.
     As noted above, a subroutine can’t exist by itself. It has to be part of a “class”. A program
     is defined by a public class that takes the form:
     public class hprogram-name i {
     hoptional-variable-declarations-and-subroutines i
     public static void main(String[] args) {
     hstatements i
     }
     hoptional-variable-declarations-and-subroutines i
     }
     The name on the first line is the name of the program, as well as the name of the class.
     (Remember, again, that hprogram-namei is a placeholder for the actual name!)
     If the name of the class is HelloWorld, then the class must be saved in a file called
     HelloWorld.java. When this file is compiled, another file named HelloWorld.class will
     be produced. This class file, HelloWorld.class, contains the translation of the program into
     Java bytecode, which can be executed by a Java interpreter. HelloWorld.java is called the
     source code for the program. To execute the program, you only need the compiled class file,
     not the source code.
     The layout of the program on the page, such as the use of blank lines and indentation, is not
     part of the syntax or semantics of the language. The computer doesn’t care about layout—you
     could run the entire program together on one line as far as it is concerned. However, layout is
     important to human readers, and there are certain style guidelines for layout that are followed
     by most programmers.
     *
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        DataOnly valueToIncrement = new DataOnly();

        valueToIncrement.i = 52;

        st1.i = 52;

        //value
        System.out.println(st1.i);

        //plus one
        Incrementable plus = new Incrementable();
        plus.increment();

        //plus one
        st1.i++;

        System.out.println(st1.i);

        DataOnly integer = new DataOnly();
        integer.b = true;

        System.out.println(integer.b);


    }
}
