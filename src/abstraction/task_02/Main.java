package abstraction.task_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rectangularCoords = scanner.nextLine().split("\\s+");

        Rectangle rectangle = new Rectangle(
                new Point(Integer.parseInt(rectangularCoords[0]), Integer.parseInt(rectangularCoords[1])),
                new Point(Integer.parseInt(rectangularCoords[2]), Integer.parseInt(rectangularCoords[3])));

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] pointCoords = scanner.nextLine().split("\\s+");
            Point point = new Point(Integer.parseInt(pointCoords[0]), Integer.parseInt(pointCoords[1]));

            System.out.println(rectangle.contains(point));
        }
    }
}
