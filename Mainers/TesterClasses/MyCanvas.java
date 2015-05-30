package TesterClasses;

import java.awt.Graphics;

import javax.swing.JComponent;

public class MyCanvas extends JComponent {

  public void paint(Graphics g) {
    g.drawString (Long.toString(System.currentTimeMillis()), 10, 30); 
    repaint(1000);
  }
}