package DesignPatterns.Structural.Adapter;

/**
 * Created by 丛子涵 on 2017/9/1
 */
public class Rectangle {
    public void draw(int x, int y,int width, int height){
        System.out.println("Rectangle with coordinate left-down point (" + x + ";" + y + ")," +
                "width: " + width + ",height: " + height);
    }
}
