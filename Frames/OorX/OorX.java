package OorX;

import java.awt.*;
import java.awt.event.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import Main.Launchers;

public class OorX extends JFrame implements ActionListener{
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	
	private int numClicks=0;
	private boolean win = false;
	private String[] filled ;
	JMenu OorXMenu;
	JMenuBar OorXBar;
	JMenuItem reset;
	JPanel ContentPane;
	
	public OorX(){
		super();
		InitiatieSettings();
		button();
		buttonAction();
		filled=new String[10];
		for(int i=0;i<10;i++){
			filled[i]="q";
		}
		menuAction();
	}

	private void menuAction() {
		reset= new JMenuItem("Reset");
		reset.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					reset();
			}

			private void reset() {
				numClicks=0;
				win=false;
				for(int i=0;i<10;i++){
					filled[i]="q";
				}
				b1.setText("");
	        	b1.setEnabled(true);
	        	b2.setText("");
	        	b2.setEnabled(true);
	        	b3.setText("");
	        	b3.setEnabled(true);
	        	b4.setText("");
	        	b4.setEnabled(true);
	        	b5.setText("");
	        	b5.setEnabled(true);
	        	b6.setText("");
	        	b6.setEnabled(true);
	        	b7.setText("");
	        	b7.setEnabled(true);
	        	b8.setText("");
	        	b8.setEnabled(true);
	        	b9.setText("");
	        	b9.setEnabled(true);
				
			}

			
		});
		OorXMenu.add(reset);
		
	}

	private void InitiatieSettings() {
		setLayout(new BorderLayout());
		ContentPane= new JPanel();
		ContentPane.setLayout(new GridLayout(4,4));
		add(ContentPane,BorderLayout.CENTER);
		setSize(400,300);
		setVisible(true);
		OorXBar= new JMenuBar();
		OorXMenu= new JMenu("file");
		OorXBar.add(OorXMenu);
		add(OorXBar,BorderLayout.NORTH);
		
	}
	private void button(){
		b1=new JButton();
		b2=new JButton();
		b3=new JButton();
		b4=new JButton();
		b5=new JButton();
		b6=new JButton();
		b7=new JButton();
		b8=new JButton();
		b9=new JButton();
		b1.setSize(40, 40);
		b2.setSize(40, 40);
		b3.setSize(40, 40);
		b4.setSize(40, 40);
		b5.setSize(40, 40);
		b6.setSize(40, 40);
		b7.setSize(40, 40);
		b8.setSize(40, 40);
		b9.setSize(40, 40);
		ContentPane.add(b1);
		ContentPane.add(b2);
		ContentPane.add(b3);
		ContentPane.add(b4);
		ContentPane.add(b5);
		ContentPane.add(b6);
		ContentPane.add(b7);
		ContentPane.add(b8);
		ContentPane.add(b9);
	}
	private void buttonAction(){
		b1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {		
			
	         
	         if(numClicks%2==1){
	        	 b1.setText("X");
	        	 b1.setEnabled(false);
	        	 if(checkIfWin(1,"X"))return;
	         }
	         else{
	        	 b1.setText("O");
	        	 b1.setEnabled(false);
	        	 if(checkIfWin(1,"O"))return;
	         }
	         numClicks++;
				}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {		
				
		         
		         if(numClicks%2==1){
		        	 b2.setText("X");
		        	 b2.setEnabled(false);
		        	 if(checkIfWin(2,"X"))return;
		         }
		         else{
		        	 b2.setText("O");
		        	 b2.setEnabled(false);
		        	 if(checkIfWin(2,"O"))return;
		         }
		         numClicks++;
					}
			});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {		
				
		         
		         if(numClicks%2==1){
		        	 b3.setText("X");
		        	 b3.setEnabled(false);
		        	 if(checkIfWin(3,"X"))return;
		         }
		         else{
		        	 b3.setText("O");
		        	 b3.setEnabled(false);
		        	 if(checkIfWin(3,"O"))return;
		         }
		         numClicks++;
					}
			});
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {		
				
		         
		         if(numClicks%2==1){
		        	 b4.setText("X");
		        	 b4.setEnabled(false);
		        	 if(checkIfWin(4,"X"))return;
		        	 
		         }
		         else{
		        	 b4.setText("O");
		        	 b4.setEnabled(false);
		        	 if(checkIfWin(4,"O"))return;
		         }numClicks++;
					}
			});
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {		
				
		         
		         if(numClicks%2==1){
		        	 b5.setText("X");
		        	 b5.setEnabled(false);
		        	 if(checkIfWin(5,"X"))return;
		         }
		         else{
		        	 b5.setText("O");
		        	 b5.setEnabled(false);
		        	 if(checkIfWin(5,"O"))return;
		         }numClicks++;
					}
			});
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {		
				
		         
		         if(numClicks%2==1){
		        	 b6.setText("X");
		        	 b6.setEnabled(false);
		        	 if(checkIfWin(6,"X"))return;
		         }
		         else{
		        	 b6.setText("O");
		        	 b6.setEnabled(false);
		        	 if(checkIfWin(6,"O"))return;
		         }numClicks++;
					}
			});
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {		
				
		         
		         if(numClicks%2==1){
		        	 b7.setText("X");
		        	 b7.setEnabled(false);
		        	 if(checkIfWin(7,"X"))return;
		         }
		         else{
		        	 b7.setText("O");
		        	 b7.setEnabled(false);
		        	 if(checkIfWin(7,"O"))return;
		         }numClicks++;
					}
			});
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {		
				
		         
		         if(numClicks%2==1){
		        	 b8.setText("X");
		        	 b8.setEnabled(false);
		        	 if(checkIfWin(8,"X"))return;
		         }
		         else{
		        	 b8.setText("O");
		        	 b8.setEnabled(false);
		        	 if(checkIfWin(8,"O"))return;
		         }numClicks++;
					}

			
			});
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {		
				
		         
		         if(numClicks%2==1){
		        	 b9.setText("X");
		        	 b9.setEnabled(false);
		        	 if(checkIfWin(9,"X"))return;
		        	 
		         }
		         else{
		        	 b9.setText("O");
		        	 b9.setEnabled(false);
		        	 if(checkIfWin(9,"O"))
		        		 return;
		         }numClicks++;
					}

			
			});
	}
	private boolean checkIfWin(int i, String string) {
		filled[i-1]=string;
		if((filled[0].equals(string)&&filled[1].equals(string)&&filled[2].equals(string))||
				(filled[3].equals(string)&&filled[4].equals(string)&&filled[5].equals(string))||
				(filled[6].equals(string)&&filled[7].equals(string)&&filled[8].equals(string))||
				(filled[0].equals(string)&&filled[3].equals(string)&&filled[6].equals(string))||
				(filled[1].equals(string)&&filled[4].equals(string)&&filled[7].equals(string))||
				(filled[2].equals(string)&&filled[5].equals(string)&&filled[8].equals(string))||
				(filled[0].equals(string)&&filled[4].equals(string)&&filled[8].equals(string))||
				(filled[6].equals(string)&&filled[4].equals(string)&&filled[2].equals(string)))
			win=true;
		if(win){
			System.out.print("The winner is :"+string);
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);
		}
		else if(numClicks>=8){System.out.print("reset");}
		return win;
		
	}
}

