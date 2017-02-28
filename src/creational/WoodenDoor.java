package creational;

/**
 * Created by hldo on 1/3/17.
 * An example of Simple Factory
 */
public class WoodenDoor implements Door {
    protected double width;
    protected double height;

    public WoodenDoor(double _width, double _height) {
        width = _width;
        height = _height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }
}
