package DesignPatterns.Creational.Prototype;

/**
 * Created by 丛子涵 on 2017/8/23
 */
public class Harry implements Person {
    private final String NAME = "Harry";

    @Override
    public Person clone() {
        return new Harry();
    }

    @Override
    public String toString() {
        return "Harry{" +
                "NAME='" + NAME + '\'' +
                '}';
    }
}
