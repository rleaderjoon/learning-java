import java.util.Scanner;

public class Icpc10952 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int a = -1;
        int b = -1;

        while (true) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(a + b);
        }

        scanner.close();
    }
}