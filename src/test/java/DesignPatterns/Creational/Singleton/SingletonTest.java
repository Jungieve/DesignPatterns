package DesignPatterns.Creational.Singleton;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by 丛子涵 on 2017/8/23
 */
public class SingletonTest extends TestCase {
    public void testSingleton() throws Exception {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
        System.out.println(object1 == object2);
    }

    public static Test suite() {
        return new TestSuite(SingletonTest.class);
    }
}
