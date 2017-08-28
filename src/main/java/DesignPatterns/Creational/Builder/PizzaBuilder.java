package DesignPatterns.Creational.Builder;

/**
 * Created by 丛子涵 on 2017/8/28
 */
abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct(){
        pizza = new Pizza();
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();
}
