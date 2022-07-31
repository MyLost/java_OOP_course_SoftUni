package inheritance.problem_04;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<String> random = new RandomArrayList();

        random.add("Alice");
        random.add("Sam");
        random.add("Kali");
        random.add("Tom");
        random.add("Rona");

        System.out.println(random.getRandomElement());
        System.out.println(random.getRandomElement());
        System.out.println(random.getRandomElement());
        System.out.println(random.getRandomElement());
    }
}
