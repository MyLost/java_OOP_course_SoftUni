package interfaces_and_abstraction.border_control;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        LinkedList<Identifiable> citizensAndRobots = new LinkedList<>();
        while(!"End".equals(command)) {

            String[] imputTokens = command.split("\\s+");

            if(imputTokens.length == 2) {
                //construct robot
                Robot robot = new Robot(imputTokens[0], imputTokens[1]);
                citizensAndRobots.add(robot);
            } else {
                //construct citizen
                Citizen citizen = new Citizen(imputTokens[0], Integer.parseInt(imputTokens[1]), imputTokens[2]);
                citizensAndRobots.add(citizen);
            }
            command = scanner.nextLine();
        }
        String fakeIds = scanner.nextLine();
        List<Identifiable> fakes = citizensAndRobots.stream().filter(elem -> elem.getId().endsWith(fakeIds)).collect(Collectors.toList());
        fakes.stream().forEach(identif -> System.out.println(identif.getId()));
    }
}
