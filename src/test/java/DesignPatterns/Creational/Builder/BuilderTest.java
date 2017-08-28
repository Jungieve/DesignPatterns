package DesignPatterns.Creational.Builder;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by 丛子涵 on 2017/8/28
 */
public class BuilderTest extends TestCase {
    public static Test BuilderTestsuite() {
        return new TestSuite(BuilderTest.class);
    }

    public void testBuilder() throws Exception {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizz();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza.toString());

    }
}
