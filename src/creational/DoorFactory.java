package creational;

/**
 * Created by hldo on 1/3/17.
 */
public class DoorFactory {
    public static Door makeDoor(double width, double height) {
        return new WoodenDoor(width, height);
    }

    public static void main(String[] args) {
        System.out.println("An example of Creational Design Pattern.");
        /** When creating an object is not just a few assignment and involves some logic **/

        Door door = DoorFactory.makeDoor(100.0, 200.0);
    }
}
