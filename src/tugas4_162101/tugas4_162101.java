package tugas4_162101;

import java.awt.*;
import javax.swing.*;
   
public class tugas4_162101 extends JApplet{
    
    public static void main (String [] args){
        JFrame frame= new JFrame ();
        JApplet applet= new tugas4_162101();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
    }
    public void init () 
    { 
        JPanel panel4 = new Panel2D ();
        getContentPane().add(panel4);
    }
    class Panel2D extends JPanel 
    {
        int awal = 0;
        int mulai = 0;
        public Panel2D ()
        {
            setPreferredSize(new Dimension(570, 570));
            setBackground(Color.CYAN); //BACKGROUND
        }
        public void paintComponent (Graphics g) 
        {
            super.paintComponent (g);
            Graphics2D g2= (Graphics2D) g;
            g.setColor(Color.CYAN); //langit
            
            //========== mobil
            g.setColor(Color.gray);
            g.fillRect(205,305,100,30 ); //badan bawah
            g.fillOval(207,278,104,45); //badan atas
            
            g.setColor(Color.blue);
            g.fillRect(210,305,100,30 ); //badan bawah
            g.fillOval(210,280,100,45); //badan atas
            g.fillArc (180,298,60,70,0,180);// atas ban
            g.fillArc (285,298,60,70,0,180);// atas ban
            
            g.setColor(Color.yellow);
            g.fillArc (318,301,23,23,0,80);// atas ban
            
            g.setColor(Color.black); //ban
            g.fillOval(198, 313, 32,32); //ban
            g.fillOval(298, 313, 32,32); //ban
            g.setColor(Color.white); //ban
            g.fillOval(204, 319, 20,20); //ban
            g.fillOval(304, 319, 20,20); //ban
            g.setColor(Color.red);
            g.fillArc (230,285,70,40,0,90);// atas ban
            g.setColor(Color.black);
            g.fillArc (234,286,64,36,0,90);// atas ban
            g.setColor(Color.red);
            g.fillArc (220,285,70,40,90,90);// atas ban
            g.setColor(Color.black);
            g.fillArc (223,286,68,36,90,90);// atas ban
            g.setColor(Color.red);
            g.fillRect(258,286,10,18 );
        }
    }
}
