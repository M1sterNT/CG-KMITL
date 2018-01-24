import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class _Polygon extends JPanel {

    //For purpose of Studying in Computer Graphics Course (2/2018) at Computer Science, KMITL
    //Design by Pitchakorn Uaisawat (59050268) Coding by Yuttapichai Kerdcharoen (59050284)
    //This graphics is made by Polygon using Java2D API

    //Object for showing an coordinate of a point
    class Vector{
        int x, y;

        Vector(int x, int y){ this.x = x; this.y = y; }
        Vector(){ x = y = 0; }
    }

    //Object for Triangle
    class Triangle{
        Vector i, j, k;

        Triangle(Vector i, Vector j, Vector k){ this.i = i; this.j = j; this.k = k; }
        Triangle(){ i = j = k = new Vector(); }
    }

    public static void main(String [] args){
        _Polygon m = new _Polygon();

        JFrame f = new JFrame();
        f.add(m); //Add JPanel into JFrame f
        f.setTitle("Polygon"); //Set Title for the Panel Screen
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    protected void paintComponent(Graphics g){
        //TODO: Add your Graphics Here

        //Set Background
        fillBackground(g, Color.white);

        createPoly(g, new Triangle(new Vector(300, 300), new Vector(450, 500), new Vector(500, 200)), Color.black);
        createPoly(g, new Triangle(new Vector(300, 300), new Vector(500, 200), new Vector(300, 100)), new Color(255, 177, 177));
    }

    private void fillBackground(Graphics g, Color color){
        g.setColor(color);
        g.fillRect(0, 0, 600, 600);
    }

    //Create Polygon with color-filled
    private void createPoly(Graphics g, Triangle tri, Color color){

        g.setColor(color);

        int xPoly[] = {tri.i.x, tri.j.x, tri.k.x};
        int yPoly[] = {tri.i.y, tri.j.y, tri.k.y};

        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);

        g.drawPolygon(poly);
        g.fillPolygon(poly);
    }
}