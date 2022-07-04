import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        String string = "";
        String binary = "";

        while (true) {
            System.out.println("1 for String to Binary.");
            System.out.println("2 for Binary to String.");
            System.out.println("0 for Exit");
            System.out.println();

            System.out.print("Enter Your Choice: ");
            choice = input.nextInt();
            input.nextLine();
            System.out.println();

            if (choice == 1) {
                System.out.print("Enter String: ");
                string = input.nextLine();

                binary = StringToBinary.stringToBinary(string);

                System.out.println("Binary: " + binary);
                System.out.println();
                System.out.println();
            }
            else if (choice == 2) {
                System.out.print("Enter Binary: ");
                binary = input.nextLine();

                string = BinaryToString.binaryToString(binary);

                System.out.println("String: " + string);
                System.out.println();
                System.out.println();
            }
            else if (choice == 0)
                break;
        }
    }
}
