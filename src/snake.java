import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class snake {


    private final int B_WIDTH = 300;
    private final int B_HEIGHT = 300;
    private final int DOT_SIZE = 10;
    private final int ALL_DOTS = 900;
    private final int RAND_POS = 29;
    private final int DELAY = 140;

    private final int x[] = new int[ALL_DOTS];
    private final int y[] = new int[ALL_DOTS];

    private void loadImages() {
        ImageIcon iid = new ImageIcon("./resources/dot.png");
        ball = iid.getImage();
        ImageIcon iia = new ImageIcon("./resoruces/apple.png");
        apple = iia.getImage();
        ImageIcon iih = new ImageIcon("./resources/head.png");
        head = iih.getImage();
    }

    private void initGame() {
        dots = 3;

        for (int z = 0; z < dots; z++) {
            x[z] = 50 - z * 10;
            y[z] = 50;
        }

        locateApple();

        timer = new Timer(DELAY, this);
        timer.start();
    }

    private void checkApple() {
        if ((x[0] == apple_x) && (y[0] == apple_y)) {
            dots++;
            locateApple();
        }
    }
    
    private void locateApple() {

    }


// A snake should be able to move up, down, left, and right.
// A snake should make itself bigger when it eats an apple.
// When one apple gets eaten by a snake, the other apple randomly appears on the screen.
// Whenever a snake eats an apple, the score goes up by 100 points.
// When a snake makes a collision with a wall or itself, the game is finised.

// the size of snake width, height? how many pixels?


    public void move(int direction) {
        //direction 0, 1, 2, 3(?)
    }

    public boolean collision() {
        return true;
    }

    public int score() {
        return 100;
    }





}
