package encapsulation.problem_03;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public Person(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    public void setFirstName(String firstName) {
        if(firstName.length() < 3 ) {
            throw new IllegalArgumentException("Name muse be at least 3 symbols");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age < 1) {
            throw new IllegalArgumentException("age must not be zero or negative");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if(salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.1f leva", firstName, lastName, salary);
    }

    public void increaseSalary(double bonus) {
        if(this.age < 30) {
            this.salary = salary + salary * bonus / 200;
        } else {
            this.salary = salary + salary * bonus / 100;
        }
    }
}
