import java.awt.*;
import java.applet.*;

public class Car extends Applet{
    public void paint(Graphics g){
        Background.drawGround(g);
        Background.drawSky(g);
        Background.drawRoad(g);

        Maincar.drawMainbody(g);
        Maincar.drawWheels(g);
        Maincar.drawVents(g);
        Maincar.drawWindows(g);

        Scenery.drawSun(g);
        Scenery.drawCloud(g);
    }
}
