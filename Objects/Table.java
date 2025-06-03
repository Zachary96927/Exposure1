package Objects;

/*
* everything measured in cm and kg
 */

public class Table {
    // Attributes
    private double height;
    private double width;
    private double weight;
    private double price;
    private double length;

    // Default constructor
    // Method name is name of class
    public Table() {
        height = 23;
        width = 40;
        weight = 52;
        price = 50;
        length = 936;
    }

    public Table(double height, double width, double weight, double price, double length) {
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.price = price;
        this.length = length;
    }

    // Getters
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public double getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }
    public double getLength() {
        return length;
    }
    //Setters/mutators
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setWeight(double weight) {
        if(weight <= 1000) {
            this.weight = weight;
        }else{
            this.weight = 1000;
        }
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setLength(double length) {
        this.length = length;
    }
}