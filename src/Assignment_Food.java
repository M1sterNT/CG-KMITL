import java.awt.*;
import javax.swing.*;

public class Assignment_Food extends JPanel{

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
        Assignment_Food m = new Assignment_Food();

        JFrame f = new JFrame();
        f.add(m); //Add JPanel into JFrame f
        f.setTitle("Fortune Cookie feat. Pipimi"); //Set Title for the Panel Screen
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    protected void paintComponent(Graphics g){
        //TODO: Add your Graphics Here

        //Set Background
        setGradientBackground(g);

        createFullFortuneCookie(g, new Vector(300, 250), 150);
        createPipimi(g, new Vector(450, 500), 150);

    }

    private void setGradientBackground(Graphics g){
        for(int i = 0; i < 60; i++){
            for(int j = 0; j < 60; j++){
                if((j + i) % 2 == 0) createCircle(g, new Vector(5 + (i * 10), 5 + (j * 10)), 5, new Color(255 - (int)(255 / 60 * j), 255 - (int)(255 / 60 * i), 255 - (int)(255 / 60 / 2 * j)));
            }
        }
    }

    private void createFullFortuneCookie(Graphics g, Vector i, int size){
        createFortuneCookie(g, new Vector(i.x, i.y), size, new Color(208, 156, 63));
        for(int x = 0; x < size / 2; x++) createFortuneCookie(g, new Vector(i.x, i.y), (int) (size * (0.9 - (x * 0.01))), new Color(208 + (x / 2), 156 + x, 63 + (int)(x * 1.5)));
    }

    private void createPipimi(Graphics g, Vector i, int size){
        //Back Hair
        for(int x = 0; x < size; x++) createCircle(g, new Vector(i.x - 100 * size / 150, i.y - 40 * size / 150 + x), 5 * size / 150, new Color(28, 79, 156));
        for(int x = 0; x < size; x++) createCircle(g, new Vector(i.x + 100 * size / 150, i.y - 40 * size / 150 + x), 5 * size / 150, new Color(28, 79, 156));

        //Red Bow
        for(int x = 0; x < 10 * size / 150; x++) createCircle(g, new Vector(i.x - 5 * size / 150 + x, i.y - size + 10 * size / 150), 10 * size / 150, new Color(211, 69, 38));
        for(int x = 0; x < 20 * size / 150; x++) createCircle(g, new Vector(i.x - 50 * size / 150, i.y - size + 10 * size / 150 + x), 40 * size / 150, new Color(211, 69, 38));
        for(int x = 0; x < 20 * size / 150; x++) createCircle(g, new Vector(i.x + 50 * size / 150, i.y - size + 10 * size / 150 + x), 40 * size / 150, new Color(211, 69, 38));

        //Body
        for(int x = 0; x < 100 * size / 150; x++) createCircle(g, new Vector(i.x, i.y - 40 * size / 150 + x), 100 * size / 150, new Color(227, 212, 201));

        //Ears
        createCircle(g, new Vector(i.x - 100 * size / 150, i.y + 35), 20 * size / 150, new Color(227, 212, 201));
        createCircle(g, new Vector(i.x + 100 * size / 150, i.y + 35), 20 * size / 150, new Color(227, 212, 201));

        //Hair
        createSemiCircle(g, new Vector(i.x, i.y - 35), 105 * size / 150, 0, new Color(28, 79, 156));
        for(int x = 0; x < size * 0.9; x++) createCircle(g, new Vector(i.x - 85 * size / 150, i.y - 40 * size / 150 + x), 10 * size / 150, new Color(28, 79, 156));
        for(int x = 0; x < size * 0.9; x++) createCircle(g, new Vector(i.x + 85 * size / 150, i.y - 40 * size / 150 + x), 10 * size / 150, new Color(28, 79, 156));

        for(int x = 0; x < size * 0.3; x++) createCircle(g, new Vector(i.x - 50 * size / 150, i.y - 35 * size / 150 - x), (5 * size / 150) - (x / 10 * size / 150), new Color(227, 212, 201));
        for(int x = 0; x < size * 0.3; x++) createCircle(g, new Vector(i.x + 50 * size / 150, i.y - 35 * size / 150 - x), (5 * size / 150) - (x / 10 * size / 150), new Color(227, 212, 201));

        //Eyes
        createPopTeamEpicEye(g, new Vector(i.x - 40 * size / 150, i.y), size, new Color(158, 177, 210));
        createPopTeamEpicEye(g, new Vector(i.x + 40 * size / 150, i.y), size, new Color(158, 177, 210));

        //Mouth
        createSemiCircle(g, new Vector(i.x - 9 * size / 150, i.y + 50 * size / 150), 10 * size / 150, 180, Color.black);
        createSemiCircle(g, new Vector(i.x - 9 * size / 150, i.y + 50 * size / 150), 7 * size / 150, 180, new Color(227, 212, 201));
        createSemiCircle(g, new Vector(i.x + 9 * size / 150, i.y + 50 * size / 150), 10 * size / 150, 180, Color.black);
        createSemiCircle(g, new Vector(i.x + 9 * size / 150, i.y + 50 * size / 150), 7 * size / 150, 180, new Color(227, 212, 201));

        //Hand
        for(int x = 0; x < size * 0.9; x++) createCircle(g, new Vector(i.x - 150 * size / 150, i.y + x), 15 * size / 150, new Color(227, 212, 201));
    }

    private void createPopTeamEpicEye(Graphics g, Vector i, int size, Color eyeColor){
        createSemiCircle(g, new Vector(i.x, i.y), 25 * size / 150, 0, Color.black);
        for(int x = 0; x < 20; x++) createCircle(g, new Vector(i.x, i.y + x), 20 * size / 150, Color.white);
        for(int x = 10; x < 20; x++) createCircle(g, new Vector(i.x, i.y + x), 20 * size / 150, Color.black);
        for(int x = 0; x < 10; x++) createCircle(g, new Vector(i.x - 5 + x, i.y - 5), 5 * size / 150, Color.white);
        createSemiCircle(g, new Vector(i.x, i.y + 20), 15 * size / 150, 180, eyeColor);
        createSemiCircle(g, new Vector(i.x, i.y + 15), 10 * size / 150, 180, Color.black);
    }

    private void createFortuneCookie(Graphics g, Vector i, int size, Color color){
        createSemiCircle(g, new Vector(i.x, i.y), size, 135, color);
        createSemiCircle(g, new Vector(i.x, i.y), size, 225, color);
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

    private void createSemiCircle(Graphics g, Vector i, int r, int angle, Color color){
        int x = 0;
        int y = r;
        int D = 1 - r;

        while(x <= y){
            switch(angle % 360){
                case 0:{
                    plot(g, new Vector(i.x + y, i.y - x));
                    plot(g, new Vector(i.x + x, i.y - y));
                    plot(g, new Vector(i.x - x, i.y - y));
                    plot(g, new Vector(i.x - y, i.y - x));

                    g.setColor(color);

                    int xPoly[] = {i.x + y, i.x + x, i.x - x, i.x - y};
                    int yPoly[] = {i.y - x, i.y - y, i.y - y, i.y - x};

                    Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);

                    g.drawPolygon(poly);
                    g.fillPolygon(poly);

                    break;
                }
                case 45:{
                    plot(g, new Vector(i.x + x, i.y - y));
                    plot(g, new Vector(i.x - x, i.y - y));
                    plot(g, new Vector(i.x - y, i.y - x));
                    plot(g, new Vector(i.x - y, i.y + x));

                    g.setColor(color);

                    int xPoly[] = {i.x + x, i.x - x, i.x - y, i.x - y};
                    int yPoly[] = {i.y - y, i.y - y, i.y - x, i.y + x};

                    Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);

                    g.drawPolygon(poly);
                    g.fillPolygon(poly);

                    break;
                }
                case 90:{
                    plot(g, new Vector(i.x - x, i.y - y));
                    plot(g, new Vector(i.x - y, i.y - x));
                    plot(g, new Vector(i.x - y, i.y + x));
                    plot(g, new Vector(i.x - x, i.y + y));

                    g.setColor(color);

                    int xPoly[] = {i.x - x, i.x - y, i.x - y, i.x - x};
                    int yPoly[] = {i.y - y, i.y - x, i.y + x, i.y + y};

                    Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);

                    g.drawPolygon(poly);
                    g.fillPolygon(poly);

                    break;
                }
                case 135:{
                    plot(g, new Vector(i.x - y, i.y - x));
                    plot(g, new Vector(i.x - y, i.y + x));
                    plot(g, new Vector(i.x - x, i.y + y));
                    plot(g, new Vector(i.x + x, i.y + y));

                    g.setColor(color);

                    int xPoly[] = {i.x - y, i.x - y, i.x - x, i.x + x};
                    int yPoly[] = {i.y - x, i.y + x, i.y + y, i.y + y};

                    Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);

                    g.drawPolygon(poly);
                    g.fillPolygon(poly);

                    break;
                }
                case 180:{
                    plot(g, new Vector(i.x - y, i.y + x));
                    plot(g, new Vector(i.x - x, i.y + y));
                    plot(g, new Vector(i.x + x, i.y + y));
                    plot(g, new Vector(i.x + y, i.y + x));

                    g.setColor(color);

                    int xPoly[] = {i.x - y, i.x - x, i.x + x, i.x + y};
                    int yPoly[] = {i.y + x, i.y + y, i.y + y, i.y + x};

                    Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);

                    g.drawPolygon(poly);
                    g.fillPolygon(poly);

                    break;
                }
                case 225:{
                    plot(g, new Vector(i.x - x, i.y + y));
                    plot(g, new Vector(i.x + x, i.y + y));
                    plot(g, new Vector(i.x + y, i.y + x));
                    plot(g, new Vector(i.x + y, i.y - x));

                    g.setColor(color);

                    int xPoly[] = {i.x - x, i.x + x, i.x + y, i.x + y};
                    int yPoly[] = {i.y + y, i.y + y, i.y + x, i.y - x};

                    Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);

                    g.drawPolygon(poly);
                    g.fillPolygon(poly);

                    break;
                }
                case 270:{
                    plot(g, new Vector(i.x + x, i.y + y));
                    plot(g, new Vector(i.x + y, i.y + x));
                    plot(g, new Vector(i.x + y, i.y - x));
                    plot(g, new Vector(i.x + x, i.y - y));

                    g.setColor(color);

                    int xPoly[] = {i.x + x, i.x + y, i.x + y, i.x + x};
                    int yPoly[] = {i.y + y, i.y + x, i.y - x, i.y - y};

                    Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);

                    g.drawPolygon(poly);
                    g.fillPolygon(poly);

                    break;
                }
                case 315:{
                    plot(g, new Vector(i.x + y, i.y + x));
                    plot(g, new Vector(i.x + y, i.y - x));
                    plot(g, new Vector(i.x + x, i.y - y));
                    plot(g, new Vector(i.x - x, i.y - y));

                    g.setColor(color);

                    int xPoly[] = {i.x + y, i.x + y, i.x + x, i.x - x};
                    int yPoly[] = {i.y + x, i.y - x, i.y - y, i.y - y};

                    Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);

                    g.drawPolygon(poly);
                    g.fillPolygon(poly);

                    break;
                }
            }

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
