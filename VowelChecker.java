import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < inputString.length(); i++) {
            if (vowels.indexOf(inputString.charAt(i)) != -1) {
                vowelCount++;
            }
        }

        System.out.println("Total number of vowels: " + vowelCount);
        if (vowelCount > 0) {
            System.out.println("Vowels are present in the string.");
        } else {
            System.out.println("No vowels are present in the string.");
        }
        scanner.close();
    }
}
