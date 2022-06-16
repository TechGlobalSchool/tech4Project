package recap.OOP;

public class Human extends Responsibilities implements Tattoo{

    public Human(String firstName, String lastName, int age, double weight,
                 double height, String dateOfBirth, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.dateOfBirth = dateOfBirth;
        this.SSN = SSN;
    }

    public Human(String firstName, String lastName, int age, double weight,
                 double height, String dateOfBirth, String SSN, String address) {
        this(firstName, lastName, age, weight, height, dateOfBirth, SSN);
        this.address = address;
    }


    public String firstName;
    public String lastName;
    public int age;
    public double weight;
    public double height;
    public String dateOfBirth;

    private final String SSN;
    private String address;

    public static boolean hasArms;
    public static boolean hasLegs;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSSN() {
        return SSN;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", SSN='" + SSN + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void lookCool() {
        System.out.println(firstName + " looks cool!");
    }

    @Override
    public void getJob() {
        System.out.println(firstName + " is looking for a job and getting the job if " +  firstName +
                " is studying.");
    }

    @Override
    public void beHappy() {
        System.out.println(firstName + " is trying to be happy but miserably failing");
    }
}
