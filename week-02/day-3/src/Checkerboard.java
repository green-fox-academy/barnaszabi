import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int x = 0;
        int y = 0;
        int size = 30;
        int counterX = 0;
        int counterY = 0;
        do
        {
            do {
                if (counterY % 2 != 0)
                {
                    graphics.drawRect(x,y,size,size);
                }
                else
                {
                    graphics.fillRect(x,y,size,size);
                }
                counterY++;
                y += size;
            }
            while ((y < 320));
            y=0;
            if (counterX % 2 == 0)
            {
                graphics.fillRect(x,y,size,size);
            }
            else
            {
                graphics.drawRect(x,y,size,size);
            }
            x += size;
            counterX++;
        }
        while ((x < 320));

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