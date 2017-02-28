package creational;

/**
 * Created by hldo on 1/3/17.
 */
public class testFactoryMethod {
    public static void main(String[] args) {
        /** Factory Method
         *  - Plain: delegate the instantiation logic to child classes
         *  - Wiki: use factory methods to deal with the problem of creating
         *          objects without having to specify the exact class of the
         *          object that will be created.
         *          - the factory method is either 1) specified in an interface
         *          and implemented by child classes, or
         *          2) implemented in a base class and optionally override by
         *          derived classes - rather than calling a constructor
         * **/
        HiringManager manager = new DevelopmentManager();
        manager.takeInterview();

        manager = new MarketingManager();
        manager.takeInterview();
    }
}
