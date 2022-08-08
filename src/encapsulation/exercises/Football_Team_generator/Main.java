package encapsulation.exercises.Football_Team_generator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Team> teams = new HashMap<>();

        while(!"END".equals(command)) {

            String[] inputTokens = command.split(";");

            String commandName = inputTokens[0];

            String teamName;
            String playerName;

            switch (commandName) {
                case "Team" :
                    teamName = inputTokens[1];
                    try {
                        Team team = new Team(teamName);
                        teams.put(teamName, team);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "Add" :
                    teamName = inputTokens[1];
                    playerName = inputTokens[2];
                    int endurance = Integer.parseInt(inputTokens[3]);
                    int sprint = Integer.parseInt(inputTokens[4]);
                    int dribble = Integer.parseInt(inputTokens[5]);
                    int passing = Integer.parseInt(inputTokens[6]);
                    int shooting = Integer.parseInt(inputTokens[7]);

                    try {
                        if(!teams.containsKey(teamName)) {
                            throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
                        }

                        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                        teams.get(teamName).addPlayer(player);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "Remove" :
                    teamName = inputTokens[1];
                    playerName = inputTokens[2];

                    try {
                        if(!teams.containsKey(teamName)) {
                            throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
                        }

                        Player player = null;
                        for (Player player1 : teams.get(teamName).getPlayers()) {
                            if(player1.getName().equals(playerName)) {
                                player = player1;
                            }
                        }

                        if(player == null) {
                            throw new IllegalArgumentException(String.format("Player %s is not in %s team.", playerName, teamName));
                        }

                        teams.get(teamName).removePlayer(player);

                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "Rating" :
                    teamName =  inputTokens[1];
                    try {
                        if(!teams.containsKey(teamName)) {
                            throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
                        }

                        System.out.println(String.format("%s - %.0f", teamName, teams.get(teamName).getRating()));

                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
