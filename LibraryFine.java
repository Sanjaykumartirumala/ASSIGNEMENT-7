import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();

        if (daysLate > 21) {
            System.out.println("Membership will be canceled.");
        } else if (daysLate > 14) {
            System.out.println("Your fine is Rs. 5");
        } else if (daysLate > 7) {
            System.out.println("Your fine is Rs. 1");
        } else {
            System.out.println("Your fine is 50 paise");
        }
        scanner.close();
    }
}
