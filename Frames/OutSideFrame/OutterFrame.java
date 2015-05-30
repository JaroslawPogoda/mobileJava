package OutSideFrame;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class OutterFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int c=1;
	public OutterFrame(){
		super();
		DefaultSettings();
	}

	private void DefaultSettings() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(30, 30, 300, 300);
	    setLayout(new GridLayout(1,4));
	    setVisible(true);
	}
	public void setContentPane(Component obj){
	    getContentPane().add(obj,c++);
	}
}
