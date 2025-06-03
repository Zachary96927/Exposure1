package Objects;

public class IKEA {
    public static void main(String[] args) {
        // data type name == value
        int example = 1;
        Table table1 = new Table();
        String MyString  = "My String";

        System.out.println(table1.getWeight());

        table1.setWeight(9999.0);

        System.out.println(table1.getWeight());
    }



}
