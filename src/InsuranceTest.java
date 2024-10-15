import java.util.Scanner;

public class InsuranceTest {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Create Health Insurance Policy");
            System.out.println("2 - Create Term-Life Insurance Policy");
            System.out.println("3 - Exit \n");
            System.out.println("Enter Choice: ");

            int option = userinput.nextInt();

            if (option == 1) {
                //Input funcution call for option 1


            } else if (option == 2) {
                //Input function call for option 2
            } else if (option == 3) {
                //Input function call for option 3
            } else {
                System.out.println("Error: Please enter valid input");

            }
        }

    }


}
