package DesignPatterns.Structural.Adapter;

/**
 * Created by 丛子涵 on 2017/9/1
 */
public class Line {
    public void draw(int x1,int y1, int x2, int y2){
        System.out.println("Line from point A(" + x1 + ";" + y1 + "), to point B(" + x2 + ";" + y2 +")");
    }
}
