import java.awt.*;
import java.applet.*;

public class Car extends Applet{
    public void paint(Graphics g){
        Background.drawGround(g);
        Background.drawSky(g);
        Background.drawRoad(g);

        Maincar.drawMainbody(g);
        Maincar.drawWheels(g);
        Maincar.drawTrim(g);
        Maincar.drawMods(g);

        Scenery.drawGrass(g);
        Scenery.drawTrees(g);
    }
}
