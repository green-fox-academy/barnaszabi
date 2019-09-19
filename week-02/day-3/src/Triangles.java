import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Triangles
{

    public static void mainDraw(Graphics graphics)
    {
        int[] x = new int[] {140,160,180};
        int[] y = new int[] {20,0,20};
        int xIncrement = x[2]-x[0];
        int yIncrement = y[0]-y[1];
        int xPush = xIncrement/2;
        int lineLength = 1;
        int width = 1;
        graphics.drawPolygon(x, y, 3);
        for (int i = 1; i < 8; i++)
        {

            x[0]-=xPush*width;
            x[1]-=xPush*width;
            x[2]-=xPush*width;
            y[0]+=yIncrement;
            y[1]+=yIncrement;
            y[2]+=yIncrement;
            graphics.drawPolygon(x, y, 3);
            for (int j = 0; j < lineLength; j++)
            {
                x[0]+=xIncrement;
                x[1]+=xIncrement;
                x[2]+=xIncrement;
                graphics.drawPolygon(x, y, 3);
            }
            lineLength+=1;
            width +=2;
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