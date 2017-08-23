package DesignPatterns.Creational.Prototype;

/**
 * Created by 丛子涵 on 2017/8/23
 */
public class Tom implements Person {
    private final String NAME = "Tom";

    @Override
    public Person clone() {
        return new Tom();
    }

    @Override
    public String toString() {
        return "Tom{" +
                "NAME='" + NAME + '\'' +
                '}';
    }
}
