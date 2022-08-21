package abstraction.exercises.problem_04_traffic_lights;

public enum TrafficLights {
    RED,
    GREEN,
    YELLOW;

    public TrafficLights updateLight(TrafficLights light) {
        switch (light.name()) {
            case "RED":
                return TrafficLights.GREEN;
            case "GREEN":
                return TrafficLights.YELLOW;
            case "YELLOW":
                return TrafficLights.RED;
            default:
                throw new IllegalArgumentException("light not found!!! " + light.name());
        }
    }
    public static TrafficLights parse(String str) {
        return TrafficLights.valueOf(str);
    }
}
