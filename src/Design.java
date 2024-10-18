import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Design extends JComponent implements ActionListener {
    int w, h;
    public JLabel minion;
    Timer timer = new Timer(100, this);

    public Design() throws IOException {
        BufferedImage img = ImageIO.read(new File("C:\\08_JAVA\\Keyboard\\src\\Minion.png"));
        w=img.getWidth();
        h=img.getHeight();
        minion=new JLabel(new ImageIcon(img));
        minion.setBounds(Main.coordX,Main.coordY,w,h);
        Main.Example.add(minion);
        timer.start();
    }
   @Override
    public void actionPerformed(ActionEvent e) {
            minion.setBounds(Main.coordX , Main.coordY, w, h);
        }
    }
