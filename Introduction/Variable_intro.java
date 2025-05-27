package Introduction;

public class Variable_intro {
    public static void main(String[] args) {

        /*
        *to create a variable
        * datatype name = value
         */
        int apples = 100;
        double bapple = 50;
        /*
        *Casting variable means changing datatype
        * to change primitive data type, put new type in ()
        * Example:
         */
        bapple = (int) apples;

        System.out.println(bapple);
        System.out.println(apples);
    }
}
