package DesignPatterns.Creational.FactoryMethod;

/**
 * Created by 丛子涵 on 2017/8/23
 */
public class DecodedImage {
    private String image;

    public DecodedImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "DecodedImage{" +
                "image='" + image + '\'' +
                '}';
    }
}
