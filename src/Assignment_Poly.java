import java.awt.*;
import javax.swing.*;

public class Assignment_Poly extends JPanel {

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
        Assignment_Poly m = new Assignment_Poly();

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
        
        //sky
        createPoly(g, new Triangle(new Vector(599,0), new Vector(599,36), new Vector(557,6)), new Color(216,113,142));
        createPoly(g, new Triangle(new Vector(599,0), new Vector(433,0), new Vector(432,20)), new Color(225,133,116));
        createPoly(g, new Triangle(new Vector(557,7), new Vector(599,36), new Vector(509,41)), new Color(225,123,146));
        createPoly(g, new Triangle(new Vector(562,4), new Vector(524,8), new Vector(509,41)), new Color(248,122,136));
        createPoly(g, new Triangle(new Vector(599,36), new Vector(599,81), new Vector(509,41)), new Color(255,215,205));
        createPoly(g, new Triangle(new Vector(491,85), new Vector(599,81), new Vector(582,70)), new Color(255,186,175));
        createPoly(g, new Triangle(new Vector(491,85), new Vector(599,81), new Vector(526,117)), new Color(255,186,175));
        createPoly(g, new Triangle(new Vector(491,85), new Vector(509,41), new Vector(582,70)), new Color(255,215,205));
        createPoly(g, new Triangle(new Vector(599,81), new Vector(491,85), new Vector(550,63)), new Color(255,186,175));
        createPoly(g, new Triangle(new Vector(524,8), new Vector(436,58), new Vector(432,13)), new Color(220,120,153));
        createPoly(g, new Triangle(new Vector(524,8), new Vector(436,58), new Vector(509,41)), new Color(253,185,152));
        createPoly(g, new Triangle(new Vector(491,85), new Vector(436,58), new Vector(509,41)), new Color(246,211,219));
        createPoly(g, new Triangle(new Vector(491,85), new Vector(436,58), new Vector(461,107)), new Color(255,193,204));
        createPoly(g, new Triangle(new Vector(491,85), new Vector(532,124), new Vector(461,107)), new Color(255,193,204));
        createPoly(g, new Triangle(new Vector(599,135), new Vector(599,81), new Vector(511,121)), new Color(255,207,193));
        createPoly(g, new Triangle(new Vector(490,160), new Vector(599,197), new Vector(466,202)), new Color(240,133,153));
        createPoly(g, new Triangle(new Vector(490,160), new Vector(461,107), new Vector(599,135)), new Color(254,237,217));
        createPoly(g, new Triangle(new Vector(490,160), new Vector(599,197), new Vector(599,135)), new Color(255,168,174));
        createPoly(g, new Triangle(new Vector(599,222), new Vector(599,197), new Vector(466,202)), new Color(249,114,118));
        createPoly(g, new Triangle(new Vector(599,222), new Vector(437,235), new Vector(466,202)), new Color(254,130,124));
        createPoly(g, new Triangle(new Vector(599,222), new Vector(499,227), new Vector(599,279)), new Color(202,110,148));
        createPoly(g, new Triangle(new Vector(466,277), new Vector(499,227), new Vector(599,279)), new Color(210,117,141));
        createPoly(g, new Triangle(new Vector(466,277), new Vector(520,311), new Vector(599,279)), new Color(255,221,209));
        createPoly(g, new Triangle(new Vector(466,277), new Vector(520,311), new Vector(479,319)), new Color(255,221,209));
        createPoly(g, new Triangle(new Vector(539,360), new Vector(520,311), new Vector(479,319)), new Color(255,212,195));
        createPoly(g, new Triangle(new Vector(539,360), new Vector(520,311), new Vector(599,279)), new Color(255,217,194));
        createPoly(g, new Triangle(new Vector(539,360), new Vector(599,356), new Vector(599,279)), new Color(255,221,209));
        createPoly(g, new Triangle(new Vector(539,360), new Vector(537,416), new Vector(599,356)), new Color(255,204,157));
        createPoly(g, new Triangle(new Vector(599,423), new Vector(537,416), new Vector(599,356)), new Color(254,192,125));
        createPoly(g, new Triangle(new Vector(539,360), new Vector(537,416), new Vector(429,404)), new Color(255,186,157));
        createPoly(g, new Triangle(new Vector(539,360), new Vector(479,319), new Vector(429,404)), new Color(255,193,148));
        createPoly(g, new Triangle(new Vector(539,360), new Vector(479,319), new Vector(429,404)), new Color(255,193,148));
        createPoly(g, new Triangle(new Vector(342,333), new Vector(479,319), new Vector(429,404)), new Color(255,217,194));
        createPoly(g, new Triangle(new Vector(539,360), new Vector(479,319), new Vector(429,404)), new Color(255,186,157));
        createPoly(g, new Triangle(new Vector(466,277), new Vector(479,319), new Vector(342,333)), new Color(255,193,148));
        createPoly(g, new Triangle(new Vector(369,285), new Vector(294,311), new Vector(355,339)), new Color(253,208,157));
        createPoly(g, new Triangle(new Vector(369,285), new Vector(355,333), new Vector(466,277)), new Color(253,217,194));
        createPoly(g, new Triangle(new Vector(499,227), new Vector(438,233), new Vector(466,277)), new Color(249,119,137));
        createPoly(g, new Triangle(new Vector(369,285), new Vector(438,233), new Vector(466,277)), new Color(217,112,142));
        createPoly(g, new Triangle(new Vector(369,285), new Vector(438,233), new Vector(405,235)), new Color(247,121,135));
        createPoly(g, new Triangle(new Vector(369,285), new Vector(360,264), new Vector(405,235)), new Color(223,122,157));
        createPoly(g, new Triangle(new Vector(405,247), new Vector(360,264), new Vector(405,235)), new Color(223,122,157));
        createPoly(g, new Triangle(new Vector(305,247), new Vector(360,264), new Vector(405,235)), new Color(248,173,179));
        createPoly(g, new Triangle(new Vector(305,247), new Vector(391,212), new Vector(405,235)), new Color(255,132,135));
        createPoly(g, new Triangle(new Vector(305,247), new Vector(391,212), new Vector(296,219)), new Color(254,121,128));
        createPoly(g, new Triangle(new Vector(305,247), new Vector(360,264), new Vector(294,311)), new Color(252,202,195));
        createPoly(g, new Triangle(new Vector(369,258), new Vector(370,294), new Vector(294,311)), new Color(255,220,206));
        createPoly(g, new Triangle(new Vector(391,212), new Vector(490,160), new Vector(466,202)), new Color(255,220,206));
        createPoly(g, new Triangle(new Vector(391,212), new Vector(438,233), new Vector(466,202)), new Color(252,115,152));
        createPoly(g, new Triangle(new Vector(391,212), new Vector(438,233), new Vector(405,235)), new Color(254,126,125));
        createPoly(g, new Triangle(new Vector(391,212), new Vector(490,160), new Vector(444,159)), new Color(255,154,142));
        createPoly(g, new Triangle(new Vector(454,147), new Vector(490,160), new Vector(444,159)), new Color(255,154,142));
        createPoly(g, new Triangle(new Vector(391,212), new Vector(388,164), new Vector(444,159)), new Color(255,143,132));
        createPoly(g, new Triangle(new Vector(391,212), new Vector(388,164), new Vector(286,170)), new Color(255,220,206));
        createPoly(g, new Triangle(new Vector(391,212), new Vector(296,219), new Vector(286,170)), new Color(255,154,142));
        createPoly(g, new Triangle(new Vector(490,160), new Vector(478,135), new Vector(454,147)), new Color(255,230,217));
        createPoly(g, new Triangle(new Vector(382,125), new Vector(478,135), new Vector(454,147)), new Color(255,230,217));
        createPoly(g, new Triangle(new Vector(382,125), new Vector(444,159), new Vector(454,147)), new Color(255,192,164));
        createPoly(g, new Triangle(new Vector(382,125), new Vector(444,159), new Vector(388,164)), new Color(254,196,184));
        createPoly(g, new Triangle(new Vector(382,125), new Vector(336,146), new Vector(388,164)), new Color(253,190,201));
        createPoly(g, new Triangle(new Vector(286,170), new Vector(336,146), new Vector(388,164)), new Color(255,202,198));
        createPoly(g, new Triangle(new Vector(382,125), new Vector(336,146), new Vector(322,120)), new Color(255,202,198));
        createPoly(g, new Triangle(new Vector(478,135), new Vector(345,104), new Vector(322,120)), new Color(254,168,177));
        createPoly(g, new Triangle(new Vector(478,135), new Vector(345,104), new Vector(461,107)), new Color(253,190,201));
        createPoly(g, new Triangle(new Vector(365,90), new Vector(345,104), new Vector(461,107)), new Color(246,203,223));
        createPoly(g, new Triangle(new Vector(365,90), new Vector(384,71), new Vector(461,107)), new Color(252,215,228));
        createPoly(g, new Triangle(new Vector(436,58), new Vector(384,71), new Vector(461,107)), new Color(252,215,228));
        createPoly(g, new Triangle(new Vector(436,58), new Vector(384,71), new Vector(383,29)), new Color(246,203,223));
        createPoly(g, new Triangle(new Vector(436,58), new Vector(432,13), new Vector(383,29)), new Color(253,190,201));
        createPoly(g, new Triangle(new Vector(433,0), new Vector(432,13), new Vector(383,29)), new Color(246,203,223));
        createPoly(g, new Triangle(new Vector(433,0), new Vector(379,0), new Vector(383,29)), new Color(251,117,128));
        createPoly(g, new Triangle(new Vector(307,30), new Vector(379,0), new Vector(383,29)), new Color(228,129,157));
        createPoly(g, new Triangle(new Vector(307,30), new Vector(384,71), new Vector(383,29)), new Color(245,133,155));
        createPoly(g, new Triangle(new Vector(307,30), new Vector(384,71), new Vector(278,68)), new Color(251,117,128));
        createPoly(g, new Triangle(new Vector(365,90), new Vector(384,71), new Vector(276,68)), new Color(241,183,191));
        createPoly(g, new Triangle(new Vector(365,90), new Vector(345,104), new Vector(276,68)), new Color(246,204,226));
        createPoly(g, new Triangle(new Vector(244,102), new Vector(345,104), new Vector(276,68)), new Color(241,187,216));
        createPoly(g, new Triangle(new Vector(244,102), new Vector(345,104), new Vector(322,120)), new Color(248,181,194));
        createPoly(g, new Triangle(new Vector(244,102), new Vector(185,115), new Vector(322,120)), new Color(248,182,220));
        createPoly(g, new Triangle(new Vector(336,146), new Vector(185,115), new Vector(322,120)), new Color(254,146,138));
        createPoly(g, new Triangle(new Vector(336,146), new Vector(185,115), new Vector(286,170)), new Color(255,202,198));
        createPoly(g, new Triangle(new Vector(205,173), new Vector(185,115), new Vector(286,170)), new Color(244,200,223));
        createPoly(g, new Triangle(new Vector(150,174), new Vector(248,183), new Vector(286,170)), new Color(255,217,207));
        createPoly(g, new Triangle(new Vector(150,174), new Vector(248,183), new Vector(223,210)), new Color(254,202,188));
        createPoly(g, new Triangle(new Vector(296,219), new Vector(248,183), new Vector(223,210)), new Color(255,184,180));
        createPoly(g, new Triangle(new Vector(296,219), new Vector(248,183), new Vector(286,170)), new Color(255,184,180));
        createPoly(g, new Triangle(new Vector(296,219), new Vector(199,263), new Vector(223,210)), new Color(229,129,157));
        createPoly(g, new Triangle(new Vector(296,219), new Vector(199,263), new Vector(259,259)), new Color(216,127,174));
        createPoly(g, new Triangle(new Vector(296,219), new Vector(305,247), new Vector(259,259)), new Color(207,128,185));
        createPoly(g, new Triangle(new Vector(294,311), new Vector(305,247), new Vector(259,259)), new Color(255,220,208));
        createPoly(g, new Triangle(new Vector(294,311), new Vector(241,291), new Vector(259,259)), new Color(255,186,157));
        createPoly(g, new Triangle(new Vector(294,311), new Vector(241,291), new Vector(259,259)), new Color(255,186,157));
        createPoly(g, new Triangle(new Vector(294,311), new Vector(241,291), new Vector(212,338)), new Color(255,186,157));
        createPoly(g, new Triangle(new Vector(168,262), new Vector(241,291), new Vector(212,338)), new Color(245,183,184));
        createPoly(g, new Triangle(new Vector(168,262), new Vector(241,291), new Vector(212,338)), new Color(245,183,184));
        createPoly(g, new Triangle(new Vector(168,262), new Vector(241,291), new Vector(259,259)), new Color(255,212,195));
        createPoly(g, new Triangle(new Vector(168,262), new Vector(216,324), new Vector(131,316)), new Color(255,212,195));
        createPoly(g, new Triangle(new Vector(222,382), new Vector(216,324), new Vector(131,316)), new Color(255,186,157));
        createPoly(g, new Triangle(new Vector(98,365), new Vector(222,382), new Vector(131,316)), new Color(255,212,195));
        createPoly(g, new Triangle(new Vector(98,365), new Vector(222,382), new Vector(50,434)), new Color(255,212,195));
        createPoly(g, new Triangle(new Vector(98,365), new Vector(0,396), new Vector(50,434)), new Color(255,186,157));
        createPoly(g, new Triangle(new Vector(0,435), new Vector(0,396), new Vector(80,395)), new Color(255,212,195));
        createPoly(g, new Triangle(new Vector(98,365), new Vector(0,396), new Vector(0,325)), new Color(253,216,200));
        createPoly(g, new Triangle(new Vector(98,365), new Vector(131,316), new Vector(0,325)), new Color(255,204,157));
        createPoly(g, new Triangle(new Vector(0,267), new Vector(131,316), new Vector(0,325)), new Color(254,168,177));
        createPoly(g, new Triangle(new Vector(0,267), new Vector(131,316), new Vector(168,262)), new Color(252,208,207));
        createPoly(g, new Triangle(new Vector(0,267), new Vector(77,219), new Vector(199,263)), new Color(230,120,147));
        createPoly(g, new Triangle(new Vector(223,210), new Vector(77,219), new Vector(199,263)), new Color(255,184,180));
        createPoly(g, new Triangle(new Vector(223,210), new Vector(77,219), new Vector(150,174)), new Color(253,204,210));
        createPoly(g, new Triangle(new Vector(0,267), new Vector(77,219), new Vector(0,226)), new Color(253,204,210));
        createPoly(g, new Triangle(new Vector(94,177), new Vector(77,219), new Vector(0,226)), new Color(243,189,205));
        createPoly(g, new Triangle(new Vector(94,177), new Vector(0,137), new Vector(0,226)), new Color(227,183,207));
        createPoly(g, new Triangle(new Vector(94,177), new Vector(77,219), new Vector(150,174)), new Color(255,194,201));
        createPoly(g, new Triangle(new Vector(94,177), new Vector(185,115), new Vector(150,174)), new Color(254,204,216));
        createPoly(g, new Triangle(new Vector(205,173), new Vector(185,115), new Vector(150,174)), new Color(254,204,216));
        createPoly(g, new Triangle(new Vector(0,76), new Vector(74,119), new Vector(150,87)), new Color(254,204,216));
        createPoly(g, new Triangle(new Vector(0,76), new Vector(74,119), new Vector(0,137)), new Color(254,176,176));
        createPoly(g, new Triangle(new Vector(94,177), new Vector(74,119), new Vector(0,137)), new Color(251,217,205));
        createPoly(g, new Triangle(new Vector(94,177), new Vector(74,119), new Vector(129,118)), new Color(255,230,217));
        createPoly(g, new Triangle(new Vector(94,177), new Vector(185,115), new Vector(129,118)), new Color(255,230,230));
        createPoly(g, new Triangle(new Vector(150,87), new Vector(74,119), new Vector(185,115)), new Color(254,176,176));
        createPoly(g, new Triangle(new Vector(150,87), new Vector(290,90), new Vector(185,115)), new Color(251,217,205));
        createPoly(g, new Triangle(new Vector(0,76), new Vector(0,34), new Vector(55,28)), new Color(198,140,151));
        createPoly(g, new Triangle(new Vector(0,0), new Vector(0,34), new Vector(55,28)), new Color(253,145,150));
        createPoly(g, new Triangle(new Vector(0,0), new Vector(49,0), new Vector(55,28)), new Color(251,217,205));
        createPoly(g, new Triangle(new Vector(157,0), new Vector(49,0), new Vector(55,28)), new Color(251,217,205));
        createPoly(g, new Triangle(new Vector(157,0), new Vector(156,32), new Vector(55,28)), new Color(210,103,148)); 
        createPoly(g, new Triangle(new Vector(0,76), new Vector(156,32), new Vector(55,28)), new Color(252,112,123)); 
        createPoly(g, new Triangle(new Vector(0,76), new Vector(156,32), new Vector(55,28)), new Color(252,112,123));
        createPoly(g, new Triangle(new Vector(0,76), new Vector(156,32), new Vector(150,87)), new Color(251,217,205));
        createPoly(g, new Triangle(new Vector(157,0), new Vector(156,32), new Vector(239,0)), new Color(253,145,150));
        createPoly(g, new Triangle(new Vector(307,30), new Vector(156,32), new Vector(239,0)), new Color(251,217,205));
        createPoly(g, new Triangle(new Vector(307,30), new Vector(379,0), new Vector(239,0)), new Color(211,117,118));
        createPoly(g, new Triangle(new Vector(307,30), new Vector(156,32), new Vector(276,70)), new Color(253,145,150));
        createPoly(g, new Triangle(new Vector(151,87), new Vector(156,32), new Vector(276,70)), new Color(255,204,175));
        createPoly(g, new Triangle(new Vector(151,87), new Vector(244,102), new Vector(276,70)), new Color(246,183,184));
         
        //ground
        createPoly(g, new Triangle(new Vector(0,440), new Vector(60,440), new Vector(0,462)), new Color(207,233,178));
        createPoly(g, new Triangle(new Vector(41,465), new Vector(60,440), new Vector(0,462)), new Color(223,239,198));
        createPoly(g, new Triangle(new Vector(41,465), new Vector(60,440), new Vector(87,465)), new Color(207,233,178));
        createPoly(g, new Triangle(new Vector(109,440), new Vector(60,440), new Vector(87,465)), new Color(223,239,198));
        createPoly(g, new Triangle(new Vector(109,440), new Vector(121,460), new Vector(87,465)), new Color(207,233,178));
        createPoly(g, new Triangle(new Vector(109,440), new Vector(121,460), new Vector(135,440)), new Color(223,239,198));
        createPoly(g, new Triangle(new Vector(165,456), new Vector(121,460), new Vector(135,440)), new Color(216,236,178));
        createPoly(g, new Triangle(new Vector(165,456), new Vector(221,440), new Vector(135,440)), new Color(223,239,198));
        createPoly(g, new Triangle(new Vector(165,456), new Vector(221,440), new Vector(255,453)), new Color(207,233,178));
        createPoly(g, new Triangle(new Vector(286,440), new Vector(221,440), new Vector(255,453)), new Color(223,239,198));
        createPoly(g, new Triangle(new Vector(286,440), new Vector(298,473), new Vector(255,453)), new Color(207,233,178));
        createPoly(g, new Triangle(new Vector(286,440), new Vector(298,473), new Vector(360,440)), new Color(207,233,178));
        createPoly(g, new Triangle(new Vector(412,461), new Vector(298,473), new Vector(360,440)), new Color(207,233,178));
        createPoly(g, new Triangle(new Vector(412,461), new Vector(461,440), new Vector(360,440)), new Color(223,239,198));
        createPoly(g, new Triangle(new Vector(412,461), new Vector(461,440), new Vector(506,465)), new Color(207,233,178));
        createPoly(g, new Triangle(new Vector(527,440), new Vector(461,440), new Vector(506,465)), new Color(223,239,198));
        createPoly(g, new Triangle(new Vector(527,440), new Vector(554,470), new Vector(506,465)), new Color(207,233,178));
        createPoly(g, new Triangle(new Vector(527,440), new Vector(554,470), new Vector(599,440)), new Color(223,239,198));
        createPoly(g, new Triangle(new Vector(599,477), new Vector(554,470), new Vector(599,440)), new Color(207,233,178));
        createPoly(g, new Triangle(new Vector(599,477), new Vector(554,470), new Vector(549,514)), new Color(185,220,136));
        createPoly(g, new Triangle(new Vector(599,477), new Vector(599,534), new Vector(549,514)), new Color(175,214,121));
        createPoly(g, new Triangle(new Vector(506,465), new Vector(554,470), new Vector(549,514)), new Color(191,223,146));
        createPoly(g, new Triangle(new Vector(506,465), new Vector(481,488), new Vector(549,514)), new Color(191,223,146));
        createPoly(g, new Triangle(new Vector(506,465), new Vector(481,488), new Vector(412,461)), new Color(185,220,136));
        createPoly(g, new Triangle(new Vector(423,526), new Vector(481,488), new Vector(412,461)), new Color(191,223,146));
        createPoly(g, new Triangle(new Vector(423,526), new Vector(389,505), new Vector(412,461)), new Color(191,223,146));
        createPoly(g, new Triangle(new Vector(298,473), new Vector(389,505), new Vector(412,461)), new Color(185,220,136));
        createPoly(g, new Triangle(new Vector(298,473), new Vector(389,505), new Vector(313,515)), new Color(179,218,127));
        createPoly(g, new Triangle(new Vector(298,473), new Vector(272,544), new Vector(313,515)), new Color(169,211,109));//
        createPoly(g, new Triangle(new Vector(298,473), new Vector(272,544), new Vector(222,481)), new Color(179,218,127));
        createPoly(g, new Triangle(new Vector(298,473), new Vector(255,453), new Vector(222,481)), new Color(194,226,153));
        createPoly(g, new Triangle(new Vector(212,543), new Vector(272,544), new Vector(222,481)), new Color(162,208,99));//
        createPoly(g, new Triangle(new Vector(212,543), new Vector(166,506), new Vector(222,481)), new Color(194,226,153));
        createPoly(g, new Triangle(new Vector(165,456), new Vector(255,453), new Vector(222,481)), new Color(223,239,198)); 
        createPoly(g, new Triangle(new Vector(165,456), new Vector(212,460), new Vector(222,481)), new Color(223,239,198)); 
        createPoly(g, new Triangle(new Vector(165,456), new Vector(166,506), new Vector(222,481)), new Color(214,234,184)); 
        createPoly(g, new Triangle(new Vector(165,456), new Vector(166,506), new Vector(121,460)), new Color(223,239,198)); 
        createPoly(g, new Triangle(new Vector(137,510), new Vector(166,506), new Vector(121,460)), new Color(183,219,132)); 
        createPoly(g, new Triangle(new Vector(137,510), new Vector(166,506), new Vector(121,460)), new Color(207,233,178)); 
        createPoly(g, new Triangle(new Vector(137,510), new Vector(87,465), new Vector(121,460)), new Color(194,226,153)); 
        createPoly(g, new Triangle(new Vector(137,510), new Vector(87,465), new Vector(90,516)), new Color(207,233,178));
        createPoly(g, new Triangle(new Vector(61,545), new Vector(87,465), new Vector(90,516)), new Color(169,211,109));
        createPoly(g, new Triangle(new Vector(61,545), new Vector(87,465), new Vector(41,465)), new Color(223,239,198));
        createPoly(g, new Triangle(new Vector(61,545), new Vector(43,535), new Vector(41,465)), new Color(191,223,146));
        createPoly(g, new Triangle(new Vector(27,523), new Vector(43,535), new Vector(41,465)), new Color(191,223,146));
        createPoly(g, new Triangle(new Vector(27,523), new Vector(0,519), new Vector(41,465)), new Color(185,220,136));
        createPoly(g, new Triangle(new Vector(0,462), new Vector(0,519), new Vector(41,465)), new Color(191,223,146));
        createPoly(g, new Triangle(new Vector(0,559), new Vector(0,519), new Vector(27,523)), new Color(152,203,81));
        createPoly(g, new Triangle(new Vector(0,559), new Vector(43,535), new Vector(27,523)), new Color(152,203,81));
        createPoly(g, new Triangle(new Vector(0,559), new Vector(43,535), new Vector(61,545)), new Color(141,196,66));
        createPoly(g, new Triangle(new Vector(0,559), new Vector(46,568), new Vector(61,545)), new Color(141,196,66));
        createPoly(g, new Triangle(new Vector(114,560), new Vector(46,568), new Vector(61,545)), new Color(152,203,81));
        createPoly(g, new Triangle(new Vector(114,560), new Vector(90,516), new Vector(61,545)), new Color(141,196,66));
        createPoly(g, new Triangle(new Vector(114,560), new Vector(90,516), new Vector(137,510)), new Color(152,203,81));
        createPoly(g, new Triangle(new Vector(114,560), new Vector(148,561), new Vector(137,510)), new Color(164,210,102));
        createPoly(g, new Triangle(new Vector(212,543), new Vector(148,561), new Vector(137,510)), new Color(164,210,102));
        createPoly(g, new Triangle(new Vector(212,543), new Vector(166,506), new Vector(137,510)), new Color(152,203,81));
        createPoly(g, new Triangle(new Vector(212,543), new Vector(148,561), new Vector(242,564)), new Color(141,183,82));
        createPoly(g, new Triangle(new Vector(212,543), new Vector(272,544), new Vector(242,564)), new Color(142,198,63));
        createPoly(g, new Triangle(new Vector(314,569), new Vector(272,544), new Vector(242,564)), new Color(142,184,81));
        createPoly(g, new Triangle(new Vector(314,569), new Vector(272,544), new Vector(313,515)), new Color(142,198,63));
        createPoly(g, new Triangle(new Vector(314,569), new Vector(356,548), new Vector(313,515)), new Color(142,198,63));
        createPoly(g, new Triangle(new Vector(314,569), new Vector(356,548), new Vector(313,515)), new Color(142,198,63));
        createPoly(g, new Triangle(new Vector(389,505), new Vector(356,548), new Vector(313,515)), new Color(160,208,96));
        createPoly(g, new Triangle(new Vector(389,505), new Vector(356,548), new Vector(423,526)), new Color(152,203,81));
        createPoly(g, new Triangle(new Vector(403,560), new Vector(356,548), new Vector(423,526)), new Color(142,198,63));
        createPoly(g, new Triangle(new Vector(403,560), new Vector(356,548), new Vector(314,569)), new Color(160,208,96));
        createPoly(g, new Triangle(new Vector(423,526), new Vector(481,488), new Vector(500,535)), new Color(164,210,102));
        createPoly(g, new Triangle(new Vector(549,514), new Vector(481,488), new Vector(500,535)), new Color(152,203,81));
        createPoly(g, new Triangle(new Vector(549,514), new Vector(536,548), new Vector(500,535)), new Color(141,183,82));
        createPoly(g, new Triangle(new Vector(549,514), new Vector(536,548), new Vector(599,534)), new Color(142,198,63));
        createPoly(g, new Triangle(new Vector(599,559), new Vector(536,548), new Vector(599,534)), new Color(160,208,96));
        createPoly(g, new Triangle(new Vector(599,559), new Vector(536,548), new Vector(475,565)), new Color(160,208,96));
        createPoly(g, new Triangle(new Vector(500,535), new Vector(536,548), new Vector(475,565)), new Color(160,208,96));
        createPoly(g, new Triangle(new Vector(500,535), new Vector(423,526), new Vector(475,565)), new Color(142,198,63));
        createPoly(g, new Triangle(new Vector(403,560), new Vector(423,526), new Vector(475,565)), new Color(141,183,82));
 
        //fuji
        createPoly(g, new Triangle(new Vector(275,303), new Vector(246,318), new Vector(255,322)), new Color(156, 164, 170));
        createPoly(g, new Triangle(new Vector(247,318), new Vector(210,339), new Vector(255,322)), new Color(137, 131, 160));
        createPoly(g, new Triangle(new Vector(275,303), new Vector(284,303), new Vector(273,317)), new Color(242, 227, 211));
        createPoly(g, new Triangle(new Vector(275,303), new Vector(255,322), new Vector(273,317)), new Color(242, 228, 224));
        createPoly(g, new Triangle(new Vector(284,303), new Vector(291,303), new Vector(285,312)), new Color(242, 228, 224));
        createPoly(g, new Triangle(new Vector(284,303), new Vector(273,317), new Vector(285,312)), new Color(177, 152, 122));
        createPoly(g, new Triangle(new Vector(291,303), new Vector(301,303), new Vector(297,310)), new Color(239, 212, 133));
        createPoly(g, new Triangle(new Vector(291,303), new Vector(285,312), new Vector(297,310)), new Color(253, 252, 244));
        createPoly(g, new Triangle(new Vector(285,312), new Vector(290,321), new Vector(297,310)), new Color(242, 227, 211));
        createPoly(g, new Triangle(new Vector(285,312), new Vector(290,321), new Vector(280,320)), new Color(239, 212, 133));
        createPoly(g, new Triangle(new Vector(285,312), new Vector(273,317), new Vector(280,320)), new Color(242, 228, 224));
        createPoly(g, new Triangle(new Vector(301,303), new Vector(312,303), new Vector(311,310)), new Color(243, 236, 225));
        createPoly(g, new Triangle(new Vector(301,303), new Vector(297,310), new Vector(311,310)), new Color(253, 252, 244));
        createPoly(g, new Triangle(new Vector(350,321), new Vector(322,303), new Vector(325,313)), new Color(251, 250, 216));
        createPoly(g, new Triangle(new Vector(312,303), new Vector(311,310), new Vector(325,313)), new Color(253, 252, 244));
        createPoly(g, new Triangle(new Vector(332,330), new Vector(311,310), new Vector(325,313)), new Color(242, 228, 224));
        createPoly(g, new Triangle(new Vector(297,310), new Vector(311,310), new Vector(306,329)), new Color(251, 250, 216));
        createPoly(g, new Triangle(new Vector(297,310), new Vector(290,321), new Vector(306,329)), new Color(253, 252, 244));
        createPoly(g, new Triangle(new Vector(332,330), new Vector(325,313), new Vector(357,337)), new Color(250, 249, 221));//
        createPoly(g, new Triangle(new Vector(332,330), new Vector(311,310), new Vector(317,328)), new Color(251, 250, 216));
        createPoly(g, new Triangle(new Vector(306,329), new Vector(311,310), new Vector(317,328)), new Color(243, 236, 225));
        createPoly(g, new Triangle(new Vector(350,321), new Vector(357,337), new Vector(402,353)), new Color(243, 236, 225));
        createPoly(g, new Triangle(new Vector(255,322), new Vector(273,317), new Vector(252,332)), new Color(177, 152, 122));
        createPoly(g, new Triangle(new Vector(210,339), new Vector(255,322), new Vector(218,351)), new Color(170, 153, 173));
        createPoly(g, new Triangle(new Vector(252,332), new Vector(255,322), new Vector(218,351)), new Color(137, 131, 160));
        createPoly(g, new Triangle(new Vector(280,320), new Vector(290,321), new Vector(268,335)), new Color(243, 236, 225));
        createPoly(g, new Triangle(new Vector(268,335), new Vector(290,321), new Vector(290,340)), new Color(239, 212, 133));
        createPoly(g, new Triangle(new Vector(306,329), new Vector(290,321), new Vector(290,340)), new Color(251, 250, 216));
        createPoly(g, new Triangle(new Vector(252,332), new Vector(273,317), new Vector(280,320)), new Color(243, 236, 225));
        createPoly(g, new Triangle(new Vector(252,332), new Vector(268,335), new Vector(280,320)), new Color(251, 250, 216));
        createPoly(g, new Triangle(new Vector(306,329), new Vector(290,340), new Vector(314,350)), new Color(239, 212, 133));
        createPoly(g, new Triangle(new Vector(306,329), new Vector(317,328), new Vector(314,350)), new Color(253, 252, 244));
        createPoly(g, new Triangle(new Vector(348,357), new Vector(317,328), new Vector(314,350)), new Color(251, 250, 216));
        createPoly(g, new Triangle(new Vector(348,357), new Vector(317,328), new Vector(332,330)), new Color(253, 252, 244));
        createPoly(g, new Triangle(new Vector(348,357), new Vector(357,337), new Vector(332,330)), new Color(251, 250, 216));
        createPoly(g, new Triangle(new Vector(252,332), new Vector(218,351), new Vector(246,365)), new Color(158, 147, 171));
        createPoly(g, new Triangle(new Vector(252,332), new Vector(268,335), new Vector(246,365)), new Color(137, 131, 160));
        createPoly(g, new Triangle(new Vector(276,358), new Vector(268,335), new Vector(246,365)), new Color(128, 106, 123));
        createPoly(g, new Triangle(new Vector(276,358), new Vector(268,335), new Vector(290,340)), new Color(187, 164, 159));
        createPoly(g, new Triangle(new Vector(314,350), new Vector(290,340), new Vector(294,384)), new Color(124, 104, 115));
        createPoly(g, new Triangle(new Vector(314,350), new Vector(336,377), new Vector(294,384)), new Color(164, 140, 151));
        createPoly(g, new Triangle(new Vector(314,350), new Vector(336,377), new Vector(348,357)), new Color(163, 134, 140));
        createPoly(g, new Triangle(new Vector(348,357), new Vector(357,337), new Vector(375,359)), new Color(164, 140, 151));
        createPoly(g, new Triangle(new Vector(402,353), new Vector(357,337), new Vector(375,359)), new Color(251, 250, 216));
        createPoly(g, new Triangle(new Vector(402,353), new Vector(413,381), new Vector(375,359)), new Color(230, 201, 200));
        createPoly(g, new Triangle(new Vector(336,377), new Vector(348,357), new Vector(367,384)), new Color(115, 106, 125));
        createPoly(g, new Triangle(new Vector(375,359), new Vector(348,357), new Vector(367,384)), new Color(110, 102, 113));
        createPoly(g, new Triangle(new Vector(413,381), new Vector(402,353), new Vector(443,384)), new Color(110, 102, 113));
        createPoly(g, new Triangle(new Vector(484,392), new Vector(402,353), new Vector(443,384)), new Color(127, 111, 127));
        createPoly(g, new Triangle(new Vector(484,392), new Vector(471,412), new Vector(443,384)), new Color(115, 106, 125));
        createPoly(g, new Triangle(new Vector(294,384), new Vector(336,377), new Vector(331,403)), new Color(95, 92, 113));
        createPoly(g, new Triangle(new Vector(367,384), new Vector(336,377), new Vector(331,403)), new Color(101, 94, 111));
        createPoly(g, new Triangle(new Vector(367,384), new Vector(355,419), new Vector(331,403)), new Color(86, 83, 104));
        createPoly(g, new Triangle(new Vector(367,384), new Vector(375,359), new Vector(396,391)), new Color(156, 164, 170));
        createPoly(g, new Triangle(new Vector(413,381), new Vector(375,359), new Vector(396,391)), new Color(153, 133, 144));
        createPoly(g, new Triangle(new Vector(367,384), new Vector(355,419), new Vector(396,391)), new Color(106, 97, 116));
        createPoly(g, new Triangle(new Vector(394,440), new Vector(355,419), new Vector(396,391)), new Color(80, 77, 90)); //v
        createPoly(g, new Triangle(new Vector(394,440), new Vector(396,391), new Vector(438,440)), new Color(92, 80, 92)); //-
        createPoly(g, new Triangle(new Vector(413,381), new Vector(396,391), new Vector(425,408)), new Color(92, 80, 92));
        createPoly(g, new Triangle(new Vector(438,440), new Vector(396,391), new Vector(425,408)), new Color(107, 99, 120)); //v
        createPoly(g, new Triangle(new Vector(413,381), new Vector(443,384), new Vector(425,408)), new Color(134, 110, 124));
        createPoly(g, new Triangle(new Vector(471,412), new Vector(443,384), new Vector(425,408)), new Color(148, 130, 142));
        createPoly(g, new Triangle(new Vector(471,412), new Vector(495,440), new Vector(425,408)), new Color(111, 110, 114)); //v
        createPoly(g, new Triangle(new Vector(438,440), new Vector(495,440), new Vector(425,408)), new Color(100, 85, 92)); //-
        createPoly(g, new Triangle(new Vector(471,412), new Vector(484,392), new Vector(515,401)), new Color(129, 111, 125));
        createPoly(g, new Triangle(new Vector(471,412), new Vector(495,440), new Vector(515,401)), new Color(94, 84, 93)); //v
        createPoly(g, new Triangle(new Vector(568,416), new Vector(495,440), new Vector(515,401)), new Color(121, 105, 118)); //v
        createPoly(g, new Triangle(new Vector(568,416), new Vector(495,440), new Vector(560,440)), new Color(103, 90, 99)); //-
        createPoly(g, new Triangle(new Vector(599,423), new Vector(568,416), new Vector(560,440)), new Color(131, 108, 114)); //v
        createPoly(g, new Triangle(new Vector(599,423), new Vector(599,440), new Vector(560,440)), new Color(98, 85, 87)); //v
        createPoly(g, new Triangle(new Vector(294,384), new Vector(331,403), new Vector(312,440)), new Color(84, 81, 102)); //v
        createPoly(g, new Triangle(new Vector(312,440), new Vector(331,403), new Vector(355,419)), new Color(86, 89, 104)); //v
        createPoly(g, new Triangle(new Vector(312,440), new Vector(394,440), new Vector(355,419)), new Color(84, 80, 99)); //-
        createPoly(g, new Triangle(new Vector(290,340), new Vector(276,358), new Vector(294,384)), new Color(123, 109, 126));
        createPoly(g, new Triangle(new Vector(246,365), new Vector(276,358), new Vector(265,379)), new Color(95, 91, 118));
        createPoly(g, new Triangle(new Vector(294,384), new Vector(276,358), new Vector(265,379)), new Color(117, 105, 125));
        createPoly(g, new Triangle(new Vector(294,384), new Vector(286,409), new Vector(265,379)), new Color(91, 98, 111));
        createPoly(g, new Triangle(new Vector(294,384), new Vector(286,409), new Vector(312,440)), new Color(77, 75, 96)); //v
        createPoly(g, new Triangle(new Vector(279,440), new Vector(286,409), new Vector(312,440)), new Color(83, 80, 101)); //-
        createPoly(g, new Triangle(new Vector(265,379), new Vector(286,409), new Vector(252,405)), new Color(89, 83, 107));
        createPoly(g, new Triangle(new Vector(279,440), new Vector(286,409), new Vector(252,405)), new Color(80, 77, 100)); //v
        createPoly(g, new Triangle(new Vector(279,440), new Vector(241,440), new Vector(252,405)), new Color(75, 73, 94)); //-
        createPoly(g, new Triangle(new Vector(246,365), new Vector(265,379), new Vector(252,405)), new Color(125, 110, 128));
        createPoly(g, new Triangle(new Vector(246,365), new Vector(218,351), new Vector(210,371)), new Color(137, 132, 161));
        createPoly(g, new Triangle(new Vector(246,365), new Vector(231,388), new Vector(210,371)), new Color(105, 97, 121));
        createPoly(g, new Triangle(new Vector(246,365), new Vector(231,388), new Vector(252,405)), new Color(100, 94, 99));
        createPoly(g, new Triangle(new Vector(221,415), new Vector(231,388), new Vector(252,405)), new Color(95, 90, 125));
        createPoly(g, new Triangle(new Vector(221,415), new Vector(241,440), new Vector(252,405)), new Color(78, 76, 100)); //v
        createPoly(g, new Triangle(new Vector(221,415), new Vector(241,440), new Vector(199,440)), new Color(75, 73, 94)); //-
        createPoly(g, new Triangle(new Vector(221,415), new Vector(231,388), new Vector(202,402)), new Color(96, 91, 113));
        createPoly(g, new Triangle(new Vector(221,415), new Vector(199,440), new Vector(202,402)), new Color(78, 79, 100)); //v
        createPoly(g, new Triangle(new Vector(210,371), new Vector(231,388), new Vector(202,402)), new Color(112, 103, 112));
        createPoly(g, new Triangle(new Vector(210,371), new Vector(218,351), new Vector(193,358)), new Color(120, 105, 146));
        createPoly(g, new Triangle(new Vector(210,339), new Vector(218,351), new Vector(193,358)), new Color(108, 102, 123));
        createPoly(g, new Triangle(new Vector(210,339), new Vector(157,362), new Vector(193,358)), new Color(90, 101, 133));
        createPoly(g, new Triangle(new Vector(178,381), new Vector(157,362), new Vector(193,358)), new Color(112, 108, 135));
        createPoly(g, new Triangle(new Vector(178,381), new Vector(210,371), new Vector(193,358)), new Color(87, 86, 114));
        createPoly(g, new Triangle(new Vector(178,381), new Vector(210,371), new Vector(202,402)), new Color(95, 91, 113));
        createPoly(g, new Triangle(new Vector(178,381), new Vector(177,405), new Vector(202,402)), new Color(106, 94, 110));
        createPoly(g, new Triangle(new Vector(199,440), new Vector(177,405), new Vector(202,402)), new Color(97, 87, 111)); //v
        createPoly(g, new Triangle(new Vector(157,362), new Vector(178,381), new Vector(150,385)), new Color(102, 100, 124)); 
        createPoly(g, new Triangle(new Vector(177,405), new Vector(178,381), new Vector(150,385)), new Color(90, 86, 109)); 
        createPoly(g, new Triangle(new Vector(119,377), new Vector(157,362), new Vector(150,385)), new Color(107, 90, 125)); 
        createPoly(g, new Triangle(new Vector(119,377), new Vector(120,398), new Vector(150,385)), new Color(92, 82, 106)); 
        createPoly(g, new Triangle(new Vector(150,407), new Vector(120,398), new Vector(150,385)), new Color(102, 94, 115)); 
        createPoly(g, new Triangle(new Vector(150,407), new Vector(177,405), new Vector(150,385)), new Color(103, 82, 117));
        createPoly(g, new Triangle(new Vector(150,407), new Vector(177,405), new Vector(199,440)), new Color(89, 86, 107)); //v
        createPoly(g, new Triangle(new Vector(150,407), new Vector(199,440), new Vector(143,440)), new Color(84, 80, 100)); //-
        createPoly(g, new Triangle(new Vector(150,407), new Vector(120,398), new Vector(113,422)), new Color(82, 84, 107));
        createPoly(g, new Triangle(new Vector(150,407), new Vector(143,440), new Vector(113,422)), new Color(77,73 , 97)); //v
        createPoly(g, new Triangle(new Vector(91,440), new Vector(143,440), new Vector(113,422)), new Color(81, 78, 87)); //-
        createPoly(g, new Triangle(new Vector(119,377), new Vector(120,398), new Vector(74,392)), new Color(114, 100, 117));
        createPoly(g, new Triangle(new Vector(113,422), new Vector(120,398), new Vector(74,392)), new Color(100, 88, 100));
        createPoly(g, new Triangle(new Vector(113,422), new Vector(75,416), new Vector(74,392)), new Color(81, 78, 87));
        createPoly(g, new Triangle(new Vector(113,422), new Vector(75,416), new Vector(91,440)), new Color(87, 65, 80)); //v
        createPoly(g, new Triangle(new Vector(38,403), new Vector(75,416), new Vector(74,392)), new Color(101, 86, 103));
        createPoly(g, new Triangle(new Vector(38,403), new Vector(75,416), new Vector(30,425)), new Color(111, 94, 111));
        createPoly(g, new Triangle(new Vector(51,440), new Vector(75,416), new Vector(91,440)), new Color(84, 80, 80)); //- 
        createPoly(g, new Triangle(new Vector(51,440), new Vector(75,416), new Vector(30,425)), new Color(78, 71, 85)); //v
        createPoly(g, new Triangle(new Vector(0,413), new Vector(38,403), new Vector(30,425)), new Color(99, 85, 100));
        createPoly(g, new Triangle(new Vector(51,440), new Vector(0,440), new Vector(30,425)), new Color(75, 62, 76)); //-
        createPoly(g, new Triangle(new Vector(0,413), new Vector(0,440), new Vector(30,425)), new Color(101, 81, 92)); //v
 
        //balloon
        createPoly(g, new Triangle(new Vector(64,20), new Vector(83,19), new Vector(73,26)), new Color(163, 66, 103));
        createPoly(g, new Triangle(new Vector(46,31), new Vector(64,20), new Vector(60,30)), new Color(133, 57, 115));
        createPoly(g, new Triangle(new Vector(64,20), new Vector(60,30), new Vector(73,26)), new Color(92, 34, 94));
        createPoly(g, new Triangle(new Vector(82,35), new Vector(83,19), new Vector(73,26)), new Color(129, 41, 92));
        createPoly(g, new Triangle(new Vector(82,35), new Vector(83,19), new Vector(90,23)), new Color(172, 108, 118));
        createPoly(g, new Triangle(new Vector(101,22), new Vector(83,19), new Vector(90,23)), new Color(127, 73, 111));
        createPoly(g, new Triangle(new Vector(101,22), new Vector(99,30), new Vector(90,23)), new Color(179, 133, 128));
        createPoly(g, new Triangle(new Vector(95,37), new Vector(99,30), new Vector(90,23)), new Color(155, 97, 104));
        createPoly(g, new Triangle(new Vector(95,37), new Vector(82,35), new Vector(90,23)), new Color(212, 86, 90));
        createPoly(g, new Triangle(new Vector(101,22), new Vector(99,30), new Vector(109,32)), new Color(194, 120, 132));
        createPoly(g, new Triangle(new Vector(101,22), new Vector(117,32), new Vector(109,32)), new Color(167, 150, 145));
        createPoly(g, new Triangle(new Vector(108,38), new Vector(99,30), new Vector(109,32)), new Color(221, 116, 93));
        createPoly(g, new Triangle(new Vector(108,38), new Vector(99,30), new Vector(95,37)), new Color(207, 160, 123));
        createPoly(g, new Triangle(new Vector(108,38), new Vector(117,32), new Vector(109,32)), new Color(140, 96, 102));
        createPoly(g, new Triangle(new Vector(108,38), new Vector(117,32), new Vector(124,45)), new Color(207, 190, 140));
        createPoly(g, new Triangle(new Vector(108,38), new Vector(117,54), new Vector(124,45)), new Color(231, 201, 135));
        createPoly(g, new Triangle(new Vector(124,58), new Vector(117,54), new Vector(124,45)), new Color(218, 217, 152));
        createPoly(g, new Triangle(new Vector(108,38), new Vector(117,54), new Vector(99,56)), new Color(244, 127, 81));
        createPoly(g, new Triangle(new Vector(86,46), new Vector(95,37), new Vector(99,56)), new Color(223, 134, 111));
        createPoly(g, new Triangle(new Vector(108,38), new Vector(95,37), new Vector(99,56)), new Color(225, 147, 108));
        createPoly(g, new Triangle(new Vector(86,46), new Vector(95,37), new Vector(99,56)), new Color(174, 112, 102));
        createPoly(g, new Triangle(new Vector(86,46), new Vector(95,37), new Vector(82,35)), new Color(224, 133, 111));
        createPoly(g, new Triangle(new Vector(86,46), new Vector(69,43), new Vector(82,35)), new Color(176, 105, 110));
        createPoly(g, new Triangle(new Vector(73,26), new Vector(69,43), new Vector(82,35)), new Color(165, 54, 88));
        createPoly(g, new Triangle(new Vector(73,26), new Vector(69,43), new Vector(60,30)), new Color(172, 69, 104));
        createPoly(g, new Triangle(new Vector(59,44), new Vector(69,43), new Vector(60,30)), new Color(122, 51, 106));
        createPoly(g, new Triangle(new Vector(59,44), new Vector(49,40), new Vector(60,30)), new Color(135, 42, 95));
        createPoly(g, new Triangle(new Vector(46,31), new Vector(49,40), new Vector(60,30)), new Color(121, 84, 134));
        createPoly(g, new Triangle(new Vector(46,31), new Vector(49,40), new Vector(41,49)), new Color(129, 41, 109));
        createPoly(g, new Triangle(new Vector(59,44), new Vector(49,40), new Vector(50,59)), new Color(145, 78, 124));
        createPoly(g, new Triangle(new Vector(41,49), new Vector(49,40), new Vector(50,59)), new Color(101, 34, 103));
        createPoly(g, new Triangle(new Vector(67,51), new Vector(59,44), new Vector(50,59)), new Color(87, 33, 92));
        createPoly(g, new Triangle(new Vector(67,51), new Vector(59,44), new Vector(69,43)), new Color(174, 51, 95));
        createPoly(g, new Triangle(new Vector(67,51), new Vector(86,46), new Vector(69,43)), new Color(157, 92, 103));
        createPoly(g, new Triangle(new Vector(67,51), new Vector(86,46), new Vector(68,67)), new Color(152, 80, 112));
        createPoly(g, new Triangle(new Vector(67,51), new Vector(50,59), new Vector(68,67)), new Color(124, 57, 101));
        createPoly(g, new Triangle(new Vector(56,69), new Vector(50,59), new Vector(68,67)), new Color(160, 30, 80));
        createPoly(g, new Triangle(new Vector(56,69), new Vector(50,59), new Vector(45,68)), new Color(94, 29, 91));
        createPoly(g, new Triangle(new Vector(41,49), new Vector(50,59), new Vector(45,68)), new Color(120, 48, 107));
        createPoly(g, new Triangle(new Vector(91,74), new Vector(86,46), new Vector(68,67)), new Color(190, 107, 97));
        createPoly(g, new Triangle(new Vector(91,74), new Vector(86,46), new Vector(98,70)), new Color(160, 109, 99));
        createPoly(g, new Triangle(new Vector(99,56), new Vector(86,46), new Vector(98,70)), new Color(188, 90, 87));
        createPoly(g, new Triangle(new Vector(99,56), new Vector(104,68), new Vector(98,70)), new Color(220, 82, 63));
        createPoly(g, new Triangle(new Vector(99,56), new Vector(104,68), new Vector(116,65)), new Color(170, 118, 84));
        createPoly(g, new Triangle(new Vector(99,56), new Vector(117,54), new Vector(116,65)), new Color(211, 183, 115));
        createPoly(g, new Triangle(new Vector(124,58), new Vector(117,54), new Vector(116,65)), new Color(190, 174, 119));
        createPoly(g, new Triangle(new Vector(124,58), new Vector(117,72), new Vector(116,65)), new Color(240, 168, 91));
        createPoly(g, new Triangle(new Vector(111,71), new Vector(117,72), new Vector(116,65)), new Color(190, 144, 95));
        createPoly(g, new Triangle(new Vector(111,71), new Vector(104,68), new Vector(116,65)), new Color(216, 128, 77));
        createPoly(g, new Triangle(new Vector(111,71), new Vector(104,87), new Vector(117,72)), new Color(216, 128, 77));
        createPoly(g, new Triangle(new Vector(111,71), new Vector(104,68), new Vector(104,87)), new Color(186, 98, 76));
        createPoly(g, new Triangle(new Vector(94,87), new Vector(91,74), new Vector(98,70)), new Color(213, 143, 22));
        createPoly(g, new Triangle(new Vector(94,87), new Vector(104,68), new Vector(98,70)), new Color(213, 143, 22));
        createPoly(g, new Triangle(new Vector(94,87), new Vector(104,68), new Vector(104,87)), new Color(160, 133, 98));
        createPoly(g, new Triangle(new Vector(94,87), new Vector(68,67), new Vector(91,74)), new Color(164, 68, 99));
        createPoly(g, new Triangle(new Vector(94,87), new Vector(68,67), new Vector(65,88)), new Color(127, 77, 124));
        createPoly(g, new Triangle(new Vector(56,69), new Vector(68,67), new Vector(65,88)), new Color(87, 32, 91));
        createPoly(g, new Triangle(new Vector(56,69), new Vector(54,84), new Vector(65,88)), new Color(89, 35, 120));
        createPoly(g, new Triangle(new Vector(56,69), new Vector(54,84), new Vector(45,68)), new Color(98, 48, 103));
        createPoly(g, new Triangle(new Vector(72,109), new Vector(54,84), new Vector(65,88)), new Color(72, 32, 94));
        createPoly(g, new Triangle(new Vector(79,99), new Vector(91,74), new Vector(65,88)), new Color(101, 40, 92));
        createPoly(g, new Triangle(new Vector(79,99), new Vector(72,109), new Vector(65,88)), new Color(120, 50, 105));
        createPoly(g, new Triangle(new Vector(79,99), new Vector(72,109), new Vector(84,109)), new Color(80, 34, 86));
        createPoly(g, new Triangle(new Vector(79,99), new Vector(94,87), new Vector(84,109)), new Color(114, 68, 95));
        createPoly(g, new Triangle(new Vector(79,99), new Vector(94,87), new Vector(91,74)), new Color(100, 63, 90));
        createPoly(g, new Triangle(new Vector(104,87), new Vector(94,87), new Vector(84,109)), new Color(144, 87, 90));
        createPoly(g, new Triangle(new Vector(72,109), new Vector(71,125), new Vector(72,125)), new Color(108, 134, 161));
        createPoly(g, new Triangle(new Vector(72,109), new Vector(73,109), new Vector(72,125)), new Color(108, 134, 161));
        createPoly(g, new Triangle(new Vector(83,109), new Vector(83,125), new Vector(84,109)), new Color(108, 134, 161));
        createPoly(g, new Triangle(new Vector(83,109), new Vector(83,125), new Vector(82,125)), new Color(108, 134, 161));
        createPoly(g, new Triangle(new Vector(82,118), new Vector(81,125), new Vector(73,118)), new Color(198, 61, 105));
        createPoly(g, new Triangle(new Vector(73,125), new Vector(81,125), new Vector(73,118)), new Color(122, 64, 104));
        createPoly(g, new Triangle(new Vector(74,114), new Vector(74,117), new Vector(76,117)), new Color( 7, 3, 7));
        createPoly(g, new Triangle(new Vector(74,114), new Vector(76,114), new Vector(76,117)), new Color( 7, 3, 7));
        createPoly(g, new Triangle(new Vector(79,115), new Vector(79,117), new Vector(81,117)), new Color( 7, 3, 7));
        createPoly(g, new Triangle(new Vector(79,115), new Vector(81,115), new Vector(81,117)), new Color( 7, 3, 7));

        //Eiffel Tower
        int x_tower = 40;
        createPoly(g, new Triangle(new Vector(x_tower+274,440), new Vector(x_tower+312,440), new Vector(x_tower+318,431)), new Color(187, 199, 195)); //-
        createPoly(g, new Triangle(new Vector(x_tower+335,440), new Vector(x_tower+312,440), new Vector(x_tower+318,431)), new Color(74, 70, 101)); //-
        createPoly(g, new Triangle(new Vector(x_tower+341,426), new Vector(x_tower+335,440), new Vector(x_tower+318,431)), new Color(101,99, 123));
        createPoly(g, new Triangle(new Vector(x_tower+274,440), new Vector(x_tower+293,415), new Vector(x_tower+318,431)), new Color(210, 219, 216));
        createPoly(g, new Triangle(new Vector(x_tower+328,415), new Vector(x_tower+293,415), new Vector(x_tower+318,431)), new Color(63, 61, 92));
        createPoly(g, new Triangle(new Vector(x_tower+328,415), new Vector(x_tower+341,426), new Vector(x_tower+318,431)), new Color(209, 220, 216));
        createPoly(g, new Triangle(new Vector(x_tower+328,415), new Vector(x_tower+341,426), new Vector(x_tower+347,415)), new Color(180, 212, 207));
        createPoly(g, new Triangle(new Vector(x_tower+328,415), new Vector(x_tower+342,405), new Vector(x_tower+347,415)), new Color(209, 220, 216));
        createPoly(g, new Triangle(new Vector(x_tower+328,415), new Vector(x_tower+293,415), new Vector(x_tower+306,397)), new Color(101,99, 123));
        createPoly(g, new Triangle(new Vector(x_tower+328,415), new Vector(x_tower+341,405), new Vector(x_tower+306,397)), new Color(74, 70, 101));
        createPoly(g, new Triangle(new Vector(x_tower+321,376), new Vector(x_tower+341,405), new Vector(x_tower+306,397)), new Color(90,99, 123));
        createPoly(g, new Triangle(new Vector(x_tower+352,407), new Vector(x_tower+341,405), new Vector(x_tower+347,415)), new Color(86,66, 97));
        createPoly(g, new Triangle(new Vector(x_tower+352,407), new Vector(x_tower+341,405), new Vector(x_tower+346,388)), new Color(202,214, 210));
        createPoly(g, new Triangle(new Vector(x_tower+321,376), new Vector(x_tower+341,405), new Vector(x_tower+346,388)), new Color(210, 219, 216));
        createPoly(g, new Triangle(new Vector(x_tower+352,407), new Vector(x_tower+357,401), new Vector(x_tower+346,388)), new Color(65, 64, 94));
        createPoly(g, new Triangle(new Vector(x_tower+363,396), new Vector(x_tower+357,401), new Vector(x_tower+346,388)), new Color(83, 130, 141));
        createPoly(g, new Triangle(new Vector(x_tower+363,396), new Vector(x_tower+354,379), new Vector(x_tower+346,388)), new Color(66, 63, 93));
        createPoly(g, new Triangle(new Vector(x_tower+321,376), new Vector(x_tower+330,364), new Vector(x_tower+346,388)), new Color(99, 97, 122));
        createPoly(g, new Triangle(new Vector(x_tower+330,364), new Vector(x_tower+337,353), new Vector(x_tower+346,388)), new Color(64, 61, 92));
        createPoly(g, new Triangle(new Vector(x_tower+354,379), new Vector(x_tower+337,353), new Vector(x_tower+346,388)), new Color(210, 219, 216));
        createPoly(g, new Triangle(new Vector(x_tower+354,379), new Vector(x_tower+337,353), new Vector(x_tower+360,364)), new Color(91,120,134));
        createPoly(g, new Triangle(new Vector(x_tower+354,379), new Vector(x_tower+363,396), new Vector(x_tower+360,364)), new Color(50,120,134));
        createPoly(g, new Triangle(new Vector(x_tower+376,388), new Vector(x_tower+360,378), new Vector(x_tower+360,364)), new Color(210, 219, 216));
        createPoly(g, new Triangle(new Vector(x_tower+376,388), new Vector(x_tower+360,378), new Vector(x_tower+363,396)), new Color(68, 65, 95));
        createPoly(g, new Triangle(new Vector(x_tower+376,388), new Vector(x_tower+360,364), new Vector(x_tower+366,347)), new Color(93, 124, 141));
        createPoly(g, new Triangle(new Vector(x_tower+337,331), new Vector(x_tower+360,364), new Vector(x_tower+366,347)), new Color(59, 55, 90));
        createPoly(g, new Triangle(new Vector(x_tower+337,331), new Vector(x_tower+360,364), new Vector(x_tower+337,353)), new Color(202,214, 210));
        createPoly(g, new Triangle(new Vector(x_tower+366,347), new Vector(x_tower+376,388), new Vector(x_tower+384,357)), new Color(210, 219, 216));
        createPoly(g, new Triangle(new Vector(x_tower+389,386), new Vector(x_tower+376,388), new Vector(x_tower+384,357)), new Color(62, 58, 92));
        createPoly(g, new Triangle(new Vector(x_tower+389,386), new Vector(x_tower+395,357), new Vector(x_tower+384,357)), new Color(79, 115, 129));
        createPoly(g, new Triangle(new Vector(x_tower+390,331), new Vector(x_tower+395,357), new Vector(x_tower+384,357)), new Color(87, 81, 110));
        createPoly(g, new Triangle(new Vector(x_tower+390,331), new Vector(x_tower+366,347), new Vector(x_tower+384,357)), new Color(67, 67, 96));
        createPoly(g, new Triangle(new Vector(x_tower+390,331), new Vector(x_tower+366,347), new Vector(x_tower+369,331)), new Color(83, 77, 106));
        createPoly(g, new Triangle(new Vector(x_tower+337,331), new Vector(x_tower+366,347), new Vector(x_tower+369,331)), new Color(97, 124, 138));
        createPoly(g, new Triangle(new Vector(x_tower+389,386), new Vector(x_tower+395,357), new Vector(x_tower+401,388)), new Color(157, 178, 170));
        createPoly(g, new Triangle(new Vector(x_tower+406,347), new Vector(x_tower+395,357), new Vector(x_tower+401,388)), new Color(90, 120, 134));
        createPoly(g, new Triangle(new Vector(x_tower+390,331), new Vector(x_tower+395,357), new Vector(x_tower+406,347)), new Color(67, 62, 94));
        createPoly(g, new Triangle(new Vector(x_tower+420,361), new Vector(x_tower+401,388), new Vector(x_tower+406,347)), new Color(81, 114, 131));
        createPoly(g, new Triangle(new Vector(x_tower+420,361), new Vector(x_tower+401,388), new Vector(x_tower+425,378)), new Color(97, 131, 144));//
        createPoly(g, new Triangle(new Vector(x_tower+420,361), new Vector(x_tower+441,341), new Vector(x_tower+425,378)), new Color(81, 114, 131));
        createPoly(g, new Triangle(new Vector(x_tower+420,361), new Vector(x_tower+441,331), new Vector(x_tower+406,347)), new Color(66, 65, 96));
        createPoly(g, new Triangle(new Vector(x_tower+430,331), new Vector(x_tower+441,331), new Vector(x_tower+406,347)), new Color(83, 115, 134));
        createPoly(g, new Triangle(new Vector(x_tower+430,331), new Vector(x_tower+419,331), new Vector(x_tower+406,347)), new Color(102, 99, 124));
        createPoly(g, new Triangle(new Vector(x_tower+411,331), new Vector(x_tower+419,331), new Vector(x_tower+406,347)), new Color(81, 116, 130));
        createPoly(g, new Triangle(new Vector(x_tower+411,331), new Vector(x_tower+390,331), new Vector(x_tower+406,347)), new Color(108, 134, 149));
        createPoly(g, new Triangle(new Vector(x_tower+420,361), new Vector(x_tower+425,378), new Vector(x_tower+441,331)), new Color(83, 125, 140));
        createPoly(g, new Triangle(new Vector(x_tower+441,353), new Vector(x_tower+425,378), new Vector(x_tower+441,331)), new Color(95, 92, 119));
        createPoly(g, new Triangle(new Vector(x_tower+401,388), new Vector(x_tower+425,378), new Vector(x_tower+414,395)), new Color(67, 59, 94));
        createPoly(g, new Triangle(new Vector(x_tower+431,387), new Vector(x_tower+425,378), new Vector(x_tower+414,395)), new Color(94, 92, 119));
        createPoly(g, new Triangle(new Vector(x_tower+431,387), new Vector(x_tower+425,378), new Vector(x_tower+441,353)), new Color(226, 236, 232));
        createPoly(g, new Triangle(new Vector(x_tower+431,387), new Vector(x_tower+426,407), new Vector(x_tower+414,395)), new Color(67, 59, 94));
        createPoly(g, new Triangle(new Vector(x_tower+431,387), new Vector(x_tower+456,375), new Vector(x_tower+441,353)), new Color(191, 208, 202));
        createPoly(g, new Triangle(new Vector(x_tower+431,387), new Vector(x_tower+456,375), new Vector(x_tower+438,403)), new Color(226, 236, 232));
        createPoly(g, new Triangle(new Vector(x_tower+471,395), new Vector(x_tower+456,375), new Vector(x_tower+438,403)), new Color(84, 117, 134));
        createPoly(g, new Triangle(new Vector(x_tower+431,387), new Vector(x_tower+426,407), new Vector(x_tower+414,395)), new Color(96, 125, 139));
        createPoly(g, new Triangle(new Vector(x_tower+431,387), new Vector(x_tower+426,407), new Vector(x_tower+438,403)), new Color(191, 208, 202));
        createPoly(g, new Triangle(new Vector(x_tower+471,395), new Vector(x_tower+449,414), new Vector(x_tower+438,403)), new Color(227, 232, 233));
        createPoly(g, new Triangle(new Vector(x_tower+431,414), new Vector(x_tower+449,414), new Vector(x_tower+438,403)), new Color(66, 64, 96));
        createPoly(g, new Triangle(new Vector(x_tower+431,414), new Vector(x_tower+449,414), new Vector(x_tower+438,426)), new Color(192, 206, 200));
        createPoly(g, new Triangle(new Vector(x_tower+460,431), new Vector(x_tower+449,414), new Vector(x_tower+438,426)), new Color(66, 64, 96));
        createPoly(g, new Triangle(new Vector(x_tower+460,431), new Vector(x_tower+443,440), new Vector(x_tower+438,426)), new Color(194, 213, 207));
        createPoly(g, new Triangle(new Vector(x_tower+460,431), new Vector(x_tower+443,440), new Vector(x_tower+503,440)), new Color(171, 185, 180)); //-
        createPoly(g, new Triangle(new Vector(x_tower+460,431), new Vector(x_tower+484,414), new Vector(x_tower+503,440)), new Color(192, 207, 202)); 
        createPoly(g, new Triangle(new Vector(x_tower+460,431), new Vector(x_tower+484,414), new Vector(x_tower+449,414)), new Color(95, 92, 122));
        createPoly(g, new Triangle(new Vector(x_tower+471,395), new Vector(x_tower+484,414), new Vector(x_tower+449,414)), new Color(193, 209, 204));
        createPoly(g, new Triangle(new Vector(x_tower+348,331), new Vector(x_tower+369,331), new Vector(x_tower+362,324)), new Color(81, 81, 109));
        createPoly(g, new Triangle(new Vector(x_tower+348,331), new Vector(x_tower+355,317), new Vector(x_tower+362,324)), new Color(192, 207, 202));
        createPoly(g, new Triangle(new Vector(x_tower+371,318), new Vector(x_tower+369,331), new Vector(x_tower+362,324)), new Color(59, 53, 80));
        createPoly(g, new Triangle(new Vector(x_tower+371,318), new Vector(x_tower+366,312), new Vector(x_tower+362,324)), new Color(106, 141, 152));
        createPoly(g, new Triangle(new Vector(x_tower+355,317), new Vector(x_tower+366,312), new Vector(x_tower+362,324)), new Color(85, 137, 148));
        createPoly(g, new Triangle(new Vector(x_tower+355,317), new Vector(x_tower+366,312), new Vector(x_tower+359,307)), new Color(76, 70, 100));
        createPoly(g, new Triangle(new Vector(x_tower+368,303), new Vector(x_tower+366,312), new Vector(x_tower+359,307)), new Color(239, 246, 203));
        createPoly(g, new Triangle(new Vector(x_tower+368,303), new Vector(x_tower+366,312), new Vector(x_tower+373,309)), new Color(173, 183, 179));
        createPoly(g, new Triangle(new Vector(x_tower+371,318), new Vector(x_tower+366,312), new Vector(x_tower+373,309)), new Color(59, 53, 80));
        createPoly(g, new Triangle(new Vector(x_tower+368,303), new Vector(x_tower+363,297), new Vector(x_tower+359,307)), new Color(109, 104, 129));
        createPoly(g, new Triangle(new Vector(x_tower+368,303), new Vector(x_tower+363,297), new Vector(x_tower+371,293)), new Color(114, 121, 145));
        createPoly(g, new Triangle(new Vector(x_tower+366,288), new Vector(x_tower+363,297), new Vector(x_tower+371,293)), new Color(63, 57, 90));
        createPoly(g, new Triangle(new Vector(x_tower+368,303), new Vector(x_tower+373,309), new Vector(x_tower+375,300)), new Color(239, 246, 203));
        createPoly(g, new Triangle(new Vector(x_tower+368,303), new Vector(x_tower+371,293), new Vector(x_tower+375,300)), new Color(83, 77, 105));
        createPoly(g, new Triangle(new Vector(x_tower+378,288), new Vector(x_tower+371,293), new Vector(x_tower+375,300)), new Color(104, 135, 145));
        createPoly(g, new Triangle(new Vector(x_tower+378,288), new Vector(x_tower+371,293), new Vector(x_tower+366,288)), new Color(98, 96, 119));
        createPoly(g, new Triangle(new Vector(x_tower+411,331), new Vector(x_tower+419,331), new Vector(x_tower+417,325)), new Color(98, 96, 119));
        createPoly(g, new Triangle(new Vector(x_tower+430,331), new Vector(x_tower+419,331), new Vector(x_tower+417,325)), new Color(180, 200, 188));
        createPoly(g, new Triangle(new Vector(x_tower+409,323), new Vector(x_tower+411,331), new Vector(x_tower+417,325)), new Color(89, 123, 136));
        createPoly(g, new Triangle(new Vector(x_tower+409,323), new Vector(x_tower+415,317), new Vector(x_tower+417,325)), new Color(65, 61, 93));
        createPoly(g, new Triangle(new Vector(x_tower+424,321), new Vector(x_tower+415,317), new Vector(x_tower+417,325)), new Color(91, 131, 143));
        createPoly(g, new Triangle(new Vector(x_tower+424,321), new Vector(x_tower+430,331), new Vector(x_tower+417,325)), new Color(74, 106, 120));
        createPoly(g, new Triangle(new Vector(x_tower+424,321), new Vector(x_tower+415,317), new Vector(x_tower+420,311)), new Color(65, 64, 96));
        createPoly(g, new Triangle(new Vector(x_tower+413,308), new Vector(x_tower+415,317), new Vector(x_tower+420,311)), new Color(104, 137, 148));
        createPoly(g, new Triangle(new Vector(x_tower+409,323), new Vector(x_tower+415,317), new Vector(x_tower+406,314)), new Color(213, 223, 219));
        createPoly(g, new Triangle(new Vector(x_tower+413,308), new Vector(x_tower+415,317), new Vector(x_tower+406,314)), new Color(70, 69, 94));
        createPoly(g, new Triangle(new Vector(x_tower+413,308), new Vector(x_tower+404,307), new Vector(x_tower+406,314)), new Color(57, 50, 79));
        createPoly(g, new Triangle(new Vector(x_tower+413,308), new Vector(x_tower+404,307), new Vector(x_tower+410,301)), new Color(163,188,182));
        createPoly(g, new Triangle(new Vector(x_tower+413,308), new Vector(x_tower+418,305), new Vector(x_tower+410,301)), new Color(95,123,137));
        createPoly(g, new Triangle(new Vector(x_tower+413,308), new Vector(x_tower+418,305), new Vector(x_tower+420,311)), new Color(57, 50, 79));
        createPoly(g, new Triangle(new Vector(x_tower+402,299), new Vector(x_tower+404,307), new Vector(x_tower+410,301)), new Color(83,81,111));
        createPoly(g, new Triangle(new Vector(x_tower+415,297), new Vector(x_tower+418,305), new Vector(x_tower+410,301)), new Color(57, 50, 79));
        createPoly(g, new Triangle(new Vector(x_tower+406,293), new Vector(x_tower+402,299), new Vector(x_tower+399,288)), new Color(96,130,141));
        createPoly(g, new Triangle(new Vector(x_tower+406,293), new Vector(x_tower+410,301), new Vector(x_tower+415,297)), new Color(99,96,122));
        createPoly(g, new Triangle(new Vector(x_tower+406,293), new Vector(x_tower+412,288), new Vector(x_tower+415,297)), new Color(55,52,138));
        createPoly(g, new Triangle(new Vector(x_tower+406,293), new Vector(x_tower+412,288), new Vector(x_tower+399,288)), new Color(137,147,146));
        createPoly(g, new Triangle(new Vector(x_tower+366,288), new Vector(x_tower+378,288), new Vector(x_tower+365,270)), new Color(181,191,186));//
        createPoly(g, new Triangle(new Vector(x_tower+376,275), new Vector(x_tower+378,288), new Vector(x_tower+365,270)), new Color(60,55,86));
        createPoly(g, new Triangle(new Vector(x_tower+376,275), new Vector(x_tower+378,288), new Vector(x_tower+389,280)), new Color(108,109,127));
        createPoly(g, new Triangle(new Vector(x_tower+376,275), new Vector(x_tower+372,266), new Vector(x_tower+365,270)), new Color(77,110,132));
        createPoly(g, new Triangle(new Vector(x_tower+376,275), new Vector(x_tower+372,266), new Vector(x_tower+389,265)), new Color(101,96,121));
        createPoly(g, new Triangle(new Vector(x_tower+376,275), new Vector(x_tower+389,280), new Vector(x_tower+389,265)), new Color(63,61,88));
        createPoly(g, new Triangle(new Vector(x_tower+399,288), new Vector(x_tower+412,288), new Vector(x_tower+413,270)), new Color(181,191,186));//
        createPoly(g, new Triangle(new Vector(x_tower+399,288), new Vector(x_tower+401,275), new Vector(x_tower+413,270)), new Color(60,55,86));
        createPoly(g, new Triangle(new Vector(x_tower+399,288), new Vector(x_tower+401,275), new Vector(x_tower+389,280)), new Color(108,109,127));
        createPoly(g, new Triangle(new Vector(x_tower+406,266), new Vector(x_tower+401,275), new Vector(x_tower+413,270)), new Color(77,110,132));
        createPoly(g, new Triangle(new Vector(x_tower+406,266), new Vector(x_tower+401,275), new Vector(x_tower+389,265)), new Color(101,96,121));
        createPoly(g, new Triangle(new Vector(x_tower+389,280), new Vector(x_tower+401,275), new Vector(x_tower+389,265)), new Color(163,170,171));
        createPoly(g, new Triangle(new Vector(x_tower+378,288), new Vector(x_tower+399,288), new Vector(x_tower+389,280)), new Color(163,170,171));
        createPoly(g, new Triangle(new Vector(x_tower+393,260), new Vector(x_tower+385,260), new Vector(x_tower+389,280)), new Color(102,89,124));
        createPoly(g, new Triangle(new Vector(x_tower+372,266), new Vector(x_tower+385,260), new Vector(x_tower+389,265)), new Color(102,30,146));
        createPoly(g, new Triangle(new Vector(x_tower+393,260), new Vector(x_tower+406,266), new Vector(x_tower+389,265)), new Color(102,30,146));
        createPoly(g, new Triangle(new Vector(x_tower+393,260), new Vector(x_tower+406,266), new Vector(x_tower+404,257)), new Color(216,223,217));
        createPoly(g, new Triangle(new Vector(x_tower+393,260), new Vector(x_tower+393,253), new Vector(x_tower+404,257)), new Color(89,119,133));
        createPoly(g, new Triangle(new Vector(x_tower+402,245), new Vector(x_tower+393,253), new Vector(x_tower+404,257)), new Color(196,211,206));
        createPoly(g, new Triangle(new Vector(x_tower+402,245), new Vector(x_tower+393,253), new Vector(x_tower+393,239)), new Color(85,118,135));
        createPoly(g, new Triangle(new Vector(x_tower+402,245), new Vector(x_tower+401,233), new Vector(x_tower+393,239)), new Color(81,76,106));
        createPoly(g, new Triangle(new Vector(x_tower+392,226), new Vector(x_tower+401,233), new Vector(x_tower+393,239)), new Color(196,216,208));
        createPoly(g, new Triangle(new Vector(x_tower+392,226), new Vector(x_tower+401,233), new Vector(x_tower+399,220)), new Color(105,103,127));
        createPoly(g, new Triangle(new Vector(x_tower+392,226), new Vector(x_tower+392,214), new Vector(x_tower+399,220)), new Color(46,44,74));
        createPoly(g, new Triangle(new Vector(x_tower+399,220), new Vector(x_tower+392,214), new Vector(x_tower+398,207)), new Color(103,101,124));
        createPoly(g, new Triangle(new Vector(x_tower+391,200), new Vector(x_tower+392,214), new Vector(x_tower+398,207)), new Color(96,128,139));
        createPoly(g, new Triangle(new Vector(x_tower+391,200), new Vector(x_tower+397,194), new Vector(x_tower+398,207)), new Color(96,64,121));
        createPoly(g, new Triangle(new Vector(x_tower+391,200), new Vector(x_tower+397,194), new Vector(x_tower+391,187)), new Color(207,215,213));
        createPoly(g, new Triangle(new Vector(x_tower+396,181), new Vector(x_tower+397,194), new Vector(x_tower+391,187)), new Color(52,47,79));
        createPoly(g, new Triangle(new Vector(x_tower+396,181), new Vector(x_tower+390,175), new Vector(x_tower+391,187)), new Color(84,121,138));
        createPoly(g, new Triangle(new Vector(x_tower+396,181), new Vector(x_tower+390,175), new Vector(x_tower+395,168)), new Color(167,175,175));
        createPoly(g, new Triangle(new Vector(x_tower+389,167), new Vector(x_tower+390,175), new Vector(x_tower+395,168)), new Color(46,44,74));
        createPoly(g, new Triangle(new Vector(x_tower+389,167), new Vector(x_tower+394,159), new Vector(x_tower+395,168)), new Color(185,196,192));
        createPoly(g, new Triangle(new Vector(x_tower+389,167), new Vector(x_tower+394,159), new Vector(x_tower+383,159)), new Color(83,80,99));
        createPoly(g, new Triangle(new Vector(x_tower+389,167), new Vector(x_tower+383,168), new Vector(x_tower+383,159)), new Color(185,196,192));
        createPoly(g, new Triangle(new Vector(x_tower+389,167), new Vector(x_tower+383,168), new Vector(x_tower+388,175)), new Color(83,80,99));
        createPoly(g, new Triangle(new Vector(x_tower+382,180), new Vector(x_tower+383,168), new Vector(x_tower+388,175)), new Color(78,113,130));
        createPoly(g, new Triangle(new Vector(x_tower+382,180), new Vector(x_tower+387,187), new Vector(x_tower+388,175)), new Color(190,206,201));
        createPoly(g, new Triangle(new Vector(x_tower+382,180), new Vector(x_tower+387,187), new Vector(x_tower+381,195)), new Color(80,111,127));
        createPoly(g, new Triangle(new Vector(x_tower+387,200), new Vector(x_tower+387,187), new Vector(x_tower+381,195)), new Color(85,82,112));
        createPoly(g, new Triangle(new Vector(x_tower+387,200), new Vector(x_tower+379,207), new Vector(x_tower+381,195)), new Color(216,229,223));
        createPoly(g, new Triangle(new Vector(x_tower+387,200), new Vector(x_tower+379,207), new Vector(x_tower+386,214)), new Color(98,96,113));
        createPoly(g, new Triangle(new Vector(x_tower+378,220), new Vector(x_tower+379,207), new Vector(x_tower+386,214)), new Color(52,47,79));
        createPoly(g, new Triangle(new Vector(x_tower+378,220), new Vector(x_tower+386,226), new Vector(x_tower+386,214)), new Color(94,124,136));
        createPoly(g, new Triangle(new Vector(x_tower+378,220), new Vector(x_tower+386,226), new Vector(x_tower+377,232)), new Color(203,214,210));
        createPoly(g, new Triangle(new Vector(x_tower+385,239), new Vector(x_tower+386,226), new Vector(x_tower+377,232)), new Color(94,124,136));
        createPoly(g, new Triangle(new Vector(x_tower+385,239), new Vector(x_tower+376,244), new Vector(x_tower+377,232)), new Color(203,214,210));
        createPoly(g, new Triangle(new Vector(x_tower+385,239), new Vector(x_tower+376,244), new Vector(x_tower+385,253)), new Color(90,83,114));
        createPoly(g, new Triangle(new Vector(x_tower+374,259), new Vector(x_tower+376,244), new Vector(x_tower+385,253)), new Color(104,135,147));
        createPoly(g, new Triangle(new Vector(x_tower+374,259), new Vector(x_tower+385,260), new Vector(x_tower+385,253)), new Color(100,98,121));
        createPoly(g, new Triangle(new Vector(x_tower+374,259), new Vector(x_tower+385,260), new Vector(x_tower+372,266)), new Color(104,135,147));
        createPoly(g, new Triangle(new Vector(x_tower+383,159), new Vector(x_tower+383,153), new Vector(x_tower+394,153)), new Color(104,135,147));
        createPoly(g, new Triangle(new Vector(x_tower+383,159), new Vector(x_tower+394,159), new Vector(x_tower+394,153)), new Color(166,179,175));
        createPoly(g, new Triangle(new Vector(x_tower+397,150), new Vector(x_tower+383,153), new Vector(x_tower+394,153)), new Color(52,47,79));
        createPoly(g, new Triangle(new Vector(x_tower+397,150), new Vector(x_tower+383,153), new Vector(x_tower+380,150)), new Color(65,61,89));
        createPoly(g, new Triangle(new Vector(x_tower+397,150), new Vector(x_tower+388,144), new Vector(x_tower+380,150)), new Color(101,135,148));
        createPoly(g, new Triangle(new Vector(x_tower+380,139), new Vector(x_tower+388,144), new Vector(x_tower+380,150)), new Color(191,208,200));
        createPoly(g, new Triangle(new Vector(x_tower+397,150), new Vector(x_tower+397,139), new Vector(x_tower+388,144)), new Color(65,61,89));
        createPoly(g, new Triangle(new Vector(x_tower+394,138), new Vector(x_tower+397,139), new Vector(x_tower+388,144)), new Color(203,214,210));
        createPoly(g, new Triangle(new Vector(x_tower+394,138), new Vector(x_tower+384,138), new Vector(x_tower+388,144)), new Color(101,135,148));
        createPoly(g, new Triangle(new Vector(x_tower+380,139), new Vector(x_tower+384,138), new Vector(x_tower+388,144)), new Color(65,61,89));
        createPoly(g, new Triangle(new Vector(x_tower+394,138), new Vector(x_tower+384,138), new Vector(x_tower+384,134)), new Color(56,53,88));
        createPoly(g, new Triangle(new Vector(x_tower+394,138), new Vector(x_tower+394,134), new Vector(x_tower+384,134)), new Color(180,189,190));
        createPoly(g, new Triangle(new Vector(x_tower+387,133), new Vector(x_tower+391,133), new Vector(x_tower+388,122)), new Color(74,74,87));
        createPoly(g, new Triangle(new Vector(x_tower+390,122), new Vector(x_tower+391,133), new Vector(x_tower+388,122)), new Color(85,117,131));
        
        //statue of liberty
        int x_liberty = -17;
        createPoly(g, new Triangle(new Vector(x_liberty+140,440), new Vector(x_liberty+167,440), new Vector(x_liberty+160,427)), new Color(193,225,211));//-
        createPoly(g, new Triangle(new Vector(x_liberty+140,440), new Vector(x_liberty+155,415), new Vector(x_liberty+160,427)), new Color(170,204,197));
        createPoly(g, new Triangle(new Vector(x_liberty+163,408), new Vector(x_liberty+155,415), new Vector(x_liberty+160,427)), new Color(141,193,180));
        createPoly(g, new Triangle(new Vector(x_liberty+163,408), new Vector(x_liberty+155,415), new Vector(x_liberty+165,396)), new Color(125,175,157));
        createPoly(g, new Triangle(new Vector(x_liberty+156,365), new Vector(x_liberty+155,415), new Vector(x_liberty+165,396)), new Color(138,190,177));
        createPoly(g, new Triangle(new Vector(x_liberty+163,408), new Vector(x_liberty+165,396), new Vector(x_liberty+175,393)), new Color(181,214,204));
        createPoly(g, new Triangle(new Vector(x_liberty+163,408), new Vector(x_liberty+160,427), new Vector(x_liberty+175,393)), new Color(129,172,162));
        createPoly(g, new Triangle(new Vector(x_liberty+176,412), new Vector(x_liberty+160,427), new Vector(x_liberty+175,393)), new Color(182,215,208));
        createPoly(g, new Triangle(new Vector(x_liberty+176,412), new Vector(x_liberty+160,427), new Vector(x_liberty+185,428)), new Color(182,215,208));
        createPoly(g, new Triangle(new Vector(x_liberty+176,412), new Vector(x_liberty+182,390), new Vector(x_liberty+185,428)), new Color(182,215,208));
        createPoly(g, new Triangle(new Vector(x_liberty+176,412), new Vector(x_liberty+182,390), new Vector(x_liberty+175,393)), new Color(110,163,145));
        createPoly(g, new Triangle(new Vector(x_liberty+167,440), new Vector(x_liberty+160,427), new Vector(x_liberty+185,428)), new Color(206,233,212));//v
        createPoly(g, new Triangle(new Vector(x_liberty+167,440), new Vector(x_liberty+193,440), new Vector(x_liberty+185,428)), new Color(190,218,214));//-
        createPoly(g, new Triangle(new Vector(x_liberty+204,421), new Vector(x_liberty+193,440), new Vector(x_liberty+185,428)), new Color(218,233,226));//v
        createPoly(g, new Triangle(new Vector(x_liberty+204,421), new Vector(x_liberty+190,413), new Vector(x_liberty+185,428)), new Color(188,215,198));
        createPoly(g, new Triangle(new Vector(x_liberty+204,421), new Vector(x_liberty+193,440), new Vector(x_liberty+218,428)), new Color(188,220,207));//v
        createPoly(g, new Triangle(new Vector(x_liberty+228,440), new Vector(x_liberty+193,440), new Vector(x_liberty+218,428)), new Color(154,216,203));//-
        createPoly(g, new Triangle(new Vector(x_liberty+228,440), new Vector(x_liberty+226,428), new Vector(x_liberty+218,428)), new Color(215,234,225));//v
        createPoly(g, new Triangle(new Vector(x_liberty+228,440), new Vector(x_liberty+226,428), new Vector(x_liberty+234,440)), new Color(110,172,152));//-
        createPoly(g, new Triangle(new Vector(x_liberty+225,423), new Vector(x_liberty+226,428), new Vector(x_liberty+218,428)), new Color(155,195,181));
        createPoly(g, new Triangle(new Vector(x_liberty+225,423), new Vector(x_liberty+214,408), new Vector(x_liberty+218,428)), new Color(186,219,212));
        createPoly(g, new Triangle(new Vector(x_liberty+204,421), new Vector(x_liberty+214,408), new Vector(x_liberty+218,428)), new Color(181,210,198));
        createPoly(g, new Triangle(new Vector(x_liberty+225,423), new Vector(x_liberty+214,408), new Vector(x_liberty+223,379)), new Color(159,210,205));
        createPoly(g, new Triangle(new Vector(x_liberty+204,421), new Vector(x_liberty+214,408), new Vector(x_liberty+215,383)), new Color(167,199,187));
        createPoly(g, new Triangle(new Vector(x_liberty+223,379), new Vector(x_liberty+214,408), new Vector(x_liberty+215,383)), new Color(202,223,217));
        createPoly(g, new Triangle(new Vector(x_liberty+204,390), new Vector(x_liberty+204,421), new Vector(x_liberty+190,413)), new Color(90,161,143));
        createPoly(g, new Triangle(new Vector(x_liberty+204,390), new Vector(x_liberty+192,385), new Vector(x_liberty+190,413)), new Color(102,174,175));
        createPoly(g, new Triangle(new Vector(x_liberty+182,390), new Vector(x_liberty+192,385), new Vector(x_liberty+190,413)), new Color(88,145,130));
        createPoly(g, new Triangle(new Vector(x_liberty+182,390), new Vector(x_liberty+185,428), new Vector(x_liberty+190,413)), new Color(126,178,164));
        createPoly(g, new Triangle(new Vector(x_liberty+204,390), new Vector(x_liberty+204,421), new Vector(x_liberty+211,372)), new Color(198,225,220));
        createPoly(g, new Triangle(new Vector(x_liberty+211,372), new Vector(x_liberty+223,379), new Vector(x_liberty+215,383)), new Color(131,177,166));
        createPoly(g, new Triangle(new Vector(x_liberty+211,372), new Vector(x_liberty+204,421), new Vector(x_liberty+215,383)), new Color(181,216,206));
        createPoly(g, new Triangle(new Vector(x_liberty+211,372), new Vector(x_liberty+204,390), new Vector(x_liberty+203,378)), new Color(122,173,161));
        createPoly(g, new Triangle(new Vector(x_liberty+192,385), new Vector(x_liberty+204,390), new Vector(x_liberty+203,378)), new Color(88,152,135));
        createPoly(g, new Triangle(new Vector(x_liberty+192,385), new Vector(x_liberty+193,370), new Vector(x_liberty+203,378)), new Color(112,162,147));
        createPoly(g, new Triangle(new Vector(x_liberty+210,360), new Vector(x_liberty+193,370), new Vector(x_liberty+203,378)), new Color(76,122,112));
        createPoly(g, new Triangle(new Vector(x_liberty+210,360), new Vector(x_liberty+211,372), new Vector(x_liberty+223,368)), new Color(84,135,122));
        createPoly(g, new Triangle(new Vector(x_liberty+210,360), new Vector(x_liberty+211,372), new Vector(x_liberty+203,378)), new Color(125,168,158));
        createPoly(g, new Triangle(new Vector(x_liberty+223,379), new Vector(x_liberty+211,372), new Vector(x_liberty+223,368)), new Color(112,164,151));
        createPoly(g, new Triangle(new Vector(x_liberty+224,390), new Vector(x_liberty+224,396), new Vector(x_liberty+227,392)), new Color(88,145,130));
        createPoly(g, new Triangle(new Vector(x_liberty+224,390), new Vector(x_liberty+223,379), new Vector(x_liberty+227,392)), new Color(182,216,210));
        createPoly(g, new Triangle(new Vector(x_liberty+226,369), new Vector(x_liberty+223,379), new Vector(x_liberty+227,392)), new Color(121,164,163));
        createPoly(g, new Triangle(new Vector(x_liberty+226,369), new Vector(x_liberty+223,379), new Vector(x_liberty+223,368)), new Color(150,186,185));
        createPoly(g, new Triangle(new Vector(x_liberty+226,369), new Vector(x_liberty+228,359), new Vector(x_liberty+223,368)), new Color(99,138,132));
        createPoly(g, new Triangle(new Vector(x_liberty+226,369), new Vector(x_liberty+228,359), new Vector(x_liberty+229,369)), new Color(75,120,117));
        createPoly(g, new Triangle(new Vector(x_liberty+223,368), new Vector(x_liberty+223,357), new Vector(x_liberty+230,357)), new Color(71,111,101));
        createPoly(g, new Triangle(new Vector(x_liberty+223,368), new Vector(x_liberty+223,353), new Vector(x_liberty+210,360)), new Color(85,114,100));
        createPoly(g, new Triangle(new Vector(x_liberty+156,365), new Vector(x_liberty+165,398), new Vector(x_liberty+186,330)), new Color(113,180,164));
        createPoly(g, new Triangle(new Vector(x_liberty+195,384), new Vector(x_liberty+165,398), new Vector(x_liberty+186,330)), new Color(203,222,215));
        createPoly(g, new Triangle(new Vector(x_liberty+197,315), new Vector(x_liberty+193,370), new Vector(x_liberty+186,330)), new Color(172,204,191));
        createPoly(g, new Triangle(new Vector(x_liberty+197,315), new Vector(x_liberty+193,370), new Vector(x_liberty+221,332)), new Color(198,219,210));
        createPoly(g, new Triangle(new Vector(x_liberty+230,343), new Vector(x_liberty+193,370), new Vector(x_liberty+221,332)), new Color(172,221,201));
        createPoly(g, new Triangle(new Vector(x_liberty+230,343), new Vector(x_liberty+223,357), new Vector(x_liberty+223,353)), new Color(172,221,201));
        createPoly(g, new Triangle(new Vector(x_liberty+230,343), new Vector(x_liberty+223,357), new Vector(x_liberty+230,357)), new Color(172,221,201));
        createPoly(g, new Triangle(new Vector(x_liberty+169,314), new Vector(x_liberty+156,334), new Vector(x_liberty+165,356)), new Color(194,224,215));
        createPoly(g, new Triangle(new Vector(x_liberty+156,334), new Vector(x_liberty+156,365), new Vector(x_liberty+165,356)), new Color(163,209,189));
        createPoly(g, new Triangle(new Vector(x_liberty+169,314), new Vector(x_liberty+186,300), new Vector(x_liberty+165,356)), new Color(163,209,189));
        createPoly(g, new Triangle(new Vector(x_liberty+186,330), new Vector(x_liberty+186,300), new Vector(x_liberty+165,356)), new Color(199,226,217));
        createPoly(g, new Triangle(new Vector(x_liberty+186,330), new Vector(x_liberty+197,315), new Vector(x_liberty+186,300)), new Color(199,226,217));
        createPoly(g, new Triangle(new Vector(x_liberty+197,291), new Vector(x_liberty+197,315), new Vector(x_liberty+186,300)), new Color(190,218,209));
        createPoly(g, new Triangle(new Vector(x_liberty+197,291), new Vector(x_liberty+197,315), new Vector(x_liberty+220,312)), new Color(190,218,209));
        createPoly(g, new Triangle(new Vector(x_liberty+221,332), new Vector(x_liberty+197,315), new Vector(x_liberty+220,312)), new Color(184,216,203));
        createPoly(g, new Triangle(new Vector(x_liberty+221,332), new Vector(x_liberty+228,318), new Vector(x_liberty+220,312)), new Color(163,209,189));
        createPoly(g, new Triangle(new Vector(x_liberty+221,332), new Vector(x_liberty+228,318), new Vector(x_liberty+230,337)), new Color(199,226,217));
        createPoly(g, new Triangle(new Vector(x_liberty+221,332), new Vector(x_liberty+230,343), new Vector(x_liberty+230,337)), new Color(88,132,117));
        createPoly(g, new Triangle(new Vector(x_liberty+228,318), new Vector(x_liberty+220,312), new Vector(x_liberty+224,291)), new Color(223,239,234));
        createPoly(g, new Triangle(new Vector(x_liberty+228,318), new Vector(x_liberty+227,311), new Vector(x_liberty+235,312)), new Color(82,122,112));
        createPoly(g, new Triangle(new Vector(x_liberty+231,304), new Vector(x_liberty+227,311), new Vector(x_liberty+235,312)), new Color(82,122,112));
        createPoly(g, new Triangle(new Vector(x_liberty+231,304), new Vector(x_liberty+227,311), new Vector(x_liberty+226,301)), new Color(50,96,85));
        createPoly(g, new Triangle(new Vector(x_liberty+231,304), new Vector(x_liberty+240,291), new Vector(x_liberty+235,312)), new Color(54,111,103));
        createPoly(g, new Triangle(new Vector(x_liberty+231,304), new Vector(x_liberty+240,291), new Vector(x_liberty+229,304)), new Color(153,211,198));
        createPoly(g, new Triangle(new Vector(x_liberty+240,283), new Vector(x_liberty+240,291), new Vector(x_liberty+229,304)), new Color(153,211,198));
        createPoly(g, new Triangle(new Vector(x_liberty+240,283), new Vector(x_liberty+224,291), new Vector(x_liberty+229,304)), new Color(227,240,233));
        createPoly(g, new Triangle(new Vector(x_liberty+226,301), new Vector(x_liberty+224,291), new Vector(x_liberty+229,304)), new Color(227,240,233));
        createPoly(g, new Triangle(new Vector(x_liberty+220,312), new Vector(x_liberty+224,291), new Vector(x_liberty+216,292)), new Color(151,202,190));
        createPoly(g, new Triangle(new Vector(x_liberty+220,312), new Vector(x_liberty+197,291), new Vector(x_liberty+216,292)), new Color(213,232,226));
        createPoly(g, new Triangle(new Vector(x_liberty+224,291), new Vector(x_liberty+227,280), new Vector(x_liberty+240,283)), new Color(209,235,226));
        createPoly(g, new Triangle(new Vector(x_liberty+229,273), new Vector(x_liberty+227,280), new Vector(x_liberty+240,283)), new Color(183,222,209));
        createPoly(g, new Triangle(new Vector(x_liberty+229,273), new Vector(x_liberty+254,261), new Vector(x_liberty+240,283)), new Color(208,229,222));
        createPoly(g, new Triangle(new Vector(x_liberty+229,273), new Vector(x_liberty+254,261), new Vector(x_liberty+231,262)), new Color(208,229,222));
        createPoly(g, new Triangle(new Vector(x_liberty+239,252), new Vector(x_liberty+254,261), new Vector(x_liberty+231,262)), new Color(208,229,222));
        createPoly(g, new Triangle(new Vector(x_liberty+240,283), new Vector(x_liberty+249,269), new Vector(x_liberty+253,274)), new Color(148,187,173));
        createPoly(g, new Triangle(new Vector(x_liberty+240,283), new Vector(x_liberty+245,289), new Vector(x_liberty+253,274)), new Color(97,145,123));
        createPoly(g, new Triangle(new Vector(x_liberty+240,283), new Vector(x_liberty+245,289), new Vector(x_liberty+240,291)), new Color(79,121,105));
        createPoly(g, new Triangle(new Vector(x_liberty+249,269), new Vector(x_liberty+254,261), new Vector(x_liberty+256,262)), new Color(99,142,136));
        createPoly(g, new Triangle(new Vector(x_liberty+249,269), new Vector(x_liberty+251,272), new Vector(x_liberty+256,262)), new Color(99,142,136));
        createPoly(g, new Triangle(new Vector(x_liberty+231,262), new Vector(x_liberty+224,291), new Vector(x_liberty+217,273)), new Color(166,212,197));
        createPoly(g, new Triangle(new Vector(x_liberty+211,278), new Vector(x_liberty+224,291), new Vector(x_liberty+217,273)), new Color(119,159,145));
        createPoly(g, new Triangle(new Vector(x_liberty+211,278), new Vector(x_liberty+224,291), new Vector(x_liberty+216,292)), new Color(191,218,209));
        createPoly(g, new Triangle(new Vector(x_liberty+211,278), new Vector(x_liberty+197,291), new Vector(x_liberty+216,292)), new Color(191,218,209));
        createPoly(g, new Triangle(new Vector(x_liberty+211,278), new Vector(x_liberty+197,291), new Vector(x_liberty+206,260)), new Color(191,218,209));
        createPoly(g, new Triangle(new Vector(x_liberty+211,278), new Vector(x_liberty+213,261), new Vector(x_liberty+206,260)), new Color(146,179,168));
        createPoly(g, new Triangle(new Vector(x_liberty+211,278), new Vector(x_liberty+213,261), new Vector(x_liberty+217,273)), new Color(111,154,140));
        createPoly(g, new Triangle(new Vector(x_liberty+211,278), new Vector(x_liberty+213,261), new Vector(x_liberty+231,262)), new Color(166,211,169));
        createPoly(g, new Triangle(new Vector(x_liberty+222,251), new Vector(x_liberty+213,261), new Vector(x_liberty+231,262)), new Color(178,213,207));
        createPoly(g, new Triangle(new Vector(x_liberty+222,251), new Vector(x_liberty+213,261), new Vector(x_liberty+208,229)), new Color(160,202,193));
        createPoly(g, new Triangle(new Vector(x_liberty+222,251), new Vector(x_liberty+220,239), new Vector(x_liberty+208,229)), new Color(118,154,152));
        createPoly(g, new Triangle(new Vector(x_liberty+213,261), new Vector(x_liberty+185,259), new Vector(x_liberty+208,229)), new Color(205,232,227));
        createPoly(g, new Triangle(new Vector(x_liberty+195,246), new Vector(x_liberty+198,228), new Vector(x_liberty+208,229)), new Color(190,223,246));
        createPoly(g, new Triangle(new Vector(x_liberty+206,260), new Vector(x_liberty+185,259), new Vector(x_liberty+197,291)), new Color(224,234,232)); 
        createPoly(g, new Triangle(new Vector(x_liberty+173,290), new Vector(x_liberty+185,259), new Vector(x_liberty+197,291)), new Color(196,221,217));
        createPoly(g, new Triangle(new Vector(x_liberty+173,290), new Vector(x_liberty+169,314), new Vector(x_liberty+197,291)), new Color(203,228,224));
        createPoly(g, new Triangle(new Vector(x_liberty+173,290), new Vector(x_liberty+169,314), new Vector(x_liberty+156,334)), new Color(203,228,224));
        createPoly(g, new Triangle(new Vector(x_liberty+156,334), new Vector(x_liberty+153,320), new Vector(x_liberty+173,290)), new Color(147,190,180));
        createPoly(g, new Triangle(new Vector(x_liberty+166,288), new Vector(x_liberty+153,320), new Vector(x_liberty+173,290)), new Color(127,190,160));
        createPoly(g, new Triangle(new Vector(x_liberty+166,288), new Vector(x_liberty+153,320), new Vector(x_liberty+153,309)), new Color(194,220,214));
        createPoly(g, new Triangle(new Vector(x_liberty+166,288), new Vector(x_liberty+157,297), new Vector(x_liberty+157,305)), new Color(194,220,214));
        createPoly(g, new Triangle(new Vector(x_liberty+166,288), new Vector(x_liberty+157,297), new Vector(x_liberty+158,285)), new Color(175,208,197));
        createPoly(g, new Triangle(new Vector(x_liberty+150,295), new Vector(x_liberty+157,297), new Vector(x_liberty+158,285)), new Color(69,116,101));
        createPoly(g, new Triangle(new Vector(x_liberty+195,243), new Vector(x_liberty+167,288), new Vector(x_liberty+150,280)), new Color(143,160,173));
        createPoly(g, new Triangle(new Vector(x_liberty+185,259), new Vector(x_liberty+173,290), new Vector(x_liberty+158,285)), new Color(187,218,212));
        createPoly(g, new Triangle(new Vector(x_liberty+169,266), new Vector(x_liberty+159,265), new Vector(x_liberty+150,280)), new Color(187,218,212));
        createPoly(g, new Triangle(new Vector(x_liberty+169,266), new Vector(x_liberty+159,265), new Vector(x_liberty+172,249)), new Color(214,235,228));
        createPoly(g, new Triangle(new Vector(x_liberty+169,266), new Vector(x_liberty+195,228), new Vector(x_liberty+172,249)), new Color(185,211,202));
        createPoly(g, new Triangle(new Vector(x_liberty+169,266), new Vector(x_liberty+195,228), new Vector(x_liberty+195,243)), new Color(198,219,212));
        createPoly(g, new Triangle(new Vector(x_liberty+199,229), new Vector(x_liberty+195,228), new Vector(x_liberty+195,243)), new Color(198,219,212));
        createPoly(g, new Triangle(new Vector(x_liberty+159,265), new Vector(x_liberty+152,253), new Vector(x_liberty+165,233)), new Color(95,153,138));
        createPoly(g, new Triangle(new Vector(x_liberty+180,218), new Vector(x_liberty+172,249), new Vector(x_liberty+165,233)), new Color(214,235,228));
        createPoly(g, new Triangle(new Vector(x_liberty+195,228), new Vector(x_liberty+172,249), new Vector(x_liberty+189,228)), new Color(214,235,228));
        createPoly(g, new Triangle(new Vector(x_liberty+180,218), new Vector(x_liberty+172,249), new Vector(x_liberty+189,228)), new Color(214,235,228));
        createPoly(g, new Triangle(new Vector(x_liberty+152,253), new Vector(x_liberty+165,233), new Vector(x_liberty+154,236)), new Color(140,193,179));
        createPoly(g, new Triangle(new Vector(x_liberty+165,218), new Vector(x_liberty+155,225), new Vector(x_liberty+154,236)), new Color(148,204,192));
        createPoly(g, new Triangle(new Vector(x_liberty+165,218), new Vector(x_liberty+165,233), new Vector(x_liberty+154,236)), new Color(151,196,188));
        createPoly(g, new Triangle(new Vector(x_liberty+165,218), new Vector(x_liberty+165,233), new Vector(x_liberty+180,218)), new Color(191,222,216));
        createPoly(g, new Triangle(new Vector(x_liberty+155,225), new Vector(x_liberty+154,236), new Vector(x_liberty+148,233)), new Color(82,135,215));
        createPoly(g, new Triangle(new Vector(x_liberty+155,225), new Vector(x_liberty+151,225), new Vector(x_liberty+148,233)), new Color(110,168,152));
        createPoly(g, new Triangle(new Vector(x_liberty+155,225), new Vector(x_liberty+151,225), new Vector(x_liberty+162,211)), new Color(110,168,152));
        createPoly(g, new Triangle(new Vector(x_liberty+155,225), new Vector(x_liberty+165,218), new Vector(x_liberty+162,211)), new Color(110,168,152));
        createPoly(g, new Triangle(new Vector(x_liberty+168,203), new Vector(x_liberty+165,218), new Vector(x_liberty+162,211)), new Color(136,186,179));
        createPoly(g, new Triangle(new Vector(x_liberty+168,203), new Vector(x_liberty+165,218), new Vector(x_liberty+171,211)), new Color(136,186,179));
        createPoly(g, new Triangle(new Vector(x_liberty+180,218), new Vector(x_liberty+165,218), new Vector(x_liberty+171,211)), new Color(205,226,219));
        createPoly(g, new Triangle(new Vector(x_liberty+151,225), new Vector(x_liberty+162,211), new Vector(x_liberty+153,213)), new Color(174,215,205));
        createPoly(g, new Triangle(new Vector(x_liberty+151,225), new Vector(x_liberty+147,225), new Vector(x_liberty+153,213)), new Color(194,221,209));
        createPoly(g, new Triangle(new Vector(x_liberty+143,213), new Vector(x_liberty+147,225), new Vector(x_liberty+153,213)), new Color(194,221,209));
        createPoly(g, new Triangle(new Vector(x_liberty+143,213), new Vector(x_liberty+151,205), new Vector(x_liberty+153,213)), new Color(142,199,184));
        createPoly(g, new Triangle(new Vector(x_liberty+143,213), new Vector(x_liberty+153,204), new Vector(x_liberty+151,197)), new Color(190,232,214));
        createPoly(g, new Triangle(new Vector(x_liberty+160,201), new Vector(x_liberty+153,213), new Vector(x_liberty+150,189)), new Color(190,232,214));
        createPoly(g, new Triangle(new Vector(x_liberty+160,201), new Vector(x_liberty+153,213), new Vector(x_liberty+162,211)), new Color(218,237,231));
        createPoly(g, new Triangle(new Vector(x_liberty+160,201), new Vector(x_liberty+168,203), new Vector(x_liberty+162,211)), new Color(218,237,231));
        createPoly(g, new Triangle(new Vector(x_liberty+160,201), new Vector(x_liberty+168,203), new Vector(x_liberty+165,194)), new Color(200,221,214));
        createPoly(g, new Triangle(new Vector(x_liberty+160,201), new Vector(x_liberty+162,190), new Vector(x_liberty+165,194)), new Color(200,221,214));
        createPoly(g, new Triangle(new Vector(x_liberty+160,201), new Vector(x_liberty+162,190), new Vector(x_liberty+158,191)), new Color(112,164,161));
        createPoly(g, new Triangle(new Vector(x_liberty+160,175), new Vector(x_liberty+162,190), new Vector(x_liberty+158,191)), new Color(112,164,161));
        createPoly(g, new Triangle(new Vector(x_liberty+160,175), new Vector(x_liberty+153,178), new Vector(x_liberty+158,191)), new Color(156,185,194));
        createPoly(g, new Triangle(new Vector(x_liberty+150,189), new Vector(x_liberty+153,178), new Vector(x_liberty+158,191)), new Color(207,226,219));
        createPoly(g, new Triangle(new Vector(x_liberty+150,189), new Vector(x_liberty+160,201), new Vector(x_liberty+158,191)), new Color(161,201,192));
        createPoly(g, new Triangle(new Vector(x_liberty+150,189), new Vector(x_liberty+153,178), new Vector(x_liberty+148,181)), new Color(207,226,219));
        createPoly(g, new Triangle(new Vector(x_liberty+146,159), new Vector(x_liberty+153,178), new Vector(x_liberty+148,181)), new Color(194,224,209));
        createPoly(g, new Triangle(new Vector(x_liberty+146,159), new Vector(x_liberty+153,178), new Vector(x_liberty+150,154)), new Color(114,170,165));
        createPoly(g, new Triangle(new Vector(x_liberty+160,175), new Vector(x_liberty+153,178), new Vector(x_liberty+150,154)), new Color(130,174,175));
        createPoly(g, new Triangle(new Vector(x_liberty+160,175), new Vector(x_liberty+156,154), new Vector(x_liberty+150,154)), new Color(179,213,203));
        createPoly(g, new Triangle(new Vector(x_liberty+156,145), new Vector(x_liberty+156,154), new Vector(x_liberty+150,154)), new Color(103,159,156));
        createPoly(g, new Triangle(new Vector(x_liberty+156,145), new Vector(x_liberty+150,141), new Vector(x_liberty+150,154)), new Color(145,191,184));
        createPoly(g, new Triangle(new Vector(x_liberty+156,145), new Vector(x_liberty+150,141), new Vector(x_liberty+155,136)), new Color(145,191,184));
        createPoly(g, new Triangle(new Vector(x_liberty+150,129), new Vector(x_liberty+150,141), new Vector(x_liberty+155,136)), new Color(102,153,153));
        createPoly(g, new Triangle(new Vector(x_liberty+150,129), new Vector(x_liberty+150,141), new Vector(x_liberty+141,131)), new Color(156,202,180));
        createPoly(g, new Triangle(new Vector(x_liberty+142,140), new Vector(x_liberty+150,141), new Vector(x_liberty+141,131)), new Color(146,195,180));
        createPoly(g, new Triangle(new Vector(x_liberty+142,140), new Vector(x_liberty+150,141), new Vector(x_liberty+144,147)), new Color(156,203,192));
        createPoly(g, new Triangle(new Vector(x_liberty+150,154), new Vector(x_liberty+150,141), new Vector(x_liberty+144,147)), new Color(202,223,222));
        createPoly(g, new Triangle(new Vector(x_liberty+150,154), new Vector(x_liberty+144,154), new Vector(x_liberty+144,147)), new Color(202,223,222));
        createPoly(g, new Triangle(new Vector(x_liberty+150,154), new Vector(x_liberty+144,154), new Vector(x_liberty+146,159)), new Color(128,173,174));
        createPoly(g, new Triangle(new Vector(x_liberty+141,131), new Vector(x_liberty+150,129), new Vector(x_liberty+145,127)), new Color(112,161,155));
        createPoly(g, new Triangle(new Vector(x_liberty+141,131), new Vector(x_liberty+140,124), new Vector(x_liberty+145,127)), new Color(123,177,168));
        createPoly(g, new Triangle(new Vector(x_liberty+153,124), new Vector(x_liberty+140,124), new Vector(x_liberty+145,127)), new Color(84,142,135));
        createPoly(g, new Triangle(new Vector(x_liberty+153,124), new Vector(x_liberty+150,129), new Vector(x_liberty+145,127)), new Color(123,177,168));
        createPoly(g, new Triangle(new Vector(x_liberty+153,124), new Vector(x_liberty+140,124), new Vector(x_liberty+148,119)), new Color(25,35,42));
        createPoly(g, new Triangle(new Vector(x_liberty+136,120), new Vector(x_liberty+140,124), new Vector(x_liberty+148,119)), new Color(25,35,42));
        createPoly(g, new Triangle(new Vector(x_liberty+159,120), new Vector(x_liberty+153,124), new Vector(x_liberty+148,119)), new Color(25,35,42));
        createPoly(g, new Triangle(new Vector(x_liberty+159,120), new Vector(x_liberty+159,111), new Vector(x_liberty+148,119)), new Color(93,116,119));
        createPoly(g, new Triangle(new Vector(x_liberty+148,111), new Vector(x_liberty+159,111), new Vector(x_liberty+148,119)), new Color(146,157,152));
        createPoly(g, new Triangle(new Vector(x_liberty+148,111), new Vector(x_liberty+136,111), new Vector(x_liberty+148,119)), new Color(93,116,119));
        createPoly(g, new Triangle(new Vector(x_liberty+136,120), new Vector(x_liberty+136,111), new Vector(x_liberty+148,119)), new Color(146,157,152));
        createPoly(g, new Triangle(new Vector(x_liberty+148,111), new Vector(x_liberty+136,111), new Vector(x_liberty+143,107)), new Color(146,157,152));
        createPoly(g, new Triangle(new Vector(x_liberty+148,111), new Vector(x_liberty+152,108), new Vector(x_liberty+143,107)), new Color(72,90,88));
        createPoly(g, new Triangle(new Vector(x_liberty+148,111), new Vector(x_liberty+152,108), new Vector(x_liberty+159,111)), new Color(183,211,205));
        createPoly(g, new Triangle(new Vector(x_liberty+147,102), new Vector(x_liberty+152,108), new Vector(x_liberty+143,107)), new Color(102,83,51));
        createPoly(g, new Triangle(new Vector(x_liberty+147,102), new Vector(x_liberty+142,102), new Vector(x_liberty+143,107)), new Color(202,178,132));
        createPoly(g, new Triangle(new Vector(x_liberty+147,102), new Vector(x_liberty+142,102), new Vector(x_liberty+146,99)), new Color(236,223,188));
        createPoly(g, new Triangle(new Vector(x_liberty+144,97), new Vector(x_liberty+142,102), new Vector(x_liberty+146,99)), new Color(236,223,188));
        createPoly(g, new Triangle(new Vector(x_liberty+150,94), new Vector(x_liberty+147,102), new Vector(x_liberty+146,99)), new Color(236,223,188));
        createPoly(g, new Triangle(new Vector(x_liberty+150,94), new Vector(x_liberty+147,102), new Vector(x_liberty+152,97)), new Color(236,223,188));
        createPoly(g, new Triangle(new Vector(x_liberty+154,102), new Vector(x_liberty+147,102), new Vector(x_liberty+152,97)), new Color(236,223,188));
        createPoly(g, new Triangle(new Vector(x_liberty+154,102), new Vector(x_liberty+155,94), new Vector(x_liberty+152,97)), new Color(236,223,188));
        createPoly(g, new Triangle(new Vector(x_liberty+154,102), new Vector(x_liberty+147,102), new Vector(x_liberty+152,108)), new Color(153,122,75));
        createPoly(g, new Triangle(new Vector(x_liberty+203,227), new Vector(x_liberty+207,227), new Vector(x_liberty+208,229)), new Color(82,153,146));
        createPoly(g, new Triangle(new Vector(x_liberty+203,227), new Vector(x_liberty+207,227), new Vector(x_liberty+203,217)), new Color(82,153,146));//o
        createPoly(g, new Triangle(new Vector(x_liberty+203,227), new Vector(x_liberty+199,221), new Vector(x_liberty+203,217)), new Color(82,153,146));
        createPoly(g, new Triangle(new Vector(x_liberty+203,227), new Vector(x_liberty+199,221), new Vector(x_liberty+198,228)), new Color(220,235,232));
        createPoly(g, new Triangle(new Vector(x_liberty+193,217), new Vector(x_liberty+199,221), new Vector(x_liberty+198,228)), new Color(82,131,137));
        createPoly(g, new Triangle(new Vector(x_liberty+193,217), new Vector(x_liberty+188,227), new Vector(x_liberty+198,228)), new Color(112,168,165));
        createPoly(g, new Triangle(new Vector(x_liberty+193,217), new Vector(x_liberty+188,227), new Vector(x_liberty+187,217)), new Color(108,169,157));
        createPoly(g, new Triangle(new Vector(x_liberty+180,218), new Vector(x_liberty+188,227), new Vector(x_liberty+187,217)), new Color(153,198,192));
        createPoly(g, new Triangle(new Vector(x_liberty+180,218), new Vector(x_liberty+183,213), new Vector(x_liberty+179,210)), new Color(62,107,104));
        createPoly(g, new Triangle(new Vector(x_liberty+180,218), new Vector(x_liberty+171,211), new Vector(x_liberty+179,211)), new Color(153,198,192));
        createPoly(g, new Triangle(new Vector(x_liberty+175,205), new Vector(x_liberty+171,211), new Vector(x_liberty+179,211)), new Color(104,169,160));
        createPoly(g, new Triangle(new Vector(x_liberty+175,205), new Vector(x_liberty+180,201), new Vector(x_liberty+179,211)), new Color(104,169,160));
        createPoly(g, new Triangle(new Vector(x_liberty+175,205), new Vector(x_liberty+180,201), new Vector(x_liberty+176,198)), new Color(104,169,160));
        createPoly(g, new Triangle(new Vector(x_liberty+187,193), new Vector(x_liberty+180,201), new Vector(x_liberty+176,198)), new Color(104,169,160));
        createPoly(g, new Triangle(new Vector(x_liberty+187,193), new Vector(x_liberty+178,192), new Vector(x_liberty+176,198)), new Color(209,228,225));
        createPoly(g, new Triangle(new Vector(x_liberty+187,193), new Vector(x_liberty+178,192), new Vector(x_liberty+183,188)), new Color(209,228,225));
        createPoly(g, new Triangle(new Vector(x_liberty+187,193), new Vector(x_liberty+189,187), new Vector(x_liberty+183,188)), new Color(209,228,225));
        createPoly(g, new Triangle(new Vector(x_liberty+187,193), new Vector(x_liberty+189,187), new Vector(x_liberty+192,193)), new Color(186,209,197));
        createPoly(g, new Triangle(new Vector(x_liberty+195,188), new Vector(x_liberty+189,187), new Vector(x_liberty+192,193)), new Color(209,228,225));
        createPoly(g, new Triangle(new Vector(x_liberty+203,198), new Vector(x_liberty+198,201), new Vector(x_liberty+192,193)), new Color(104,169,160));
        createPoly(g, new Triangle(new Vector(x_liberty+195,188), new Vector(x_liberty+200,192), new Vector(x_liberty+192,193)), new Color(209,228,225));
        createPoly(g, new Triangle(new Vector(x_liberty+203,198), new Vector(x_liberty+200,192), new Vector(x_liberty+192,193)), new Color(209,228,225));
        createPoly(g, new Triangle(new Vector(x_liberty+203,198), new Vector(x_liberty+198,201), new Vector(x_liberty+203,208)), new Color(104,169,160));
        createPoly(g, new Triangle(new Vector(x_liberty+198,208), new Vector(x_liberty+198,201), new Vector(x_liberty+203,208)), new Color(104,169,160));
        createPoly(g, new Triangle(new Vector(x_liberty+198,208), new Vector(x_liberty+199,214), new Vector(x_liberty+203,208)), new Color(104,169,160));
        createPoly(g, new Triangle(new Vector(x_liberty+205,214), new Vector(x_liberty+199,214), new Vector(x_liberty+203,208)), new Color(104,169,160));
        createPoly(g, new Triangle(new Vector(x_liberty+205,214), new Vector(x_liberty+199,214), new Vector(x_liberty+203,217)), new Color(104,169,160));
        createPoly(g, new Triangle(new Vector(x_liberty+199,221), new Vector(x_liberty+199,214), new Vector(x_liberty+203,217)), new Color(104,169,160));
        createPoly(g, new Triangle(new Vector(x_liberty+199,221), new Vector(x_liberty+199,214), new Vector(x_liberty+193,217)), new Color(104,169,160));
        createPoly(g, new Triangle(new Vector(x_liberty+187,217), new Vector(x_liberty+183,213), new Vector(x_liberty+180,218)), new Color(104,169,160));
        createPoly(g, new Triangle(new Vector(x_liberty+183,202), new Vector(x_liberty+183,213), new Vector(x_liberty+186,208)), new Color(180,213,207));
        createPoly(g, new Triangle(new Vector(x_liberty+183,202), new Vector(x_liberty+180,201), new Vector(x_liberty+179,210)), new Color(180,213,207));
        createPoly(g, new Triangle(new Vector(x_liberty+183,202), new Vector(x_liberty+183,213), new Vector(x_liberty+179,210)), new Color(180,213,207));
        createPoly(g, new Triangle(new Vector(x_liberty+183,202), new Vector(x_liberty+184,197), new Vector(x_liberty+180,201)), new Color(180,213,207));
        createPoly(g, new Triangle(new Vector(x_liberty+183,202), new Vector(x_liberty+184,197), new Vector(x_liberty+189,198)), new Color(79,142,135));
        createPoly(g, new Triangle(new Vector(x_liberty+187,193), new Vector(x_liberty+184,197), new Vector(x_liberty+189,198)), new Color(209,228,225));
        createPoly(g, new Triangle(new Vector(x_liberty+187,193), new Vector(x_liberty+192,193), new Vector(x_liberty+189,198)), new Color(209,228,225));    
        createPoly(g, new Triangle(new Vector(x_liberty+195,197), new Vector(x_liberty+192,193), new Vector(x_liberty+189,198)), new Color(209,228,225));
        createPoly(g, new Triangle(new Vector(x_liberty+195,197), new Vector(x_liberty+194,202), new Vector(x_liberty+189,198)), new Color(79,142,135));  
        createPoly(g, new Triangle(new Vector(x_liberty+195,197), new Vector(x_liberty+194,202), new Vector(x_liberty+198,201)), new Color(180,213,207));  
        createPoly(g, new Triangle(new Vector(x_liberty+198,208), new Vector(x_liberty+194,202), new Vector(x_liberty+198,201)), new Color(180,213,207)); 
        createPoly(g, new Triangle(new Vector(x_liberty+198,208), new Vector(x_liberty+194,202), new Vector(x_liberty+193,208)), new Color(237,244,241)); 
        createPoly(g, new Triangle(new Vector(x_liberty+190,206), new Vector(x_liberty+194,202), new Vector(x_liberty+193,208)), new Color(237,244,241));
        createPoly(g, new Triangle(new Vector(x_liberty+189,198), new Vector(x_liberty+194,202), new Vector(x_liberty+190,205)), new Color(237,244,241));
        createPoly(g, new Triangle(new Vector(x_liberty+189,198), new Vector(x_liberty+194,202), new Vector(x_liberty+190,205)), new Color(237,244,241));
        createPoly(g, new Triangle(new Vector(x_liberty+189,198), new Vector(x_liberty+188,205), new Vector(x_liberty+190,205)), new Color(237,244,241));
        createPoly(g, new Triangle(new Vector(x_liberty+189,198), new Vector(x_liberty+188,205), new Vector(x_liberty+183,202)), new Color(237,244,241));
        createPoly(g, new Triangle(new Vector(x_liberty+186,208), new Vector(x_liberty+188,205), new Vector(x_liberty+183,202)), new Color(237,244,241));
        createPoly(g, new Triangle(new Vector(x_liberty+186,208), new Vector(x_liberty+183,213), new Vector(x_liberty+188,210)), new Color(237,244,241));
        createPoly(g, new Triangle(new Vector(x_liberty+189,213), new Vector(x_liberty+183,213), new Vector(x_liberty+188,210)), new Color(237,244,241));
        createPoly(g, new Triangle(new Vector(x_liberty+189,213), new Vector(x_liberty+190,210), new Vector(x_liberty+188,210)), new Color(237,244,241));
        createPoly(g, new Triangle(new Vector(x_liberty+189,213), new Vector(x_liberty+190,210), new Vector(x_liberty+190,213)), new Color(237,244,241));
        createPoly(g, new Triangle(new Vector(x_liberty+189,213), new Vector(x_liberty+190,210), new Vector(x_liberty+190,213)), new Color(237,244,241));
        createPoly(g, new Triangle(new Vector(x_liberty+196,213), new Vector(x_liberty+190,210), new Vector(x_liberty+190,213)), new Color(237,244,241));
        createPoly(g, new Triangle(new Vector(x_liberty+196,213), new Vector(x_liberty+190,210), new Vector(x_liberty+198,208)), new Color(237,244,241));
        createPoly(g, new Triangle(new Vector(x_liberty+196,213), new Vector(x_liberty+199,214), new Vector(x_liberty+198,208)), new Color(145,180,142));
        createPoly(g, new Triangle(new Vector(x_liberty+196,213), new Vector(x_liberty+199,214), new Vector(x_liberty+193,217)), new Color(145,180,142));
        createPoly(g, new Triangle(new Vector(x_liberty+196,213), new Vector(x_liberty+190,213), new Vector(x_liberty+193,217)), new Color(171,209,195));
        createPoly(g, new Triangle(new Vector(x_liberty+187,217), new Vector(x_liberty+190,213), new Vector(x_liberty+193,217)), new Color(171,209,195));
        createPoly(g, new Triangle(new Vector(x_liberty+187,217), new Vector(x_liberty+190,213), new Vector(x_liberty+183,213)), new Color(171,209,195));
        createPoly(g, new Triangle(new Vector(x_liberty+188,206), new Vector(x_liberty+190,205), new Vector(x_liberty+188,205)), new Color(94,138,130));
        createPoly(g, new Triangle(new Vector(x_liberty+188,206), new Vector(x_liberty+190,205), new Vector(x_liberty+190,206)), new Color(94,138,130));
        createPoly(g, new Triangle(new Vector(x_liberty+186,208), new Vector(x_liberty+188,210), new Vector(x_liberty+188,206)), new Color(128,180,167));
        createPoly(g, new Triangle(new Vector(x_liberty+190,206), new Vector(x_liberty+188,210), new Vector(x_liberty+188,206)), new Color(128,180,167));
        createPoly(g, new Triangle(new Vector(x_liberty+190,206), new Vector(x_liberty+188,210), new Vector(x_liberty+190,210)), new Color(128,180,167));
        createPoly(g, new Triangle(new Vector(x_liberty+190,206), new Vector(x_liberty+193,208), new Vector(x_liberty+190,210)), new Color(128,180,167));
        createPoly(g, new Triangle(new Vector(x_liberty+176,198), new Vector(x_liberty+174,195), new Vector(x_liberty+178,192)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+174,190), new Vector(x_liberty+174,195), new Vector(x_liberty+178,192)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+174,190), new Vector(x_liberty+176,187), new Vector(x_liberty+178,192)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+179,184), new Vector(x_liberty+176,187), new Vector(x_liberty+178,192)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+179,184), new Vector(x_liberty+183,188), new Vector(x_liberty+178,192)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+179,184), new Vector(x_liberty+183,188), new Vector(x_liberty+183,183)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+187,182), new Vector(x_liberty+183,188), new Vector(x_liberty+183,183)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+187,182), new Vector(x_liberty+183,188), new Vector(x_liberty+189,187)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+187,182), new Vector(x_liberty+191,182), new Vector(x_liberty+189,187)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+195,188), new Vector(x_liberty+191,182), new Vector(x_liberty+189,187)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+195,188), new Vector(x_liberty+191,182), new Vector(x_liberty+196,182)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+195,188), new Vector(x_liberty+199,183), new Vector(x_liberty+196,182)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+195,188), new Vector(x_liberty+199,183), new Vector(x_liberty+203,187)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+195,188), new Vector(x_liberty+200,192), new Vector(x_liberty+203,187)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+204,190), new Vector(x_liberty+200,192), new Vector(x_liberty+203,187)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+204,190), new Vector(x_liberty+200,192), new Vector(x_liberty+204,193)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+204,195), new Vector(x_liberty+200,192), new Vector(x_liberty+204,193)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+204,195), new Vector(x_liberty+200,192), new Vector(x_liberty+203,198)), new Color(56,92,91));
        createPoly(g, new Triangle(new Vector(x_liberty+204,195), new Vector(x_liberty+220,194), new Vector(x_liberty+204,193)), new Color(98,139,134));
        createPoly(g, new Triangle(new Vector(x_liberty+203,187), new Vector(x_liberty+216,183), new Vector(x_liberty+204,190)), new Color(98,139,134));
        createPoly(g, new Triangle(new Vector(x_liberty+196,182), new Vector(x_liberty+207,172), new Vector(x_liberty+199,183)), new Color(98,139,134));
        createPoly(g, new Triangle(new Vector(x_liberty+191,182), new Vector(x_liberty+187,182), new Vector(x_liberty+188,167)), new Color(98,139,134));
        createPoly(g, new Triangle(new Vector(x_liberty+183,183), new Vector(x_liberty+169,173), new Vector(x_liberty+179,184)), new Color(98,139,134));
        createPoly(g, new Triangle(new Vector(x_liberty+176,187), new Vector(x_liberty+164,188), new Vector(x_liberty+174,190)), new Color(98,139,134));
        createPoly(g, new Triangle(new Vector(x_liberty+166,195), new Vector(x_liberty+174,195), new Vector(x_liberty+174,193)), new Color(98,139,134));
        createPoly(g, new Triangle(new Vector(x_liberty+165,233), new Vector(x_liberty+159,265), new Vector(x_liberty+172,249)), new Color(190,223,216));
        
         //sun
        createPoly(g, new Triangle(new Vector(496,29), new Vector(512,27), new Vector(508,33)), new Color(247, 237, 97));
        createPoly(g, new Triangle(new Vector(529,32), new Vector(512,27), new Vector(508,33)), new Color(247, 218, 63));
        createPoly(g, new Triangle(new Vector(499,38), new Vector(496,29), new Vector(508,33)), new Color(247, 218, 63));
        createPoly(g, new Triangle(new Vector(499,38), new Vector(530,53), new Vector(508,33)), new Color(244, 235, 70));
        createPoly(g, new Triangle(new Vector(529,32), new Vector(530,53), new Vector(508,33)), new Color(246, 218, 62));
        createPoly(g, new Triangle(new Vector(499,38), new Vector(496,29), new Vector(479,42)), new Color(249, 218, 58));
        createPoly(g, new Triangle(new Vector(499,38), new Vector(482,49), new Vector(479,42)), new Color(236, 203, 46));
        createPoly(g, new Triangle(new Vector(470,60), new Vector(482,49), new Vector(479,42)), new Color(215, 123, 37));
        createPoly(g, new Triangle(new Vector(499,38), new Vector(482,49), new Vector(530,53)), new Color(254, 197, 64));
        createPoly(g, new Triangle(new Vector(543,44), new Vector(529,32), new Vector(530,53)), new Color(244, 235, 96));
        createPoly(g, new Triangle(new Vector(543,44), new Vector(549,59), new Vector(530,53)), new Color(248, 220, 93));
        createPoly(g, new Triangle(new Vector(510,65), new Vector(482,49), new Vector(530,53)), new Color(251, 221, 60));
        createPoly(g, new Triangle(new Vector(470,60), new Vector(482,49), new Vector(490,74)), new Color(249, 155, 39));
        createPoly(g, new Triangle(new Vector(510,65), new Vector(482,49), new Vector(490,74)), new Color(254, 197, 45));
        createPoly(g, new Triangle(new Vector(470,73), new Vector(470,60), new Vector(490,74)), new Color(225, 127, 38));
        createPoly(g, new Triangle(new Vector(470,73), new Vector(475,87), new Vector(490,74)), new Color(215, 123, 38));
        createPoly(g, new Triangle(new Vector(491,90), new Vector(475,87), new Vector(490,74)), new Color(249, 155, 39));
        createPoly(g, new Triangle(new Vector(491,90), new Vector(475,87), new Vector(482,97)), new Color(214, 123, 38));
        createPoly(g, new Triangle(new Vector(491,90), new Vector(487,101), new Vector(482,97)), new Color(198, 111, 40));
        createPoly(g, new Triangle(new Vector(491,90), new Vector(487,101), new Vector(507,91)), new Color(225, 127, 38));
        createPoly(g, new Triangle(new Vector(510,65), new Vector(490,74), new Vector(507,91)), new Color(245, 236, 95));
        createPoly(g, new Triangle(new Vector(491,90), new Vector(490,74), new Vector(507,91)), new Color(255, 209, 46));
        createPoly(g, new Triangle(new Vector(502,107), new Vector(487,101), new Vector(507,91)), new Color(249, 156, 39));
        createPoly(g, new Triangle(new Vector(502,107), new Vector(518,108), new Vector(507,91)), new Color(229, 139, 43));
        createPoly(g, new Triangle(new Vector(536,99), new Vector(518,108), new Vector(507,91)), new Color(224, 126, 37));
        createPoly(g, new Triangle(new Vector(530,71), new Vector(510,65), new Vector(507,91)), new Color(247, 218, 62));
        createPoly(g, new Triangle(new Vector(530,71), new Vector(536,99), new Vector(507,91)), new Color(254, 196, 46));
        createPoly(g, new Triangle(new Vector(530,71), new Vector(536,99), new Vector(548,80)), new Color(245, 219, 62));
        createPoly(g, new Triangle(new Vector(530,71), new Vector(549,59), new Vector(530,53)), new Color(247, 218, 61));
        createPoly(g, new Triangle(new Vector(530,71), new Vector(510,65), new Vector(530,53)), new Color(246, 236, 95));
        createPoly(g, new Triangle(new Vector(530,71), new Vector(549,59), new Vector(548,80)), new Color(246, 236, 95));
        
        //Cloud 1
        /*int x = 0;   int y = 0;
        createPoly(g, new Triangle(new Vector(x+316,y+56), new Vector(x+314,y+48), new Vector(x+321,y+48)), new Color(187,198,214));
        createPoly(g, new Triangle(new Vector(x+316,y+56), new Vector(x+328,y+56), new Vector(x+321,y+48)), new Color(172,189,208));
        createPoly(g, new Triangle(new Vector(x+337,y+47), new Vector(x+328,y+56), new Vector(x+321,y+48)), new Color(187,198,214));
        createPoly(g, new Triangle(new Vector(x+314,y+48), new Vector(x+320,y+38), new Vector(x+321,y+48)), new Color(172,189,208));
        createPoly(g, new Triangle(new Vector(x+327,y+32), new Vector(x+320,y+38), new Vector(x+321,y+48)), new Color(220,221,225));
        createPoly(g, new Triangle(new Vector(x+327,y+32), new Vector(x+337,y+47), new Vector(x+321,y+48)), new Color(220,221,225));
        createPoly(g, new Triangle(new Vector(x+327,y+32), new Vector(x+337,y+47), new Vector(x+343,y+33)), new Color(220,221,225));
        createPoly(g, new Triangle(new Vector(x+351,y+49), new Vector(x+337,y+47), new Vector(x+343,y+33)), new Color(199,204,207));
        createPoly(g, new Triangle(new Vector(x+351,y+49), new Vector(x+337,y+47), new Vector(x+343,y+56)), new Color(179,186,197));
        createPoly(g, new Triangle(new Vector(x+328,y+56), new Vector(x+337,y+47), new Vector(x+343,y+56)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+328,y+56), new Vector(x+337,y+47), new Vector(x+343,y+56)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+328,y+56), new Vector(x+346,y+63), new Vector(x+343,y+56)), new Color(179,186,197));
        createPoly(g, new Triangle(new Vector(x+362,y+60), new Vector(x+346,y+63), new Vector(x+343,y+56)), new Color(179,186,197));
        createPoly(g, new Triangle(new Vector(x+362,y+60), new Vector(x+351,y+49), new Vector(x+343,y+56)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+362,y+60), new Vector(x+351,y+49), new Vector(x+363,y+36)), new Color(187,198,214));
        createPoly(g, new Triangle(new Vector(x+343,y+33), new Vector(x+351,y+49), new Vector(x+363,y+36)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+343,y+33), new Vector(x+351,y+23), new Vector(x+363,y+36)), new Color(232,230,230));
        createPoly(g, new Triangle(new Vector(x+372,y+22), new Vector(x+351,y+23), new Vector(x+363,y+36)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+372,y+22), new Vector(x+378,y+35), new Vector(x+363,y+36)), new Color(232,230,230));
        createPoly(g, new Triangle(new Vector(x+374,y+54), new Vector(x+378,y+35), new Vector(x+363,y+36)), new Color(199,204,207));
        createPoly(g, new Triangle(new Vector(x+374,y+54), new Vector(x+362,y+60), new Vector(x+363,y+36)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+374,y+54), new Vector(x+362,y+60), new Vector(x+379,y+60)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+374,y+54), new Vector(x+378,y+35), new Vector(x+379,y+60)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+389,y+51), new Vector(x+378,y+35), new Vector(x+379,y+60)), new Color(199,204,207));
        createPoly(g, new Triangle(new Vector(x+389,y+51), new Vector(x+403,y+52), new Vector(x+379,y+60)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+389,y+51), new Vector(x+403,y+52), new Vector(x+394,y+44)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+389,y+51), new Vector(x+378,y+35), new Vector(x+394,y+44)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+392,y+31), new Vector(x+378,y+35), new Vector(x+394,y+44)), new Color(199,204,207));
        createPoly(g, new Triangle(new Vector(x+392,y+31), new Vector(x+378,y+35), new Vector(x+372,y+22)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+392,y+31), new Vector(x+403,y+37), new Vector(x+394,y+44)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+392,y+31), new Vector(x+403,y+37), new Vector(x+409,y+27)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+419,y+32), new Vector(x+403,y+37), new Vector(x+409,y+27)), new Color(199,204,207));
        createPoly(g, new Triangle(new Vector(x+419,y+32), new Vector(x+403,y+37), new Vector(x+420,y+48)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+419,y+32), new Vector(x+427,y+42), new Vector(x+420,y+48)), new Color(199,204,207));
        createPoly(g, new Triangle(new Vector(x+423,y+53), new Vector(x+427,y+42), new Vector(x+420,y+48)), new Color(199,204,207));
        createPoly(g, new Triangle(new Vector(x+423,y+53), new Vector(x+403,y+52), new Vector(x+420,y+48)), new Color(217,218,222));
        createPoly(g, new Triangle(new Vector(x+403,y+37), new Vector(x+403,y+52), new Vector(x+420,y+48)), new Color(199,204,207));
        createPoly(g, new Triangle(new Vector(x+403,y+37), new Vector(x+403,y+52), new Vector(x+394,y+44)), new Color(187,198,214));*/
        
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
