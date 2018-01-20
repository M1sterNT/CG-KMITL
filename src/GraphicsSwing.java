import javax.swing.*;
import java.awt.*;

public class GraphicsSwing extends JPanel {
    public static void main(String [] args){
        GraphicsSwing m = new GraphicsSwing();

        JFrame f = new JFrame();
        f.add(m); //Add JPanel into JFrame f
        f.setTitle("Graphics Swing"); //Set Title for the Panel Screen
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g){
        //TODO: Add your Graphics Here
        bresenhamLine(g, 0, 0, 100, 300);
    }

    //Use to point a pixel in JFrame
    static void plot(Graphics g, int x, int y){
        g.fillRect(x, y, 1, 1);
    }

    //Create a line with Naive Line Algorithm using Linear Equation
    static void naiveLine(Graphics g, int x1, int y1, int x2, int y2){
        float dx = x2 - x1;
        float dy = y2 - y1;
        float b = y1 - (dy / dx) * x1; // From an equation 'y = (dy/dx)*x + b' into 'b = y - (dy/dx)*x'

        for(int x = Math.min(x1, x2); x <= Math.max(x1, x2); x++){
            int y = Math.round((dy / dx) * x + b);
            plot(g,x,y);
        }
    }

    //Create a line with DDA Line Algorithm using Slope Analysis
    static void DDALine(Graphics g, int x1, int y1, int x2, int y2){

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

        //DRIVING AXIS: X

        //Case 1: m have a value in [0,1] (Low Linear increasingly)
        if(m <= 1 && m >= 0){
            for(x = x1; x <= x2; x++){
                y += m; // Change a value of y by adding slope m
                plot(g, Math.round(x), Math.round(y));
            }
        }
        //Case 2: m have a value in [-1,0) (Low Linear decreasingly)
        else if(m >= -1){
            for(x = x2; x >= x1; x--){
                y += m; // Change a value of y by adding slope m
                plot(g, Math.round(x), Math.round(y));
            }
        }

        //DRIVING AXIS: Y

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
    static void bresenhamLine(Graphics g, int x1, int y1, int x2, int y2){
        if(Math.abs(y2 - y1) < Math.abs(x2 - x1)){
            if(x1 > x2) plotLineLow(g, x2, y2, x1, y1);
            else plotLineLow(g, x1, y1, x2, y2);
        }
        else{
            if(y1 > y2) plotLineHigh(g, x2, y2, x1, y1);
            else plotLineHigh(g, x1, y1, x2, y2);
        }
    }

    private static void plotLineLow(Graphics g, int x1, int y1, int x2, int y2){
        int dx = x2 - x1;
        int dy = y2 - y1;
        int yi = 1;

        if(dy < 0){
            yi = -1;
            dy = -dy;
        }

        int D = 2*dy - dx;
        int y = y1;

        for(int x = x1; x <= x2; x++){
            plot(g,x,y);
            if(D > 0){
                y += yi;
                D -= 2*dx;
            }
            D += 2*dy;
        }
    }

    private static void plotLineHigh(Graphics g, int x1, int y1, int x2, int y2){
        int dx = x2 - x1;
        int dy = y2 - y1;
        int xi = 1;

        if(dx < 0){
            xi = -1;
            dx = -dx;
        }

        int D = 2*dx - dy;
        int x = x1;

        for(int y = y1; y <= y2; y++){
            plot(g,x,y);
            if(D > 0){
                x += xi;
                D -= 2*dy;
            }
            D += 2*dx;
        }
    }
}