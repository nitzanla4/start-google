package week2.sunday.ClassesInterfaces.Figure;

public class Circle extends Figure {
    private  double raduis;

    private Circle(double raduis) {this.raduis = raduis;}

    public Circle createCircle (double raduis)
    {
        return new Circle(raduis);
    }

    public double getRaduis() {return raduis;}

    @Override
    public double area() {return getRaduis() *Math.PI;}
}
