package abstraction.exercises.problem_04_traffic_lights;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<TrafficLights> lights = Arrays.stream(scanner.nextLine().split("\\s+")).map(light -> TrafficLights.parse(light)).collect(Collectors.toCollection(LinkedList::new));

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < lights.size(); j++) {
                TrafficLights light = lights.remove(j);
                lights.add(j, light.updateLight(light));
            }
            lights.forEach(item -> System.out.printf(item + " "));
            System.out.println();
        }
    }
}
