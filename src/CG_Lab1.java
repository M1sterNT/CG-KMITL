import java.awt.*;
import javax.swing.*;

public class CG_Lab1{
    //For purpose of Studying in Computer Graphics Course (2/2018) at Computer Science, KMITL
    //Created by Yuttapichai Kerdcharoen (PnX)
    //Not recommend to copy this code without trying by yourself
}

class GraphicsSwing extends JPanel{
    public static void main(String [] args){
        GraphicsSwing m = new GraphicsSwing();

        JFrame f = new JFrame();
        f.add(m); //Add JPanel into JFrame f
        f.setTitle("CG_Lab1"); //Set Title for the Panel Screen
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g){
        //TODO: Add your Graphics Here

        //Create Border
        g.setColor(Color.red);
        g.fillRect(200, 0, 1, 600);
        g.fillRect(400, 0, 1, 600);
        g.fillRect(0, 200, 600, 1);
        g.fillRect(0, 400, 600, 1);

        g.setColor(Color.black);
        //Naive Line Algorithm
        naiveLine(g, 0,50, 200, 150);
        naiveLine(g, 400,150, 200, 50);
        naiveLine(g, 450,0, 550, 200);

        //DDA Line Algorithm
        DDALine(g, 0, 250, 200,350);
        DDALine(g, 400, 350, 200,250);
        DDALine(g, 450, 200, 550,400);

        //Bresenham's Line Algorithm
        bresenhamLine(g, 0, 450, 200,550);
        bresenhamLine(g, 400, 550, 200,450);
        bresenhamLine(g, 450, 400, 550,600);
    }

    //Use to point a pixel in JFrame
    private void plot(Graphics g, int x, int y){
        g.fillRect(x, y, 1, 1);
    }

    //Create a line with Naive Line Algorithm using Linear Equation
    private void naiveLine(Graphics g, int x1, int y1, int x2, int y2){
        float dx = x2 - x1;
        float dy = y2 - y1;
        float b = y1 - (dy / dx) * x1; // From an equation 'y = (dy/dx)*x + b' into 'b = y - (dy/dx)*x'

        for(int x = Math.min(x1, x2); x <= Math.max(x1, x2); x++){
            int y = Math.round((dy / dx) * x + b);
            plot(g,x,y);
        }
    }

    //Create a line with DDA Line Algorithm using Slope Analysis
    private void DDALine(Graphics g, int x1, int y1, int x2, int y2){

        //Swap the points for reversal
        if(x1 > x2){
            int tmpx = x1;
            int tmpy = y1;
            x1 = x2;
            y1 = y2;
            x2 = tmpx;
            y2 = tmpy;
        }

        float dx = x2 - x1;
        float dy = y2 - y1;

        float x = x1, y = y1;
        float m = dy / dx;

        //Case 1: m have a value in [0,1] (Low Linear increasingly)
        if(m <= 1 && m >= 0){
            for(x = x1; x <= x2; x++){
                y += m; // Change a value of y by adding slope m
                plot(g, Math.round(x), Math.round(y));
            }
        }
        //Case 2: m have a value in [-1,0) (Low Linear decreasingly)
        else if(m <= -1){
            for(x = x2; x >= x1; x--){
                y += m; // Change a value of y by adding slope m
                plot(g, Math.round(x), Math.round(y));
            }
        }
        //Case 3: m have a value in (1, inf) (High Linear decreasingly)
        else if(m > 1){
            for(y = y1; y <= y2; y++){
                x += 1/m; // Change a value of x by adding slope m
                plot(g, Math.round(x), Math.round(y));
            }
        }
        //Case 4: m have a value in (-inf, -1) (High Linear decreasingly)
        else if(m <= -1){
            for(y = y2; y >= y1; y--){
                x += 1/m; // Change a value of x by adding slope m
                plot(g, Math.round(x), Math.round(y));
            }
        }
    }

    //Create a line with Bresenham's Algorithm using a relation of dy and dx
    private void bresenhamLine(Graphics g, int x1, int y1, int x2, int y2){

        //Swap the points for reversal
        if(x1 > x2){
            int tmpx = x1;
            int tmpy = y1;
            x1 = x2;
            y1 = y2;
            x2 = tmpx;
            y2 = tmpy;
        }

        int dx = x2 - x1;
        int dy = y2 - y1;
        int D = 2 * dy - dx;

        float m = dy / dx;

        int x = x1, y = y1;

        if(m <= 1 && m >= 0){
            for(; x <= x2; x++){
                plot(g,x,y);

                if(D >= 0){
                    y++;
                    D -= 2 * dx;
                }

                D += 2 * dy;
            }
        }
        else if(m > 1) {
            for(; y <= y2; y++){
                plot(g,x,y);

                if(D >= 0){
                    x++;
                    D -= 2 * dy;
                }

                D += 2 * dx;
            }
        }
    }
}