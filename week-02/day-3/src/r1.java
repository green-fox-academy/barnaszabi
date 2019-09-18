import javax.swing.*;

import java.awt.*;
import java.awt.geom.QuadCurve2D;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class r1 {
    public static void mainDraw(Graphics graphics)
    {
        int x = 30;
        int y = 0;
        int end = 20;
        graphics.setColor(new Color(128,0,128));
        for (int i = 0; i < 20; i++)
        {
            graphics.drawLine(x,y,320,end);
            end+=20;
            x+=20;
        }
        y=30;
        x=0;
        end=20;
        graphics.setColor(Color.green);
        for (int i = 0; i < 20; i++)
        {
            graphics.drawLine(x,y,end,320);
            end += 20;
            y += 20;
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}