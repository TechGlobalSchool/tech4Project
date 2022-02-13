package operators.shortHandAssignmentOperators;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter
        their balance and one day transactions. Subtract each
        transaction from balance and return new balance using
        shorthand operator
         */

        Scanner transactionInput = new Scanner(System.in);

        System.out.println("Please enter your balance:");
        double balance = transactionInput.nextDouble();

        System.out.println("Enter your first transaction");
        double firstTran = transactionInput.nextDouble();
        balance -= firstTran; // balance has changed
        System.out.println("Balance after 1st transaction = $" + balance);

        System.out.println("Enter your second transaction");
        double secondTran = transactionInput.nextDouble();
        balance -= secondTran; // balance has changed
        System.out.println("Balance after 2nd transaction = $" + balance);

        System.out.println("Enter your third transaction");
        double thirdTran = transactionInput.nextDouble();
        balance -= thirdTran;
        System.out.println("Balance after 3rd transaction = $" + balance);
    }
}
