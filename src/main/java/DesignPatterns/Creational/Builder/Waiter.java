package DesignPatterns.Creational.Builder;

/**
 * Created by 丛子涵 on 2017/8/28
 */
public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }
    public void constructPizz(){
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
