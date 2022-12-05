import java.awt.*;
import java.applet.*;
public class Maincar {
    public static void drawMainbody(Graphics g){
        Polygon body = new Polygon();
        body.addPoint(50,285);
        body.addPoint(75,315);
        body.addPoint(50,370);
        body.addPoint(900,370);
        body.addPoint(925,270);
        body.addPoint(900,250);
        body.addPoint(850,240);
        body.addPoint(650,180);
        body.addPoint(550,170);
        body.addPoint(450,180);
        body.addPoint(300,210);
        g.setColor(Color.RED);
        g.fillPolygon(body);
    }
    public static void drawWheels(Graphics g){
    }
    public static void drawTrim(Graphics g){
    }
    public static void drawMods(Graphics g){
    }
}
