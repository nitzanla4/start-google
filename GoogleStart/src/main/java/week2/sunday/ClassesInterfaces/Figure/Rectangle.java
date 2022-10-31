package week2.sunday.ClassesInterfaces.Figure;

public class Rectangle extends Figure {

    private double length;
    private double width;

    private Rectangle(double length, double width) {this.length = length;  this.width=width;}

    public Rectangle createRactangle (double length, double width)
    { return new Rectangle (length,width);}

    public double getLength() {return length;}

    public double getWidth() {return width;}

    @Override
    public double area() {return getLength()*getWidth();}
}
