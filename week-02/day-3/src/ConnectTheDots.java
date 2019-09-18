import javafx.scene.layout.HBox;

import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void connectDots (int[][] dots, Graphics graphics)
    {
        for (int i = 0; i < dots.length-1; i++)
        {
            for (int j = 0; j < dots[0].length-1; j++)
            {
                graphics.drawLine(dots[i][j], dots[i][j+1], dots[i+1][j], dots[i+1][j+1]);
            }
        }
    }
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] box = {{10, 10}, {290,  10}, {290, 290}, {10, 290},{10,10}};
        int[][] second =  {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},{120, 100}, {85, 130}, {50, 100}};
        connectDots(box, graphics);
        connectDots(second, graphics);
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