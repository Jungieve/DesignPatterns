package DesignPatterns.Creational.Prototype;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by 丛子涵 on 2017/8/23
 */
public class PrototypeTest  extends TestCase {
    public static Test suite() {
        return new TestSuite(PrototypeTest.class);
    }

    public void testPrototype() throws Exception {
        Person dick1 = PersonRegistry.getPrototype("Dick");
        System.out.println(dick1.toString());
        Person dick2 = PersonRegistry.getPrototype("Dick");
        System.out.println(dick2.toString());
        Person harry1 = PersonRegistry.getPrototype("Harry");
        System.out.println(harry1.toString());
        Person harry2 = PersonRegistry.getPrototype("Harry");
        System.out.println(harry2.toString());
        Person tom1 = PersonRegistry.getPrototype("Tom");
        System.out.println(tom1.toString());
        Person tom2 = PersonRegistry.getPrototype("Tom");
        System.out.println(tom2.toString());

        System.out.println(dick1.equals(dick2));
        System.out.println(harry1.equals(harry2));
        System.out.println(tom1.equals(tom2));

    }
}
