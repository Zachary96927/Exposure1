package Introduction;

public class Variable_intro {
    public static void main(String[] args) {

        /*
        *to create a variable
        * datatype name = value
         */
        int salary = 100;
        double bonus = 50;
        /*
        *Casting variable means changing datatype
        * to change primitive data type, put new type in ()
        * Example:
         */
        salary = (int) bonus;

        System.out.println(salary);
        System.out.println(bonus);
    }
}
