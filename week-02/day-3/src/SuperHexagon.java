import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class SuperHexagon
{

    public static void mainDraw(Graphics graphics)
    {

        int section = 0;
        for (int i = 0; i < 2; i++)
        {
            int[] x = {180,200,210,200,180,170};
            int[] y = {0,0,20,40,40,20};
            int xIncrement;
            int yIncrement=y[3]-y[0];
            int height = 7;
            if (section == 0)
            {
                xIncrement=-(x[2]-x[0]);
            }
            else
            {
                xIncrement=x[2]-x[0];
            }
            for (int j = 0; j < 4; j++)
            {
                for (int k = 0; k < height; k++)
                {
                    graphics.drawPolygon(x,y,6);
                    y[0]+=yIncrement;
                    y[1]+=yIncrement;
                    y[2]+=yIncrement;
                    y[3]+=yIncrement;
                    y[4]+=yIncrement;
                    y[5]+=yIncrement;
                }
                x[0]+=xIncrement;
                x[1]+=xIncrement;
                x[2]+=xIncrement;
                x[3]+=xIncrement;
                x[4]+=xIncrement;
                x[5]+=xIncrement;
                y[0]-=yIncrement*height-(yIncrement/2);
                y[1]-=yIncrement*height-(yIncrement/2);
                y[2]-=yIncrement*height-(yIncrement/2);
                y[3]-=yIncrement*height-(yIncrement/2);
                y[4]-=yIncrement*height-(yIncrement/2);
                y[5]-=yIncrement*height-(yIncrement/2);
                height--;
            }
            section++;
        }
    }

    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

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