package DesignPatterns.Creational.FactoryMethod;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by 丛子涵 on 2017/8/25
 */
public class FactoryMethodTest extends TestCase{
    public static Test suite() {
        return new TestSuite(FactoryMethodTest.class);
    }

    public void testFactoryMethod() throws Exception {
        DecodedImage decodedImage;
        ImageReader imageReader = null;
        imageReader = new GifReader("git");
        decodedImage = imageReader.getDecodedImage();
        System.out.println(decodedImage);
    }
}
