import java.util.ArrayList;
import java.util.Scanner;

public class InsuranceTest {
    public static void main(String[] args) {
        ArrayList<InsurancePolicy> policies = new ArrayList<>();
        Scanner userinput = new Scanner(System.in);

        int option = 0;

        while (option != 3) {
            System.out.println("1 - Create Health Insurance Policy");
            System.out.println("2 - Create Term-Life Insurance Policy");
            System.out.println("3 - Exit \n");
            System.out.println("Enter Choice: ");

            if (userinput.hasNextInt()) {
                option = userinput.nextInt();

                if (option == 1) {
                    System.out.println("Enter name of policy holder: ");
                    String name = userinput.next();
                    System.out.println("Enter deductible Amount: ");
                    double deductibleAmount = userinput.nextDouble();
                    System.out.println("Enter co-Payment: ");
                    double coPayment = userinput.nextDouble();
                    System.out.println("Enter total out-of-pocket amount: ");
                    double totalOutOfPocket = userinput.nextDouble();

                    //health insurance object to policies list

                } else if (option == 2) {
                    System.out.println("Enter name of policy holder: ");
                    String name = userinput.next();
                    System.out.println("Enter name of beneficiary: ");
                    String beneficiary = userinput.next();
                    System.out.println("Enter number of years in term: ");
                    int term = userinput.nextInt();
                    System.out.println("Enter amount of payout: ");
                    double amount = userinput.nextDouble();

                    //term-Life insurance object to policies list

                } else if (option == 3) {
                    break;

                } else {
                    System.out.println("Error: Please enter valid input");
                    System.out.println(" ");
                }

            } else {
                System.out.println("Error: Please enter valid input");
                System.out.println(" ");
                userinput.next();
            }
        }

        // print the contents of the insurance list

        userinput.close();
    }
}
