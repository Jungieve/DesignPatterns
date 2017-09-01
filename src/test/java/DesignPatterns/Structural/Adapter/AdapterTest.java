package DesignPatterns.Structural.Adapter;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by 丛子涵 on 2017/9/1
 */
public class AdapterTest extends TestCase {
    public void testAdapter() throws Exception {
        Shape[] shapes = {new RectangleAdapter(new Rectangle()),
                new LineAdapter(new Line())};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }

    public static Test suite() {
        return new TestSuite(AdapterTest.class);
    }
}
