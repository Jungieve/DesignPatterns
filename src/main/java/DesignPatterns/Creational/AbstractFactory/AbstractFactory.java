package DesignPatterns.Creational.AbstractFactory;

/**
 * Created by 丛子涵 on 2017/8/22
 */
enum Architecture {
    ENGINOLA, EMBER
}

abstract class AbstractFactory {
    private static final EmberToolkit EMBER_TOOLKIT = new EmberToolkit();
    private static final EnginolaToolkit ENGINOLA_TOOLKIT = new EnginolaToolkit();

    // Returns a concrete factory object this is an instance of the concrete factory class appropritate for give architecture
    static AbstractFactory getFactory(Architecture architecture){
        AbstractFactory factory = null;
        switch (architecture){
            case ENGINOLA: {
                factory = ENGINOLA_TOOLKIT;
                break;
            }
            case EMBER:{
                factory = EMBER_TOOLKIT;
                break;
            }
        }
        return factory;
    }

    public abstract CPU createCPU();

    public abstract MMU createMMU();
}
