package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_practice {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", 10));
        fruits.add(new Fruit("pear", 12));
        fruits.add(new Fruit("pineapple", 1));
        fruits.add(new Fruit("grape", 3));
        fruits.add(new Fruit("banana", 15));

        Collections.sort(fruits, Fruit::compareTo);

        fruits.forEach(System.out::println);
    }
}

class Fruit implements Comparable<Fruit> {
    public String name;
    public int quantity;

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    static Comparator<Fruit> nameComparator = new Comparator<Fruit>() {
        @Override
        public int compare(Fruit o1, Fruit o2) {
            return o1.name.compareTo(o2.name);
        }
    };

    static Comparator<Fruit> quantComparator = new Comparator<Fruit>() {
        @Override
        public int compare(Fruit o1, Fruit o2) {
            return Integer.compare(o1.quantity, o2.quantity);
        }
    };

    // 기본은 name이다.
    @Override
    public int compareTo(Fruit o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}