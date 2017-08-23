package DesignPatterns.Creational.Prototype;

/**
 * Created by 丛子涵 on 2017/8/23
 */
public class Dick implements Person {
    private final String NAME = "Dick";

    @Override
    public Person clone() {
        return new Dick();
    }

    @Override
    public String toString() {
        return "Dick{" +
                "NAME='" + NAME + '\'' +
                '}';
    }
}
