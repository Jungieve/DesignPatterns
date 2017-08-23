package DesignPatterns.Creational.Singleton;

/**
 * Created by 丛子涵 on 2017/8/23
 */
public class Singleton {
    private Singleton(){};

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
