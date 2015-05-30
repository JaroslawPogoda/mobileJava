package TesterClasses;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class PaintSurface extends JComponent {
	  public void paint(Graphics g) {
	    Graphics2D g2 = (Graphics2D) g;

	    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	    Shape s = new Ellipse2D.Float(20, 50, 250, 150);
	    g2.setPaint(Color.BLACK);
	    g2.draw(s);
	  }
	}