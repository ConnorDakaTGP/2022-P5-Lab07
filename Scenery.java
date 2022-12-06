import java.awt.*;
import java.applet.*;
public class Scenery {
    public static void drawSun(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillOval(825,10,140,140);
    }
    public static void drawCloud(Graphics g){
        g.setColor(Color.white);
        g.fillOval(750,50,100,100);
        g.fillOval(610,60,100,100);
        g.fillOval(685,30,100,100);
        g.fillOval(250,70,100,100);
        g.fillOval(110,80,100,100);
        g.fillOval(185,50,100,100);
    }
}
