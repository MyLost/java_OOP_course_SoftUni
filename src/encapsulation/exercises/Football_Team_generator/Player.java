package encapsulation.exercises.Football_Team_generator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setEndurance(int endurance) {
        if(endurance < 0 || endurance > 100) {
            throw new IllegalArgumentException(String.format("Endurance should be between 0 and 100."));
        }
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        if(endurance < 0 || endurance > 100) {
            throw new IllegalArgumentException(String.format("Sprint should be between 0 and 100."));
        }
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        if(endurance < 0 || endurance > 100) {
            throw new IllegalArgumentException(String.format("Dribble should be between 0 and 100."));
        }
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        if(endurance < 0 || endurance > 100) {
            throw new IllegalArgumentException(String.format("Passing should be between 0 and 100."));
        }
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        if(endurance < 0 || endurance > 100) {
            throw new IllegalArgumentException(String.format("Shooting should be between 0 and 100."));
        }
        this.shooting = shooting;
    }

    public String getName() {
        return name;
    }

    public double overallSkillLevel() {
        double total = Math.round((endurance + sprint + dribble + passing + shooting) / 5.0);
        return  total;
    }
}
