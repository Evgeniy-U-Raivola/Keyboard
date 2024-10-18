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
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_RIGHT) { if (Main.coordX<=690)  {Main.coordX+=5;} }
        if (e.getKeyCode()==KeyEvent.VK_LEFT)  { if (Main.coordX>-10)   {Main.coordX-=5;} }
        if (e.getKeyCode()==KeyEvent.VK_UP)    { if (Main.coordY>-10)   {Main.coordY-=5;} }
        if (e.getKeyCode()==KeyEvent.VK_DOWN)  { if (Main.coordY<=345)  {Main.coordY+=5;} }
    }
    @Override
    public void keyTyped(KeyEvent e) { }
    @Override
    public void keyPressed(KeyEvent e) {  }
}