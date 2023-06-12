import java.util.Scanner;

public class ExtractDigitsAndCheckPrime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                System.out.print(digit);
            }
        }
    }
}

  