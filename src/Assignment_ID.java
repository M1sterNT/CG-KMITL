import java.awt.*;
import javax.swing.*;

public class Assignment_ID extends JPanel{

    //For purpose of Studying in Computer Graphics Course (2/2018) at Computer Science, KMITL
    //Design by Pitchakorn Uaisawat (59050268) Coding by Yuttapichai Kerdcharoen (59050284)
    //This graphics is made by Bresenham's Line Drawing Algorithm using Java

    //Initialized an object called Vector for express the coordinate of a pixel in canvas.
    class Vector{

        int x, y;

        Vector(int x, int y){
            this.x = x;
            this.y = y;
        }

        Vector(){
            x = 0;
            y = 0;
        }
    }

    public static void main(String [] args){
        Assignment_ID m = new Assignment_ID();

        JFrame f = new JFrame();
        f.add(m); //Add JPanel into JFrame f
        f.setTitle("Assignment 1: Student ID"); //Set Title for the Panel Screen
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(600,600));
        f.setMinimumSize(new Dimension(600,600));
        f.setMaximumSize(new Dimension(600,622));
        f.pack();
        f.setVisible(true);
    }

    public void paintComponent(Graphics g){
        //TODO: Add your Graphics Here

        setBackground(g, new Color(30, 76, 140));

        /*
        //Axis Indicator
        g.setColor(Color.green);
        bresenhamLine(g, new Vector(300, 0), new Vector(300, 600));

        //y = x/2 + 50
        bresenhamLine(g, new Vector(0, 50), new Vector(300, 200));
        bresenhamLine(g, new Vector(0, 150), new Vector(300, 300));

        //y = 500 - x/2
        bresenhamLine(g, new Vector(300, 350), new Vector(600, 200));
        bresenhamLine(g, new Vector(300, 450), new Vector(600, 300));
        */

        //Background
        /*Nyan Cat*/ //g.setColor(Color.magenta); bresenhamLine(g, new Vector(0, 72), new Vector(600, 72));
        int counter = 0, a = 8;
        for(int i = 0; i <= 600; i += 8){
            /*RED*/ g.setColor(new Color(232, 50, 35)); for(int j = 0; j < 24; j+= 8){ plotBySize(g, new Vector(i ,a + j), 8); }
            /*ORANGE*/ g.setColor(new Color(241, 159, 57)); for(int j = 24; j < 48; j+= 8){ plotBySize(g, new Vector(i ,a + j), 8); }
            /*YELLOW*/ g.setColor(new Color(255, 253, 84)); for(int j = 48; j < 72; j+= 8){ plotBySize(g, new Vector(i ,a + j), 8); }
            /*GREEN*/ g.setColor(new Color(119, 249, 76)); for(int j = 72; j < 96; j+= 8){ plotBySize(g, new Vector(i ,a + j), 8); }
            /*INDIGO*/ g.setColor(new Color(62, 149, 247)); for(int j = 96; j < 120; j+= 8){ plotBySize(g, new Vector(i ,a + j), 8); }
            /*VIOLET*/ g.setColor(new Color(93, 51, 244)); for(int j = 120; j < 144; j+= 8){ plotBySize(g, new Vector(i ,a + j), 8); }

            counter++;
            if(counter == 8){
                counter = 0;
                if(a == 16) a = 8;
                else if (a == 8) a = 16;
            }
        }

        createNyanCat(g, new Vector(350, 7));

        /*Structure*/ //bresenhamLine(g, new Vector(0, 300), new Vector(600, 300));
        createBuilding(g, new Vector(-1, 0), 50);
        createBuilding(g, new Vector(400, 50), 100);
        createBuilding(g, new Vector(150, 100), 100);
        createBuilding(g, new Vector(550, 200), 100);
        createBuilding(g, new Vector(300, 400), 200);

        //Number
        /*5*/ createGraphics(g, new Vector(0, 50), new Vector(38, 69), '5');
        /*9*/ createGraphics(g, new Vector(38, 69), new Vector(74, 87), '9');
        /*0*/ createGraphics(g, new Vector(74, 87), new Vector(112, 106), '0');
        /*5*/ createGraphics(g, new Vector(112, 106), new Vector(150, 125), '5');
        /*0*/ createGraphics(g, new Vector(150, 125), new Vector(188, 144), '0');
        /*2*/ createGraphics(g, new Vector(188, 144), new Vector(224, 162), '2');
        /*8*/ createGraphics(g, new Vector(224, 162), new Vector(262, 181), '8');
        /*4*/ createGraphics(g, new Vector(262, 181), new Vector(300, 200), '4');

        /*5*/ createGraphics(g, new Vector(300, 350), new Vector(338, 331), '5');
        /*9*/ createGraphics(g, new Vector(338, 331), new Vector(374, 313), '9');
        /*0*/ createGraphics(g, new Vector(374, 313), new Vector(412, 294), '0');
        /*5*/ createGraphics(g, new Vector(412, 294), new Vector(450, 275), '5');
        /*0*/ createGraphics(g, new Vector(450, 275), new Vector(488, 256), '0');
        /*2*/ createGraphics(g, new Vector(488, 256), new Vector(526, 237), '2');
        /*8*/ createGraphics(g, new Vector(526, 237), new Vector(562, 219), '6');
        /*4*/ createGraphics(g, new Vector(562, 219), new Vector(600, 200), '8');

        shadowBorder(g,70);
    }

    private void shadowBorder(Graphics g, int SIZE){
        g.setColor(Color.black);
        for(int i = SIZE; i >= 1; i /= 1.03){
            g.setColor(Color.black);
            bresenhamLine(g, new Vector(0, 600 - i), new Vector(600, 600 - i));
        }
    }

    private void plotBySize(Graphics g, Vector i, int PIXEL_SIZE){
        for(int a = 0; a <= PIXEL_SIZE; a++) bresenhamLine(g, new Vector(i.x + a, i.y), new Vector(i.x + a, i.y + PIXEL_SIZE));
    }

    private void createNyanCat(Graphics g, Vector i){
        /*0*/ g.setColor(Color.black); for(int j = 8; j <= 24; j++) plotBySize(g, new Vector(i.x + j * 8 , i.y + 0 * 8), 8);
        /*1*/ g.setColor(Color.black); plotBySize(g, new Vector(i.x + 7 * 8 , i.y + 1 * 8), 8); plotBySize(g, new Vector(i.x + 25 * 8 , i.y + 1 * 8), 8);
        g.setColor(new Color(248, 207, 158)); for(int j = 8; j <= 24; j++) plotBySize(g, new Vector(i.x + j * 8 , i.y + 1 * 8), 8);

        for(int a = 2; a <= 15; a++){
            g.setColor(Color.black);
            plotBySize(g, new Vector(i.x + 6 * 8 , i.y + a * 8), 8);
            plotBySize(g, new Vector(i.x + 26 * 8 , i.y + a * 8), 8);
            g.setColor(new Color(248, 207, 158));
            plotBySize(g, new Vector(i.x + 7 * 8 , i.y + a * 8), 8);
            plotBySize(g, new Vector(i.x + 25 * 8 , i.y + a * 8), 8);
            g.setColor(new Color(233, 152, 241));
            for(int j = 8; j <= 24; j++) plotBySize(g, new Vector(i.x + j * 8 , i.y + a * 8), 8);
        }

        //Body
        g.setColor(new Color(248, 207, 158));
        plotBySize(g, new Vector(i.x + 8 * 8 , i.y + 2 * 8), 8);
        plotBySize(g, new Vector(i.x + 8 * 8 , i.y + 3 * 8), 8);
        plotBySize(g, new Vector(i.x + 9 * 8 , i.y + 2 * 8), 8);
        plotBySize(g, new Vector(i.x + 23 * 8 , i.y + 2 * 8), 8);
        plotBySize(g, new Vector(i.x + 24 * 8 , i.y + 3 * 8), 8);
        plotBySize(g, new Vector(i.x + 24 * 8 , i.y + 2 * 8), 8);
        plotBySize(g, new Vector(i.x + 8 * 8 , i.y + 14 * 8), 8);
        plotBySize(g, new Vector(i.x + 8 * 8 , i.y + 15 * 8), 8);
        plotBySize(g, new Vector(i.x + 9 * 8 , i.y + 15 * 8), 8);

        g.setColor(new Color(218, 63, 146));
        plotBySize(g, new Vector(i.x + 15 * 8 , i.y + 3 * 8), 8);
        plotBySize(g, new Vector(i.x + 18 * 8 , i.y + 3 * 8), 8);
        plotBySize(g, new Vector(i.x + 10 * 8 , i.y + 4 * 8), 8);
        plotBySize(g, new Vector(i.x + 22 * 8 , i.y + 5 * 8), 8);
        plotBySize(g, new Vector(i.x + 14 * 8 , i.y + 7 * 8), 8);
        plotBySize(g, new Vector(i.x + 11 * 8 , i.y + 9 * 8), 8);
        plotBySize(g, new Vector(i.x + 15 * 8 , i.y + 10 * 8), 8);
        plotBySize(g, new Vector(i.x + 9 * 8 , i.y + 11 * 8), 8);
        plotBySize(g, new Vector(i.x + 13 * 8 , i.y + 13 * 8), 8);
        plotBySize(g, new Vector(i.x + 10 * 8 , i.y + 14 * 8), 8);

        /*16*/ g.setColor(Color.black); plotBySize(g, new Vector(i.x + 7 * 8 , i.y + 16 * 8), 8); plotBySize(g, new Vector(i.x + 25 * 8 , i.y + 16 * 8), 8);
        g.setColor(new Color(248, 207, 158)); for(int j = 8; j <= 24; j++) plotBySize(g, new Vector(i.x + j * 8 , i.y + 16 * 8), 8);
        /*17*/ g.setColor(Color.black); for(int j = 8; j <= 28; j++) plotBySize(g, new Vector(i.x + j * 8 , i.y + 17 * 8), 8);

        //Tail + Leg
        g.setColor(Color.black);
        for(int a = 6; a <= 9; a++) plotBySize(g, new Vector(i.x + 17 * 8 , i.y + a * 8), 8);
        for(int a = 6; a <= 9; a++) plotBySize(g, new Vector(i.x + 30 * 8 , i.y + a * 8), 8);
        plotBySize(g, new Vector(i.x + 18 * 8 , i.y + 5 * 8), 8);
        plotBySize(g, new Vector(i.x + 19 * 8 , i.y + 5 * 8), 8);
        plotBySize(g, new Vector(i.x + 28 * 8 , i.y + 5 * 8), 8);
        plotBySize(g, new Vector(i.x + 29 * 8 , i.y + 5 * 8), 8);
        plotBySize(g, new Vector(i.x + 20 * 8 , i.y + 6 * 8), 8);
        plotBySize(g, new Vector(i.x + 27 * 8 , i.y + 6 * 8), 8);
        plotBySize(g, new Vector(i.x + 21 * 8 , i.y + 7 * 8), 8);
        plotBySize(g, new Vector(i.x + 26 * 8 , i.y + 7 * 8), 8);
        for(int a = 0; a <=3; a++) plotBySize(g, new Vector(i.x + a * 8 , i.y + 7 * 8), 8);
        plotBySize(g, new Vector(i.x + 0 * 8 , i.y + 8 * 8), 8);
        plotBySize(g, new Vector(i.x + 3 * 8 , i.y + 8 * 8), 8);
        plotBySize(g, new Vector(i.x + 4 * 8 , i.y + 8 * 8), 8);
        for(int a = 22; a <=25; a++) plotBySize(g, new Vector(i.x + a * 8 , i.y + 8 * 8), 8);
        plotBySize(g, new Vector(i.x + 0 * 8 , i.y + 9 * 8), 8);
        plotBySize(g, new Vector(i.x + 1 * 8 , i.y + 9 * 8), 8);
        plotBySize(g, new Vector(i.x + 4 * 8 , i.y + 9 * 8), 8);
        plotBySize(g, new Vector(i.x + 5 * 8 , i.y + 9 * 8), 8);
        plotBySize(g, new Vector(i.x + 1 * 8 , i.y + 10 * 8), 8);
        plotBySize(g, new Vector(i.x + 2 * 8 , i.y + 10 * 8), 8);
        plotBySize(g, new Vector(i.x + 5 * 8 , i.y + 10 * 8), 8);
        plotBySize(g, new Vector(i.x + 2 * 8 , i.y + 11 * 8), 8);
        plotBySize(g, new Vector(i.x + 3 * 8 , i.y + 11 * 8), 8);
        for(int a = 3; a <= 5; a++) plotBySize(g, new Vector(i.x + a * 8 , i.y + 12 * 8), 8);
        plotBySize(g, new Vector(i.x + 5 * 8 , i.y + 13 * 8), 8);
        plotBySize(g, new Vector(i.x + 17 * 8 , i.y + 15 * 8), 8);
        plotBySize(g, new Vector(i.x + 30 * 8 , i.y + 15 * 8), 8);
        plotBySize(g, new Vector(i.x + 18 * 8 , i.y + 16 * 8), 8);
        plotBySize(g, new Vector(i.x + 29 * 8 , i.y + 16 * 8), 8);
        for(int a = 5; a <= 7; a++) plotBySize(g, new Vector(i.x + a * 8 , i.y + 16 * 8), 8);
        plotBySize(g, new Vector(i.x + 4 * 8 , i.y + 17 * 8), 8);
        plotBySize(g, new Vector(i.x + 4 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 7 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 8 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 10 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 13 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 19 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 22 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 25 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 27 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 25 * 8 , i.y + 19 * 8), 8);
        plotBySize(g, new Vector(i.x + 26 * 8 , i.y + 19 * 8), 8);
        for(int a = 20; a <= 22; a++) plotBySize(g, new Vector(i.x + a * 8 , i.y + 19 * 8), 8);
        for(int a = 4; a <= 6; a++) plotBySize(g, new Vector(i.x + a * 8 , i.y + 19 * 8), 8);
        for(int a = 10; a <= 12; a++) plotBySize(g, new Vector(i.x + a * 8 , i.y + 19 * 8), 8);

        g.setColor(new Color(153, 153, 153));
        plotBySize(g, new Vector(i.x + 18 * 8 , i.y + 6 * 8), 8);
        plotBySize(g, new Vector(i.x + 19 * 8 , i.y + 6 * 8), 8);
        plotBySize(g, new Vector(i.x + 28 * 8 , i.y + 6 * 8), 8);
        plotBySize(g, new Vector(i.x + 29 * 8 , i.y + 6 * 8), 8);
        plotBySize(g, new Vector(i.x + 18 * 8 , i.y + 7 * 8), 8);
        plotBySize(g, new Vector(i.x + 19 * 8 , i.y + 7 * 8), 8);
        plotBySize(g, new Vector(i.x + 20 * 8 , i.y + 7 * 8), 8);
        plotBySize(g, new Vector(i.x + 29 * 8 , i.y + 7 * 8), 8);
        plotBySize(g, new Vector(i.x + 28 * 8 , i.y + 7 * 8), 8);
        plotBySize(g, new Vector(i.x + 27 * 8 , i.y + 7 * 8), 8);
        plotBySize(g, new Vector(i.x + 1 * 8 , i.y + 8 * 8), 8);
        plotBySize(g, new Vector(i.x + 2 * 8 , i.y + 8 * 8), 8);
        plotBySize(g, new Vector(i.x + 18 * 8 , i.y + 8 * 8), 8);
        plotBySize(g, new Vector(i.x + 19 * 8 , i.y + 8 * 8), 8);
        plotBySize(g, new Vector(i.x + 20 * 8 , i.y + 8 * 8), 8);
        plotBySize(g, new Vector(i.x + 29 * 8 , i.y + 8 * 8), 8);
        plotBySize(g, new Vector(i.x + 28 * 8 , i.y + 8 * 8), 8);
        plotBySize(g, new Vector(i.x + 27 * 8 , i.y + 8 * 8), 8);
        plotBySize(g, new Vector(i.x + 21 * 8 , i.y + 8 * 8), 8);
        plotBySize(g, new Vector(i.x + 26 * 8 , i.y + 8 * 8), 8);
        plotBySize(g, new Vector(i.x + 2 * 8 , i.y + 9 * 8), 8);
        plotBySize(g, new Vector(i.x + 3 * 8 , i.y + 9 * 8), 8);
        for(int a = 18; a <= 29; a++) plotBySize(g, new Vector(i.x + a * 8 , i.y + 9 * 8), 8);
        plotBySize(g, new Vector(i.x + 3 * 8 , i.y + 10 * 8), 8);
        plotBySize(g, new Vector(i.x + 4 * 8 , i.y + 10 * 8), 8);
        plotBySize(g, new Vector(i.x + 4 * 8 , i.y + 11 * 8), 8);
        plotBySize(g, new Vector(i.x + 5 * 8 , i.y + 11 * 8), 8);
        for(int a = 18; a <= 29; a++) plotBySize(g, new Vector(i.x + a * 8 , i.y + 15 * 8), 8);
        for(int a = 19; a <= 28; a++) plotBySize(g, new Vector(i.x + a * 8 , i.y + 16 * 8), 8);
        for(int a = 5; a <= 7; a++) plotBySize(g, new Vector(i.x + a * 8 , i.y + 17 * 8), 8);
        plotBySize(g, new Vector(i.x + 5 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 6 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 11 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 12 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 20 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 21 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 25 * 8 , i.y + 18 * 8), 8);
        plotBySize(g, new Vector(i.x + 26 * 8 , i.y + 18 * 8), 8);

        for(int a = 10; a <= 14; a++){
            g.setColor(Color.black);
            plotBySize(g, new Vector(i.x + 16 * 8 , i.y + a * 8), 8);
            plotBySize(g, new Vector(i.x + 31 * 8 , i.y + a * 8), 8);
            g.setColor(new Color(153, 153, 153));
            for(int j = 17; j <= 30; j++) plotBySize(g, new Vector(i.x + j * 8 , i.y + a * 8), 8);
        }

        //Face + Cheek
        g.setColor(Color.white);
        plotBySize(g, new Vector(i.x + 20 * 8 , i.y + 11 * 8), 8);
        plotBySize(g, new Vector(i.x + 27 * 8 , i.y + 11 * 8), 8);

        g.setColor(Color.black);
        plotBySize(g, new Vector(i.x + 21 * 8 , i.y + 11 * 8), 8);
        plotBySize(g, new Vector(i.x + 28 * 8 , i.y + 11 * 8), 8);
        plotBySize(g, new Vector(i.x + 20 * 8 , i.y + 12 * 8), 8);
        plotBySize(g, new Vector(i.x + 21 * 8 , i.y + 12 * 8), 8);
        plotBySize(g, new Vector(i.x + 25 * 8 , i.y + 12 * 8), 8);
        plotBySize(g, new Vector(i.x + 27 * 8 , i.y + 12 * 8), 8);
        plotBySize(g, new Vector(i.x + 28 * 8 , i.y + 12 * 8), 8);
        plotBySize(g, new Vector(i.x + 21 * 8 , i.y + 14 * 8), 8);
        plotBySize(g, new Vector(i.x + 24 * 8 , i.y + 14 * 8), 8);
        plotBySize(g, new Vector(i.x + 27 * 8 , i.y + 14 * 8), 8);
        for(int a = 21; a <= 27; a++) plotBySize(g, new Vector(i.x + a * 8 , i.y + 15 * 8), 8);


        g.setColor(new Color(235, 154, 154));
        plotBySize(g, new Vector(i.x + 18 * 8 , i.y + 13 * 8), 8);
        plotBySize(g, new Vector(i.x + 29 * 8 , i.y + 13 * 8), 8);
        plotBySize(g, new Vector(i.x + 18 * 8 , i.y + 14 * 8), 8);
        plotBySize(g, new Vector(i.x + 29 * 8 , i.y + 14 * 8), 8);
        plotBySize(g, new Vector(i.x + 19 * 8 , i.y + 13 * 8), 8);
        plotBySize(g, new Vector(i.x + 30 * 8 , i.y + 13 * 8), 8);
        plotBySize(g, new Vector(i.x + 19 * 8 , i.y + 14 * 8), 8);
        plotBySize(g, new Vector(i.x + 30 * 8 , i.y + 14 * 8), 8);
    }

    private void setBackground(Graphics g, Color color){
        g.setColor(color);
        for(int a = 0; a <= 600; a++) bresenhamLine(g, new Vector(a, 0), new Vector(a, 600));
    }

    private void createBuilding(Graphics g, Vector i, int size){
        int BUILDING_SIZE = size;


        for(int a = i.y; a <= 600; a++){
            g.setColor(Color.black);
            bresenhamLine(g, new Vector(i.x, a + BUILDING_SIZE / 2), new Vector(i.x + BUILDING_SIZE, a));
        }

        Color darkYellow = new Color(225, 191, 0);
        int counter = 0; Color color = Color.darkGray;
        for(int a = i.y; a <= 600; a++){
            g.setColor(color);
            if(counter >= BUILDING_SIZE / 3){
                if(color == Color.darkGray){
                    counter = 0;
                    color = darkYellow;
                }
                else if(color == darkYellow){
                    counter = 0;
                    color = Color.darkGray;
                }
            }
            counter++;
            bresenhamLine(g, new Vector(i.x, a + BUILDING_SIZE / 2), new Vector(i.x - BUILDING_SIZE, a));
        }

        for(int a = i.y; a <= 600; a++){
        }

        for(int a = 0; a <= BUILDING_SIZE; a++){
            g.setColor(Color.gray);
            bresenhamLine(g, new Vector(i.x - BUILDING_SIZE + a, i.y + a / 2), new Vector(i.x + a, i.y - BUILDING_SIZE / 2 + a / 2));
            bresenhamLine(g, new Vector(i.x + BUILDING_SIZE - a, i.y + a / 2), new Vector(i.x - a, i.y - BUILDING_SIZE / 2 + a / 2));

            // /*COINCIDENTAL EPIC CURVE*/ bresenhamLine(g, new Vector(i.x + BUILDING_SIZE - a, i.y - a / 2), new Vector(i.x - a, i.y - BUILDING_SIZE / 2 + a / 2));
        }
    }

    private void createGraphics(Graphics g, Vector i, Vector j, char token){
        int HEIGHT = 100, BORDER_SIZE = 5;
        switch(token){
            case '0':{
                //LAYER 1: Border
                g.setColor(Color.white);
                for(int a = 0; a <= BORDER_SIZE * 4; a++){
                    bresenhamLine(g, new Vector(i.x, i.y + a), new Vector(j.x, j.y + a));
                    bresenhamLine(g, new Vector(j.x, j.y + HEIGHT - a), new Vector(i.x, i.y + HEIGHT - a));
                }
                for(int a = 0; a <= BORDER_SIZE * 2; a++){
                    if(i.y > j.y){
                        bresenhamLine(g, new Vector(j.x - a, (500 - (j.x - a)/2)), new Vector(j.x - a, (500 - (j.x - a)/2) + HEIGHT));
                        bresenhamLine(g, new Vector(i.x + a, (500 - (i.x + a)/2) + HEIGHT), new Vector(i.x + a, (500 - (i.x + a)/2)));
                    }
                    else{
                        bresenhamLine(g, new Vector(j.x - a, (j.x - a)/2 + 50), new Vector(j.x - a, ((j.x - a)/2 + 50) + HEIGHT));
                        bresenhamLine(g, new Vector(i.x + a, ((i.x + a)/2 + 50)), new Vector(i.x + a, ((i.x + a)/2 + 50)  + HEIGHT));
                    }
                }

                HEIGHT += i.y*1.5;

                i.x += BORDER_SIZE * 0.5; j.x -= BORDER_SIZE * 0.5;

                if(i.y > j.y){
                    i.y = 500 - i.x/2;
                    j.y = 500 - j.x/2;
                }
                else{
                    i.y = i.x/2 + 50;
                    j.y = j.x/2 + 50;
                }

                i.y += BORDER_SIZE; j.y += BORDER_SIZE;

                HEIGHT -= i.y*1.5;

                //LAYER 2: Body
                g.setColor(Color.black);

                for(int a = 0; a <= BORDER_SIZE * 2; a++){
                    bresenhamLine(g, new Vector(i.x, i.y + a), new Vector(j.x, j.y + a));
                    bresenhamLine(g, new Vector(j.x, j.y + HEIGHT - a), new Vector(i.x, i.y + HEIGHT - a));
                }

                for(int a = 0; a <= BORDER_SIZE * 1; a++){
                    if(i.y > j.y){
                        bresenhamLine(g, new Vector(j.x - a, (500 - (j.x - a - BORDER_SIZE * 2)/2)), new Vector(j.x - a, (500 - (j.x - a - BORDER_SIZE * 2)/2) + HEIGHT));
                        bresenhamLine(g, new Vector(i.x + a, (500 - (i.x + a - BORDER_SIZE * 2)/2) + HEIGHT), new Vector(i.x + a, (500 - (i.x + a - BORDER_SIZE * 2)/2)));
                    }
                    else{
                        bresenhamLine(g, new Vector(j.x - a, (j.x - a + BORDER_SIZE * 2)/2 + 50), new Vector(j.x - a, ((j.x - a + BORDER_SIZE * 2)/2 + 50) + HEIGHT));
                        bresenhamLine(g, new Vector(i.x + a, ((i.x + a + BORDER_SIZE * 2)/2 + 50)), new Vector(i.x + a, ((i.x + a + BORDER_SIZE * 2)/2 + 50)  + HEIGHT));
                    }
                }
                break;
            }
            case '2':{
                //LAYER 1: Border
                g.setColor(Color.white);
                for(int a = 0; a <= BORDER_SIZE * 4; a++){
                    bresenhamLine(g, new Vector(i.x, (i.y - (int)(BORDER_SIZE)) + a + HEIGHT / 2), new Vector(j.x, (j.y - (int)(BORDER_SIZE)) + a + HEIGHT / 2));
                    bresenhamLine(g, new Vector(i.x, i.y + a), new Vector(j.x, j.y + a));
                    bresenhamLine(g, new Vector(j.x, j.y + HEIGHT - a), new Vector(i.x, i.y + HEIGHT - a));
                }
                for(int a = 0; a <= BORDER_SIZE * 2; a++){
                    if(i.y > j.y){
                        bresenhamLine(g, new Vector(i.x + a, (500 - (i.x + a)/2) + HEIGHT / 2), new Vector(i.x + a, (500 - (i.x + a)/2) + HEIGHT));
                        bresenhamLine(g, new Vector(j.x - a, (500 - (j.x - a)/2)), new Vector(j.x - a, (500 - (j.x - a)/2) + HEIGHT / 2));
                    }
                    else{
                        bresenhamLine(g, new Vector(i.x + a, (i.x + a)/2 + 50 + HEIGHT / 2), new Vector(i.x + a, ((i.x + a)/2 + 50) + HEIGHT));
                        bresenhamLine(g, new Vector(j.x - a, (j.x - a)/2 + 50), new Vector(j.x - a, (j.x - a)/2 + 50 + HEIGHT / 2));
                    }
                }

                HEIGHT += i.y*1.5;

                i.x += BORDER_SIZE * 0.5; j.x -= BORDER_SIZE * 0.5;

                if(i.y > j.y){
                    i.y = 500 - i.x/2;
                    j.y = 500 - j.x/2;
                }
                else{
                    i.y = i.x/2 + 50;
                    j.y = j.x/2 + 50;
                }

                i.y += BORDER_SIZE; j.y += BORDER_SIZE;

                HEIGHT -= i.y*1.5;

                //LAYER 2: Body

                g.setColor(Color.black);
                for(int a = 0; a <= BORDER_SIZE * 2; a++){
                    bresenhamLine(g, new Vector(i.x, (i.y + a + HEIGHT / 2)), new Vector(j.x, (j.y + a + HEIGHT / 2)));
                    bresenhamLine(g, new Vector(i.x, i.y + a), new Vector(j.x, j.y + a));
                    bresenhamLine(g, new Vector(j.x, j.y + HEIGHT - a), new Vector(i.x, i.y + HEIGHT - a));
                }

                for(int a = 0; a <= BORDER_SIZE * 1; a++){
                    if(i.y > j.y){
                        bresenhamLine(g, new Vector(i.x + a, (500 - (i.x + a - BORDER_SIZE * 2)/2) + HEIGHT / 2), new Vector(i.x + a, (500 - (i.x + a - BORDER_SIZE * 2)/2) + HEIGHT));
                        bresenhamLine(g, new Vector(j.x - a, (500 - (j.x - a - BORDER_SIZE * 2)/2)), new Vector(j.x - a, (500 - (j.x - a - BORDER_SIZE * 2)/2) + HEIGHT / 2));
                    }
                    else{
                        bresenhamLine(g, new Vector(i.x + a, (i.x + a + BORDER_SIZE * 2)/2 + 50 + HEIGHT / 2), new Vector(i.x + a, ((i.x + a + BORDER_SIZE * 2)/2 + 50) + HEIGHT));
                        bresenhamLine(g, new Vector(j.x - a, (j.x - a + BORDER_SIZE * 2)/2 + 50), new Vector(j.x - a, (j.x - a + BORDER_SIZE * 2)/2 + 50 + HEIGHT / 2));
                    }
                }
                break;
            }
            case '4':{
                //LAYER 1: Border
                g.setColor(Color.white);
                for(int a = 0; a <= BORDER_SIZE * 4; a++){
                    bresenhamLine(g, new Vector(i.x, (i.y - (BORDER_SIZE)) + a + HEIGHT / 2), new Vector(j.x, (j.y - (BORDER_SIZE)) + a + HEIGHT / 2));
                }
                for(int a = 0; a <= BORDER_SIZE * 2; a++){
                    if(i.y > j.y){
                        bresenhamLine(g, new Vector(i.x + a, (500 - (i.x + a)/2)), new Vector(i.x + a, (500 - (i.x + a)/2) + HEIGHT / 2));
                        bresenhamLine(g, new Vector(j.x - a, (500 - (j.x - a)/2) + HEIGHT), new Vector(j.x - a, (500 - (j.x - a)/2)));
                    }
                    else{
                        bresenhamLine(g, new Vector(i.x + a, (i.x + a)/2 + 50), new Vector(i.x + a, ((i.x + a)/2 + 50) + HEIGHT / 2));
                        bresenhamLine(g, new Vector(j.x - a, ((j.x - a)/2 + 50)), new Vector(j.x - a, ((j.x - a)/2 + 50)  + HEIGHT));
                    }
                }

                HEIGHT += i.y*1.5;

                i.x += BORDER_SIZE * 0.5; j.x -= BORDER_SIZE * 0.5;

                if(i.y > j.y){
                    i.y = 500 - i.x/2;
                    j.y = 500 - j.x/2;
                }
                else{
                    i.y = i.x/2 + 50;
                    j.y = j.x/2 + 50;
                }

                i.y += BORDER_SIZE; j.y += BORDER_SIZE;

                HEIGHT -= i.y*1.5;

                //LAYER 2: Body

                g.setColor(Color.black);
                for(int a = 0; a <= BORDER_SIZE * 2; a++){
                    bresenhamLine(g, new Vector(i.x, (i.y + a + HEIGHT / 2)), new Vector(j.x, (j.y + a + HEIGHT / 2)));
                }

                for(int a = 0; a <= BORDER_SIZE * 1; a++){
                    if(i.y > j.y){
                        bresenhamLine(g, new Vector(i.x + a, (500 - (i.x + a - BORDER_SIZE * 2)/2)), new Vector(i.x + a, (500 - (i.x + a - BORDER_SIZE * 2)/2) + HEIGHT / 2));
                        bresenhamLine(g, new Vector(j.x - a, (500 - (j.x - a - BORDER_SIZE * 2)/2) + HEIGHT), new Vector(j.x - a, (500 - (j.x - a - BORDER_SIZE * 2)/2)));
                    }
                    else{
                        bresenhamLine(g, new Vector(i.x + a, (i.x + a + BORDER_SIZE * 2)/2 + 50), new Vector(i.x + a, ((i.x + a + BORDER_SIZE * 2)/2 + 50) + HEIGHT / 2));
                        bresenhamLine(g, new Vector(j.x - a, ((j.x - a + BORDER_SIZE * 2)/2 + 50)), new Vector(j.x - a, ((j.x - a + BORDER_SIZE * 2)/2 + 50)  + HEIGHT));
                    }
                }
                break;
            }
            case '5':{
                //LAYER 1: Border
                g.setColor(Color.white);
                for(int a = 0; a <= BORDER_SIZE * 4; a++){
                    bresenhamLine(g, new Vector(i.x, (i.y - (int)(BORDER_SIZE)) + a + HEIGHT / 2), new Vector(j.x, (j.y - (int)(BORDER_SIZE)) + a + HEIGHT / 2));
                    bresenhamLine(g, new Vector(i.x, i.y + a), new Vector(j.x, j.y + a));
                    bresenhamLine(g, new Vector(j.x, j.y + HEIGHT - a), new Vector(i.x, i.y + HEIGHT - a));
                }
                for(int a = 0; a <= BORDER_SIZE * 2; a++){
                    if(i.y > j.y){
                        bresenhamLine(g, new Vector(i.x + a, (500 - (i.x + a)/2)), new Vector(i.x + a, (500 - (i.x + a)/2) + HEIGHT / 2));
                        bresenhamLine(g, new Vector(j.x - a, (500 - (j.x - a)/2) + HEIGHT / 2), new Vector(j.x - a, (500 - (j.x - a)/2) + HEIGHT));
                    }
                    else{
                        bresenhamLine(g, new Vector(i.x + a, (i.x + a)/2 + 50), new Vector(i.x + a, ((i.x + a)/2 + 50) + HEIGHT / 2));
                        bresenhamLine(g, new Vector(j.x - a, (j.x - a)/2 + 50 + HEIGHT / 2), new Vector(j.x - a, (j.x - a)/2 + 50 + HEIGHT));
                    }
                }

                HEIGHT += i.y*1.5;

                i.x += BORDER_SIZE * 0.5; j.x -= BORDER_SIZE * 0.5;

                if(i.y > j.y){
                    i.y = 500 - i.x/2;
                    j.y = 500 - j.x/2;
                }
                else{
                    i.y = i.x/2 + 50;
                    j.y = j.x/2 + 50;
                }

                i.y += BORDER_SIZE; j.y += BORDER_SIZE;

                HEIGHT -= i.y*1.5;

                //LAYER 2: Body
                g.setColor(Color.black);
                for(int a = 0; a <= BORDER_SIZE * 2; a++){
                    bresenhamLine(g, new Vector(i.x, (i.y + a + HEIGHT / 2)), new Vector(j.x, (j.y + a + HEIGHT / 2)));
                    bresenhamLine(g, new Vector(i.x, i.y + a), new Vector(j.x, j.y + a));
                    bresenhamLine(g, new Vector(j.x, j.y + HEIGHT - a), new Vector(i.x, i.y + HEIGHT - a));
                }

                for(int a = 0; a <= BORDER_SIZE * 1; a++){
                    if(i.y > j.y){
                        bresenhamLine(g, new Vector(i.x + a, (500 - (i.x + a - BORDER_SIZE * 2)/2)), new Vector(i.x + a, (500 - (i.x + a - BORDER_SIZE * 2)/2) + HEIGHT / 2));
                        bresenhamLine(g, new Vector(j.x - a, (500 - (j.x - a - BORDER_SIZE * 2)/2) + HEIGHT / 2), new Vector(j.x - a, (500 - (j.x - a - BORDER_SIZE * 2)/2) + HEIGHT));
                    }
                    else{
                        bresenhamLine(g, new Vector(i.x + a, (i.x + a + BORDER_SIZE * 2)/2 + 50), new Vector(i.x + a, ((i.x + a + BORDER_SIZE * 2)/2 + 50) + HEIGHT / 2));
                        bresenhamLine(g, new Vector(j.x - a, (j.x - a + BORDER_SIZE * 2)/2 + 50 + HEIGHT / 2), new Vector(j.x - a, (j.x - a + BORDER_SIZE * 2)/2 + 50 + HEIGHT));
                    }
                }
                break;
            }
            case '6':{
                //LAYER 1: Border
                g.setColor(Color.white);
                for(int a = 0; a <= BORDER_SIZE * 4; a++){
                    bresenhamLine(g, new Vector(i.x, (i.y - (int)(BORDER_SIZE)) + a + HEIGHT / 2), new Vector(j.x, (j.y - (int)(BORDER_SIZE)) + a + HEIGHT / 2));
                    bresenhamLine(g, new Vector(i.x, i.y + a), new Vector(j.x, j.y + a));
                    bresenhamLine(g, new Vector(j.x, j.y + HEIGHT - a), new Vector(i.x, i.y + HEIGHT - a));
                }
                for(int a = 0; a <= BORDER_SIZE * 2; a++){
                    if(i.y > j.y){
                        bresenhamLine(g, new Vector(i.x + a, (500 - (i.x + a)/2)), new Vector(i.x + a, (500 - (i.x + a)/2) + HEIGHT));
                        bresenhamLine(g, new Vector(j.x - a, (500 - (j.x - a)/2) + HEIGHT / 2), new Vector(j.x - a, (500 - (j.x - a)/2) + HEIGHT));
                    }
                    else{
                        bresenhamLine(g, new Vector(i.x + a, (i.x + a)/2 + 50), new Vector(i.x + a, ((i.x + a)/2 + 50) + HEIGHT));
                        bresenhamLine(g, new Vector(j.x - a, (j.x - a)/2 + 50 + HEIGHT / 2), new Vector(j.x - a, (j.x - a)/2 + 50 + HEIGHT));
                    }
                }

                HEIGHT += i.y*1.5;

                i.x += BORDER_SIZE * 0.5; j.x -= BORDER_SIZE * 0.5;

                if(i.y > j.y){
                    i.y = 500 - i.x/2;
                    j.y = 500 - j.x/2;
                }
                else{
                    i.y = i.x/2 + 50;
                    j.y = j.x/2 + 50;
                }

                i.y += BORDER_SIZE; j.y += BORDER_SIZE;

                HEIGHT -= i.y*1.5;

                //LAYER 2: Body
                g.setColor(Color.black);
                for(int a = 0; a <= BORDER_SIZE * 2; a++){
                    bresenhamLine(g, new Vector(i.x, (i.y + a + HEIGHT / 2)), new Vector(j.x, (j.y + a + HEIGHT / 2)));
                    bresenhamLine(g, new Vector(i.x, i.y + a), new Vector(j.x, j.y + a));
                    bresenhamLine(g, new Vector(j.x, j.y + HEIGHT - a), new Vector(i.x, i.y + HEIGHT - a));
                }

                for(int a = 0; a <= BORDER_SIZE * 1; a++){
                    if(i.y > j.y){
                        bresenhamLine(g, new Vector(i.x + a, (500 - (i.x + a - BORDER_SIZE * 2)/2)), new Vector(i.x + a, (500 - (i.x + a - BORDER_SIZE * 2)/2) + HEIGHT));
                        bresenhamLine(g, new Vector(j.x - a, (500 - (j.x - a - BORDER_SIZE * 2)/2) + HEIGHT / 2), new Vector(j.x - a, (500 - (j.x - a - BORDER_SIZE * 2)/2) + HEIGHT));
                    }
                    else{
                        bresenhamLine(g, new Vector(i.x + a, (i.x + a + BORDER_SIZE * 2)/2 + 50), new Vector(i.x + a, ((i.x + a + BORDER_SIZE * 2)/2 + 50) + HEIGHT));
                        bresenhamLine(g, new Vector(j.x - a, (j.x - a + BORDER_SIZE * 2)/2 + 50 + HEIGHT / 2), new Vector(j.x - a, (j.x - a + BORDER_SIZE * 2)/2 + 50 + HEIGHT));
                    }
                }
                break;
            }
            case '8':{
                //LAYER 1: Border
                g.setColor(Color.white);
                for(int a = 0; a <= BORDER_SIZE * 4; a++){
                    bresenhamLine(g, new Vector(i.x, (i.y - (int)(BORDER_SIZE)) + a + HEIGHT / 2), new Vector(j.x, (j.y - (int)(BORDER_SIZE)) + a + HEIGHT / 2));
                    bresenhamLine(g, new Vector(i.x, i.y + a), new Vector(j.x, j.y + a));
                    bresenhamLine(g, new Vector(j.x, j.y + HEIGHT - a), new Vector(i.x, i.y + HEIGHT - a));
                }
                for(int a = 0; a <= BORDER_SIZE * 2; a++){
                    if(i.y > j.y){
                        bresenhamLine(g, new Vector(j.x - a, (500 - (j.x - a)/2)), new Vector(j.x - a, (500 - (j.x - a)/2) + HEIGHT));
                        bresenhamLine(g, new Vector(i.x + a, (500 - (i.x + a)/2) + HEIGHT), new Vector(i.x + a, (500 - (i.x + a)/2)));
                    }
                    else{
                        bresenhamLine(g, new Vector(j.x - a, (j.x - a)/2 + 50), new Vector(j.x - a, ((j.x - a)/2 + 50) + HEIGHT));
                        bresenhamLine(g, new Vector(i.x + a, ((i.x + a)/2 + 50)), new Vector(i.x + a, ((i.x + a)/2 + 50)  + HEIGHT));
                    }
                }

                HEIGHT += i.y*1.5;

                i.x += BORDER_SIZE * 0.5; j.x -= BORDER_SIZE * 0.5;

                if(i.y > j.y){
                    i.y = 500 - i.x/2;
                    j.y = 500 - j.x/2;
                }
                else{
                    i.y = i.x/2 + 50;
                    j.y = j.x/2 + 50;
                }

                i.y += BORDER_SIZE; j.y += BORDER_SIZE;

                HEIGHT -= i.y*1.5;

                //LAYER 2: Body
                g.setColor(Color.black);

                for(int a = 0; a <= BORDER_SIZE * 2; a++){
                    bresenhamLine(g, new Vector(i.x, (i.y + a + HEIGHT / 2)), new Vector(j.x, (j.y + a + HEIGHT / 2)));
                    bresenhamLine(g, new Vector(i.x, i.y + a), new Vector(j.x, j.y + a));
                    bresenhamLine(g, new Vector(j.x, j.y + HEIGHT - a), new Vector(i.x, i.y + HEIGHT - a));
                }

                for(int a = 0; a <= BORDER_SIZE * 1; a++){
                    if(i.y > j.y){
                        bresenhamLine(g, new Vector(j.x - a, (500 - (j.x - a - BORDER_SIZE * 2)/2)), new Vector(j.x - a, (500 - (j.x - a - BORDER_SIZE * 2)/2) + HEIGHT));
                        bresenhamLine(g, new Vector(i.x + a, (500 - (i.x + a - BORDER_SIZE * 2)/2) + HEIGHT), new Vector(i.x + a, (500 - (i.x + a - BORDER_SIZE * 2)/2)));
                    }
                    else{
                        bresenhamLine(g, new Vector(j.x - a, (j.x - a + BORDER_SIZE * 2)/2 + 50), new Vector(j.x - a, ((j.x - a + BORDER_SIZE * 2)/2 + 50) + HEIGHT));
                        bresenhamLine(g, new Vector(i.x + a, ((i.x + a + BORDER_SIZE * 2)/2 + 50)), new Vector(i.x + a, ((i.x + a + BORDER_SIZE * 2)/2 + 50)  + HEIGHT));
                    }
                }
                break;
            }
            case '9':{
                //LAYER 1: Border
                g.setColor(Color.white);
                for(int a = 0; a <= BORDER_SIZE * 4; a++){
                    bresenhamLine(g, new Vector(i.x, (i.y - (int)(BORDER_SIZE)) + a + HEIGHT / 2), new Vector(j.x, (j.y - (int)(BORDER_SIZE)) + a + HEIGHT / 2));
                    bresenhamLine(g, new Vector(i.x, i.y + a), new Vector(j.x, j.y + a));
                    bresenhamLine(g, new Vector(j.x, j.y + HEIGHT - a), new Vector(i.x, i.y + HEIGHT - a));
                }
                for(int a = 0; a <= BORDER_SIZE * 2; a++){
                    if(i.y > j.y){
                        bresenhamLine(g, new Vector(i.x + a, (500 - (i.x + a)/2)), new Vector(i.x + a, (500 - (i.x + a)/2) + HEIGHT / 2));
                        bresenhamLine(g, new Vector(j.x - a, (500 - (j.x - a)/2)), new Vector(j.x - a, (500 - (j.x - a)/2) + HEIGHT));
                    }
                    else{
                        bresenhamLine(g, new Vector(i.x + a, (i.x + a)/2 + 50), new Vector(i.x + a, ((i.x + a)/2 + 50) + HEIGHT / 2));
                        bresenhamLine(g, new Vector(j.x - a, (j.x - a)/2 + 50), new Vector(j.x - a, (j.x - a)/2 + 50 + HEIGHT));
                    }
                }

                HEIGHT += i.y*1.5;

                i.x += BORDER_SIZE * 0.5; j.x -= BORDER_SIZE * 0.5;

                if(i.y > j.y){
                    i.y = 500 - i.x/2;
                    j.y = 500 - j.x/2;
                }
                else{
                    i.y = i.x/2 + 50;
                    j.y = j.x/2 + 50;
                }

                i.y += BORDER_SIZE; j.y += BORDER_SIZE;

                HEIGHT -= i.y*1.5;

                //LAYER 2: Body

                g.setColor(Color.black);
                for(int a = 0; a <= BORDER_SIZE * 2; a++){
                    bresenhamLine(g, new Vector(i.x, (i.y + a + HEIGHT / 2)), new Vector(j.x, (j.y + a + HEIGHT / 2)));
                    bresenhamLine(g, new Vector(i.x, i.y + a), new Vector(j.x, j.y + a));
                    bresenhamLine(g, new Vector(j.x, j.y + HEIGHT - a), new Vector(i.x, i.y + HEIGHT - a));
                }

                for(int a = 0; a <= BORDER_SIZE * 1; a++){
                    if(i.y > j.y){
                        bresenhamLine(g, new Vector(i.x + a, (500 - (i.x + a - BORDER_SIZE * 2)/2)), new Vector(i.x + a, (500 - (i.x + a - BORDER_SIZE * 2)/2) + HEIGHT / 2));
                        bresenhamLine(g, new Vector(j.x - a, (500 - (j.x - a - BORDER_SIZE * 2)/2)), new Vector(j.x - a, (500 - (j.x - a - BORDER_SIZE * 2)/2) + HEIGHT));
                    }
                    else{
                        bresenhamLine(g, new Vector(i.x + a, (i.x + a + BORDER_SIZE * 2)/2 + 50), new Vector(i.x + a, ((i.x + a + BORDER_SIZE * 2)/2 + 50) + HEIGHT / 2));
                        bresenhamLine(g, new Vector(j.x - a, (j.x - a + BORDER_SIZE * 2)/2 + 50), new Vector(j.x - a, (j.x - a + BORDER_SIZE * 2)/2 + 50 + HEIGHT));
                    }
                }
                break;
            }
        }
        g.setColor(Color.white);
    }

    private void plot(Graphics g, Vector i){ g.fillRect(i.x, i.y, 1, 1); }

    private void bresenhamLine(Graphics g, Vector i, Vector j){
        if(Math.abs(j.y - i.y) < Math.abs(j.x - i.x)){
            if(i.x > j.x) plotLineLow(g, new Vector(j.x, j.y), new Vector(i.x, i.y));
            else plotLineLow(g, new Vector(i.x, i.y), new Vector(j.x, j.y));
        }
        else{
            if(i.y > j.y) plotLineHigh(g, new Vector(j.x, j.y), new Vector(i.x, i.y));
            else plotLineHigh(g, new Vector(i.x, i.y), new Vector(j.x, j.y));
        }
    }

    private void plotLineLow(Graphics g, Vector i, Vector j){
        int dx = j.x - i.x;
        int dy = j.y - i.y;
        int yi = 1;

        if(dy < 0){
            yi = -1;
            dy = -dy;
        }

        int D = 2*dy - dx;
        int y = i.y;

        for(int x = i.x; x <= j.x; x++){
            plot(g, new Vector(x, y));
            if(D > 0){
                y += yi;
                D -= 2*dx;
            }
            D += 2*dy;
        }
    }

    private void plotLineHigh(Graphics g, Vector i, Vector j){
        int dx = j.x - i.x;
        int dy = j.y - i.y;
        int xi = 1;

        if(dx < 0){
            xi = -1;
            dx = -dx;
        }

        int D = 2*dx - dy;
        int x = i.x;

        for(int y = i.y; y <= j.y; y++){
            plot(g, new Vector(x, y));
            if(D > 0){
                x += xi;
                D -= 2*dy;
            }
            D += 2*dx;
        }
    }
}