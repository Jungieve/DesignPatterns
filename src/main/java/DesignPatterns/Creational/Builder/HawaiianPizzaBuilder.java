package DesignPatterns.Creational.Builder;

/**
 * Created by 丛子涵 on 2017/8/28
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("cross");
    }

    public void buildSauce() {
        pizza.setSauce("mild");
    }

    public void buildTopping() {
        pizza.setTopping("ham+pineapple");
    }
}
