package operators.shortHandAssignmentOperators;

public class ShortHandAssignment {

    public static void main(String[] args) {

        int age = 5;
        System.out.println(age);

        // reassign
        age += 3; //age = age + 3; oldAge -> 5 + 3
        System.out.println(age);

        age -= 2; // --> 6
        System.out.println(age);

        age *= 2; // --> 12
        System.out.println(age);

        age /= 3; // --> 4
        System.out.println(age);

        age %= 3; // --> 1
        System.out.println(age);
    }
}
