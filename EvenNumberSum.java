import java.util.Scanner;

public class EvenNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
 System.out.println(sum);
    }
}
