package inheritance.problem_05;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> data;

    public Stack() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        data.add(item);
    }

    public String pop() {
        return data.remove(data.size() -1);
    }

    public String peek() {
        return  data.get(data.size() - 1);
    }
}
