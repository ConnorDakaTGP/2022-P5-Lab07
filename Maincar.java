import java.awt.*;
public class Maincar {
    public static void drawMainbody(Graphics g){
        Polygon body = new Polygon();
        body.addPoint(50,300);
        body.addPoint(75,315);
        body.addPoint(50,370);
        body.addPoint(900,370);
        body.addPoint(925,270);
        body.addPoint(900,250);
        body.addPoint(850,240);
        body.addPoint(650,180);
        body.addPoint(550,170);
        body.addPoint(450,180);
        body.addPoint(340,210);
        body.addPoint(275,240);
        body.addPoint(150,255);
        g.setColor(Color.RED);
        g.fillPolygon(body);
    }
    public static void drawWheels(Graphics g){
        g.setColor(Color.DARK_GRAY);
        g.fillOval(130,285,150,150);
        g.fillOval(700,285,150,150);
    }
    public static void drawVents(Graphics g){
        Polygon vent = new Polygon();
        vent.addPoint(625,245);
        vent.addPoint(630,280);
        vent.addPoint(590,360);
        vent.addPoint(675,280);
        g.setColor(Color.BLACK);
        g.fillPolygon(vent);
    }
    public static void drawWindows(Graphics g){
        Polygon window = new Polygon();
        window.addPoint(470,180);
        window.addPoint(345,212);
        window.addPoint(280,240);
        window.addPoint(700,240);
        window.addPoint(600,190);
        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(window);
        Polygon headlight = new Polygon();
        headlight.addPoint(50,300);
        headlight.addPoint(75,305);
        headlight.addPoint(150,255);
        g.setColor(Color.white);
        g.fillPolygon(headlight);
    }
}
