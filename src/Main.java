import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class Main extends JFrame implements KeyListener {
         static JFrame Example = new JFrame("Мытарства миньона");
         static int coordX, coordY;
         {coordX=330;
          coordY=150;}

    public static void main(String[] args) throws IOException {
        Main t=new Main();
        Design d1 = new Design();
        Example.addKeyListener(t);
        Example.add(d1);
        Example.setBounds(0, 0, 800, 500);
        Example.setLocationRelativeTo(null);
        Example.setResizable(true);
        Example.getContentPane().setBackground(Color.DARK_GRAY);
        Example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Example.setVisible(true);
    }
    @Override
    public void keyReleased(KeyEvent e) { }
    @Override
    public void keyTyped(KeyEvent e) { }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_RIGHT) {Main.coordX=Main.coordX<=690?Main.coordX+5:-10;}
        if (e.getKeyCode()==KeyEvent.VK_LEFT) {Main.coordX=Main.coordX>-10?Main.coordX-5:695;}
        if (e.getKeyCode()==KeyEvent.VK_UP)   {Main.coordY=Main.coordY>-10?Main.coordY-5:350;}
        if (e.getKeyCode()==KeyEvent.VK_DOWN) {Main.coordY=Main.coordY<=345?Main.coordY+5:-10;}
    }
}