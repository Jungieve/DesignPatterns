package DesignPatterns.Creational.Builder;

/**
 * Created by 丛子涵 on 2017/8/28
 */
public class Pizza {
    private String dough = "";
    private String sauce = "";

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    private String topping = "";
}
