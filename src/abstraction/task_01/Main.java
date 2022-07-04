package abstraction.task_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i ; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < n - i ; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
