package recap.OOP;

public class Female extends Human{
    public Female(String firstName, String lastName, int age, double weight, double height, String dateOfBirth, String SSN) {
        super(firstName, lastName, age, weight, height, dateOfBirth, SSN);
    }

    public Female(String firstName, String lastName, int age, double weight, double height, String dateOfBirth, String SSN, String address) {
        super(firstName, lastName, age, weight, height, dateOfBirth, SSN, address);
    }

    @Override
    public void getJob() {
        System.out.println(firstName + " is looking for a job and getting the job if she is studying.");
    }
}
