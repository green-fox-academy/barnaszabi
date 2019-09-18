import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class EnvelopStar {

    public static void mainDraw(Graphics graphics)
    {
        int x = 160;
        int y =0;
        int endX = 160;
        int endY = 160;
        int incrementOne = 10;
        int incrementTwo = 10;
        graphics.setColor(Color.green);
        for (int i = 0; i < 4; i++)
        {
            if (i == 1)
            {
                incrementOne = - 10;
            }
            if (i == 2)
            {
                y = 320;
                incrementTwo = - 10;
            }
            if (i == 3)
            {
                incrementOne = 10;
            }
            for (int j = 0; j < 17; j++)
            {
                graphics.drawLine(x,y,endX,endY);
                endX += incrementOne;
                y += incrementTwo;
            }
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