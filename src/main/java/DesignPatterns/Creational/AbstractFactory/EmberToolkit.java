package DesignPatterns.Creational.AbstractFactory;

/**
 * Created by 丛子涵 on 2017/8/22
 */
// class EemberToolFactory
public class EmberToolkit extends AbstractFactory {
    @Override
    public CPU createCPU() {
        return new EmberCPU();
    }

    @Override
    public MMU createMMU() {
        return new EmberMMU();
    }
}
