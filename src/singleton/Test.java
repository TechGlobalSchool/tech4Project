package singleton;

public class Test {
    public static void main(String[] args) {
        /*
        This is not possible anymore as constructor is private
        Driver d1 = new Driver();
        Driver d2 = new Driver();

        System.out.println(d1); // singleton.Driver@1540e19d
        System.out.println(d2); // singleton.Driver@677327b6
         */

        System.out.println(Driver.getDriver()); // singleton.Driver@1540e19d
        System.out.println(Driver.getDriver()); // singleton.Driver@1540e19d
        System.out.println(Driver.getDriver()); // singleton.Driver@1540e19d
    }
}
