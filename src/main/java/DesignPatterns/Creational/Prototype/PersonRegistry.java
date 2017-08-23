package DesignPatterns.Creational.Prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by 丛子涵 on 2017/8/23
 */
public class PersonRegistry {
    private static final Map<String, Person> prototypes = new ConcurrentHashMap<String, Person>();

    static {
        prototypes.put("Tom",new Tom());
        prototypes.put("Harry", new Harry());
        prototypes.put("Dick", new Dick());
    }

    public static Person getPrototype(String type) {
        try {
            return prototypes.get(type).clone();
        } catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
        }
    }
}
