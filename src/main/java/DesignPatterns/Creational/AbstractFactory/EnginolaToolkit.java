package DesignPatterns.Creational.AbstractFactory;

/**
 * Created by 丛子涵 on 2017/8/22
 */
// class EnginolaFactory
public class EnginolaToolkit extends AbstractFactory {
    @Override
    public CPU createCPU() {
        return new EnginolaCPU();
    }

    @Override
    public MMU createMMU() {
        return new EnginolaMMU();
    }
}