import java.awt.*;
import javax.swing.*;

public class _Circle extends JPanel{

    // K F C

    class Vector{
        int x, y;

        Vector(int x, int y){
            this.x = x;
            this.y = y;
        }

        Vector(){
            x = y = 0;
        }
    }

    public static void main(String [] args){
        _Circle m = new _Circle();

        JFrame f = new JFrame();
        f.add(m); //Add JPanel into JFrame f
        f.setTitle("Circle"); //Set Title for the Panel Screen
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    protected void paintComponent(Graphics g){
        //TODO: Add your Graphics Here

        createCircle(g, new Vector(300, 300), 150, Color.black);

    }

    private void plot(Graphics g, Vector i){
        g.fillRect(i.x, i.y, 1, 1);
    }

    //Midpoint circle algorithm
    private void createCircle(Graphics g, Vector i, int r, Color color){
        int x = 0;
        int y = r;
        int D = 1 - r;

        while(x <= y){
            plot(g, new Vector(i.x + x, i.y + y));
            plot(g, new Vector(i.x - x, i.y + y));
            plot(g, new Vector(i.x + x, i.y - y));
            plot(g, new Vector(i.x - x, i.y - y));
            plot(g, new Vector(i.x + y, i.y + x));
            plot(g, new Vector(i.x - y, i.y + x));
            plot(g, new Vector(i.x + y, i.y - x));
            plot(g, new Vector(i.x - y, i.y - x));

            g.setColor(color);

            int xPoly[] = {i.x + x, i.x + y, i.x + y, i.x + x, i.x - x, i.x - y, i.x - y, i.x - x};
            int yPoly[] = {i.y + y, i.y + x, i.y - x, i.y - y, i.y - y, i.y - x, i.y + x, i.y + y};

            Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);

            g.drawPolygon(poly);
            g.fillPolygon(poly);

            x++;

            if(D >= 0)
            {
                y--;
                D = D + 2 * x - 2 * y + 1;
            }
            else
            {
                D = D + 2 * x + 1;
            }
        }
    }
}
