import java.awt.*;
public class Background {
    public static void drawGround(Graphics g){
        g.setColor(Color.green);
        g.fillRect(0,400,1000,250);
    }
    public static void drawSky(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(0,0,1000,400);
    }
    public static void drawRoad(Graphics g){
        g.setColor(Color.GRAY);
        g.fillRect(0,400,1000,50);
    }
}
