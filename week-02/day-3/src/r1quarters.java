import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class r1quarters {
    public static void quarteredDraw(int divider, Graphics graphics)
    {
        int x = 30/(divider/2);
        int y = 0;
        int endX =320/(divider/2);
        int endY = 20/(divider/2);
        int half = 160;
        int secondX=0;
        int secondY = 30/(divider/2);
        int secondEndX=20/(divider/2);
        int secondEndY =320/(divider/2);
        for (int k = 0; k < 4; k++)
        {
            if (k == 1)
            {
                x = 30/(divider/2) + half;
                y = 0 + half;
                endX =320/(divider/2) + half;
                endY = 20/(divider/2) + half;
                secondX=0 + half;
                secondY = 30/(divider/2) + half;
                secondEndX=20/(divider/2) + half;
                secondEndY =320/(divider/2) + half;
            }
            if (k == 2)
            {
                x = 30/(divider/2) + half;
                y = 0 ;
                endX =320/(divider/2) + half;
                endY = 20/(divider/2);
                secondX=0 + half;
                secondY = 30/(divider/2);
                secondEndX=20/(divider/2) + half;
                secondEndY =320/(divider/2);
            }
            if (k == 3)
            {
                x = 30/(divider/2);
                y = 0 +half;
                endX =320/(divider/2) ;
                endY = 20/(divider/2)+half;
                secondX=0;
                secondY = 30/(divider/2)+half;
                secondEndX=20/(divider/2);
                secondEndY =320/(divider/2)+half;
            }
            graphics.setColor(new Color(128,0,128));
            for (int i = 0; i < 15; i++)
            {
                graphics.drawLine(x,y,endX,endY);
                endY+=20/(divider/2);
                x+=(20/(divider/2));
            }
            graphics.setColor(Color.green);
            for (int i = 0; i < 15; i++)
            {
                graphics.drawLine(secondX,secondY,secondEndX,secondEndY);
                secondEndX += 20/(divider/2);
                secondY += 20/(divider/2);
            }
        }
    }
    public static void mainDraw(Graphics graphics)
    {
        quarteredDraw(4,graphics);
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