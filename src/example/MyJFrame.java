package example;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class MyJFrame extends JFrame implements KeyListener {

    private MyJPanel panel;

    public MyJFrame() {
        super();
        panel = new MyJPanel();
        add(panel);
        pack();
        addKeyListener(this);
        repaint();
    }

    public static void main(String[] args) {
        MyJFrame window = new MyJFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setTitle("Test");
    }

    @Override
    public void repaint() {
        super.repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        panel.keyPressed(e);
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyReleased(KeyEvent e) { }
}
