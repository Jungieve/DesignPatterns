package DesignPatterns.Creational.AbstractFactory;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by 丛子涵 on 2017/8/22
 */
public class AbstractFactoryTest extends TestCase {
    public void testAbstractFactory() throws Exception {
        AbstractFactory EmberFactory = AbstractFactory.getFactory(Architecture.EMBER);
        AbstractFactory EnginolaFactory = AbstractFactory.getFactory(Architecture.ENGINOLA);
        CPU EnginolaCPU = EnginolaFactory.createCPU();
        MMU EnginolaMMU = EnginolaFactory.createMMU();
        CPU EmberCPU = EmberFactory.createCPU();
        MMU EmberMMU = EmberFactory.createMMU();

        EnginolaCPU.CPUInfo();
        EnginolaMMU.MMUInfo();
        EmberCPU.CPUInfo();
        EmberMMU.MMUInfo();
    }

    public static Test suite() {
        return new TestSuite(AbstractFactoryTest.class);
    }

}
