package inheritance.problem_04;

import java.util.ArrayList;

public class RandomArrayList<T> extends ArrayList<T> {

    public T getRandomElement() {
        if(this.size() > 0) {
            return this.remove(0);
        }
        return null;
    }
}
