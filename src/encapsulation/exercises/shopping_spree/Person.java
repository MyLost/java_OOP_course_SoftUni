package encapsulation.exercises.shopping_spree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> product;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.product = new ArrayList<>();
    }

    private void setName(String name) {
        if(name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if(money < 0 ) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct(Product product) {
        if(product.getCost() > money) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", name, product.getName()));
        }
        money = money -  product.getCost();
        System.out.println(String.format("%s bought %s", name, product.getName()));
        this.product.add(product);
    }

    public String getName() {
        return name;
    }

    public List<Product> getProduct() {
        return product;
    }
}
