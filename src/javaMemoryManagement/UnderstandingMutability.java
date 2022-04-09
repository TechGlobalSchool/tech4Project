package javaMemoryManagement;

public class UnderstandingMutability {
    public static void main(String[] args) {
        String city = "Chicago";
        String address = "Chicago";

        city = "Miami";

        System.out.println(city); // Miami
        System.out.println(address); // Chicago
    }
}
