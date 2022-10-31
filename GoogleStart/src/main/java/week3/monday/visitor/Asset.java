package week3.monday.visitor;

public class Asset implements  Appliance{
    private int serial_number;
    private String owner;
    private double rating;

    public Asset(int serial_number, String owner, double rating) {
        this.serial_number = serial_number;
        this.owner = owner;
        this.rating = rating;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Asset{" +
                "serial_number=" + serial_number +
                ", owner='" + owner + '\'' +
                ", rating=" + rating +
                '}';
    }
}
