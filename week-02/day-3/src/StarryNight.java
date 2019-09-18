import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static int randomNumber(int min, int max)
    {
        int rand;
        do
        {
            rand = (int)(Math.random()*max);
        }
        while (rand < min);
        return rand;
    }
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        graphics.setColor(Color.black);
        graphics.fillRect(0,0,1360,728);
        for (int i = 0; i < 10000; i++)
        {
            graphics.setColor(new Color(randomNumber(200,226), randomNumber(200,225), randomNumber(200,225)));
            graphics.fillRect(randomNumber(0,1360),randomNumber(0,728), randomNumber(0,2), randomNumber(0,2));
        }
    }

    // Don't touch the code below
    static int WIDTH = 1360;
    static int HEIGHT = 728;

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