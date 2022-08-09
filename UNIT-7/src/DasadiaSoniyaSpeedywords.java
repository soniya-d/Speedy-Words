//Name: Soniya Dasadia
//Date: Jan 11, 2021
//Purpose: Dasadia Soniya Speedy words
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

import javax.sound.sampled.AudioSystem;
import javax.swing.*;
import javax.swing.border.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.applet.Applet;
import java.applet.*;

public class DasadiaSoniyaSpeedywords extends JPanel implements ActionListener
{
	Panel p_card;  //to hold all of the screens
	Panel card1, card2, card3, card4, card5;
	CardLayout cdLayout = new CardLayout ();
	//display status on gamescreen
	JLabel picture;
	JLabel count;
	JLabel toString;
	SpeedyStack box = new SpeedyStack();
	int num=0;
	//Player score
	JButton score1;
	int a1 = 0;
	JButton score2;
	int a2 = 0;
	JButton score3;
	int a3 = 0;
	JButton score4;
	int a4 = 0;
	public DasadiaSoniyaSpeedywords ()
	{
		//set up screen order
		p_card = new Panel ();
		p_card.setLayout (cdLayout);
		//make the 4 screens
		initOpening ();
		initRules ();
		initGame ();
		screen4 ();
		setLayout (new BorderLayout ());
		initMenu (); 
		add ("Center", p_card);
	}
	//menu bar set up
	public void initMenu ()
	{
		JMenuBar menuBar = new JMenuBar ();
		JMenu menu;
		JMenuItem menuItem;

		menu = new JMenu ("File");
		menuBar.add (menu);

		menuItem = new JMenuItem ("Close");
		menuItem.addActionListener (this);
		menuItem.setActionCommand ("Close");
		menu.add (menuItem);

		menu = new JMenu ("Navigate");
		menuBar.add (menu);

		menuItem = new JMenuItem ("Opening");
		menuItem.addActionListener (this);
		menuItem.setActionCommand ("s1");
		menu.add (menuItem);

		menuItem = new JMenuItem ("Rules");
		menuItem.addActionListener (this);
		menuItem.setActionCommand ("s2");
		menu.add (menuItem);

		menuItem = new JMenuItem ("Play Game");
		menuItem.addActionListener (this);
		menuItem.setActionCommand ("s3");
		menu.add (menuItem);
		add ("North", menuBar);
	}

	//opening screen
	public void initOpening ()
	{ //Pre: p_card is a cdLayout, card1 is declared
		//Post: initializes opening screen's widgets.
		card1 = new Panel ();
		card1.setBackground(new Color(122, 157, 101));
		//title of game
		JLabel pic = new JLabel (createImageIcon("intro.jpeg"));
		add (pic);
		//move on to next screen
		JButton next = new JButton ("Next");
		next.setForeground (new Color(122, 157, 101));
		next.setPreferredSize (new Dimension (170, 50));
		next.setFont (new Font ("BUNGEE", Font.BOLD, 40));
		next.setActionCommand ("s2");
		next.addActionListener (this);
		//confirmation to play
		JOptionPane.showMessageDialog (null, "Click 'Ok' to play the game!", "Welcome to Speedy Words!", JOptionPane.ERROR_MESSAGE);
		card1.add (pic);
		card1.add (next);
		p_card.add ("1", card1);

	}
	//instruction screen
	public void initRules ()
	{ //Pre: p_card is a cdLayout, card1 is declared
		//Post: initializes opening screen's widgets.
		card2 = new Panel ();
		//background color
		card2.setBackground(new Color(122, 157, 101));
		//instructions picture
		JLabel pic = new JLabel (createImageIcon("howtoplay.jpeg"));
		add (pic);
		//next button
		JButton next = new JButton ("Next");
		next.setForeground (new Color(122, 157, 101));		
		next.setPreferredSize (new Dimension (170, 50));
		next.setFont (new Font ("BUNGEE", Font.BOLD, 40));
		next.setActionCommand ("s3");
		next.addActionListener (this);
		card2.add (pic);
		card2.add (next);
		p_card.add ("2", card2);
	}
	//gamescreen
	public void initGame ()
	{ //Pre: p_card is a cdLayout, card1 is declared
		//Post: initializes opening screen's widgets.
		//screen 3 is set up.
		card3 = new Panel ();
		//set background color
		card3.setBackground(new Color(122, 157, 101));
		JLabel pic = new JLabel (createImageIcon("title.jpeg"));
		add (pic);
		//resets screen to blank
		JButton reset = new JButton ("Reset");
		reset.addActionListener (this);
		reset.setActionCommand ("reset");
		reset.setFont (new Font ("BUNGEE", Font.BOLD, 12));
		reset.setForeground (new Color(122, 157, 101));		
		//adds a new card on deck
		JButton push = new JButton ("Push");
		push.addActionListener (this);
		push.setActionCommand ("push");
		push.setFont (new Font ("BUNGEE", Font.BOLD, 12));
		push.setForeground (new Color(122, 157, 101));		
		//removes a card from deck
		JButton pop = new JButton ("Pop");
		pop.addActionListener (this);
		pop.setActionCommand ("pop");
		pop.setFont (new Font ("BUNGEE", Font.BOLD, 12));
		pop.setForeground (new Color(122, 157, 101));		
		//reshuffles deck
		JButton shuffle = new JButton ("Shuffle");
		shuffle.addActionListener (this);
		shuffle.setActionCommand ("shuffle");
		shuffle.setFont (new Font ("BUNGEE", Font.BOLD, 12));
		shuffle.setForeground (new Color(122, 157, 101));	
		//game tour
		JButton info = new JButton ("Info");
		info.setFont (new Font ("BUNGEE", Font.BOLD, 12));
		info.setForeground (new Color(122, 157, 101));
		info.addActionListener (this);
		//finish screen 
		JButton next = new JButton ("Next");
		next.setFont (new Font ("BUNGEE", Font.BOLD, 12));
		next.setForeground (new Color(122, 157, 101));
		next.setActionCommand ("s4");
		next.addActionListener (this);
		//save progress button
		JButton save = new JButton ("Save");
		save.setActionCommand("save");
		save.setFont (new Font ("BUNGEE", Font.BOLD, 12));
		save.setForeground (new Color(122, 157, 101));
		save.addActionListener(this);
		//open progress button
		JButton open = new JButton ("open");
		open.setActionCommand("open");
		open.setFont (new Font ("BUNGEE", Font.BOLD, 12));
		open.setForeground (new Color(122, 157, 101));
		open.addActionListener(this);
		//blank card
		picture = new JLabel (createImageIcon ("base.jpeg"));
		//number of cards on deck
		count = new JLabel ("Count: 00");
		count.setFont (new Font ("BUNGEE", Font.BOLD, 20));
		count.setForeground (new Color(247, 230, 94));
		//category and letter
		toString = new JLabel ("No cards are currently showing");
		toString.setFont (new Font ("BUNGEE", Font.BOLD, 20));
		toString.setForeground (new Color(247, 230, 94));
		//player 1 score
		score1= new JButton ("Player 1: 000");
		score1.setActionCommand("score1");
		score1.addActionListener (this);
		score1.setForeground (new Color(122, 157, 101));		
		score1.setPreferredSize (new Dimension (170, 20));
		score1.setFont (new Font ("BUNGEE", Font.BOLD, 15));
		//player 2 score
		score2= new JButton ("Player 2: 000");
		score2.setActionCommand("score2");
		score2.addActionListener (this);
		score2.setForeground (new Color(122, 157, 101));		
		score2.setPreferredSize (new Dimension (170, 20));
		score2.setFont (new Font ("BUNGEE", Font.BOLD, 15));
		//player 3 score
		score3= new JButton ("Player 3: 000");
		score3.setActionCommand("score3");
		score3.addActionListener (this);
		score3.setForeground (new Color(122, 157, 101));		
		score3.setPreferredSize (new Dimension (170, 20));
		score3.setFont (new Font ("BUNGEE", Font.BOLD, 15));
		//player 4 score
		score4= new JButton ("Player 4: 000");
		score4.setActionCommand("score4");
		score4.addActionListener (this);
		score4.setForeground (new Color(122, 157, 101));		
		score4.setPreferredSize (new Dimension (170, 20));
		score4.setFont (new Font ("BUNGEE", Font.BOLD, 15));
		//add everything on screen
		card3.add (pic);
		card3.add (reset);
		card3.add (push);
		card3.add (pop);
		card3.add (shuffle);
		card3.add (info);
		card3.add (next);
		card3.add (count);
		card3.add (toString);
		card3.add (score1);
		card3.add (score2);
		card3.add (score3);
		card3.add (score4);
		//layout 1
		Panel dir1 = new Panel (new GridLayout (2, 4));
		JLabel filler1 = new JLabel ("");
		JLabel filler2 = new JLabel ("");
		dir1.add (reset);
		dir1.add (push);
		dir1.add (pop);
		dir1.add (shuffle);
		dir1.add (next);
		dir1.add (info);
		dir1.add (save);
		dir1.add (open);
		card3.add (dir1);
		card3.add (picture);
		//layout 2
		Panel p2 = new Panel (new GridLayout (2, 1));
		p2.add (count);
		p2.add (toString);
		card3.add (p2);
		//layout 3
		Panel dir = new Panel (new GridLayout (2, 2));
		JLabel filler3 = new JLabel ("");
		JLabel filler4 = new JLabel ("");
		dir.add (score1);
		dir.add (score2);
		dir.add (score3);
		dir.add (score4);
		card3.add (dir);
		p_card.add ("3", card3);
	}
	//game screen tour method
	public void Info() {
		JOptionPane.showMessageDialog (null, createImageIcon ("info.jpeg"), "Game screen tour!", JOptionPane.INFORMATION_MESSAGE);
	}
	//win screen
	public void screen4 ()
	{ //screen 4 is set up.
		card4 = new Panel ();
		card4.setBackground(new Color(122, 157, 101));
		//winscreen picture
		JLabel pic = new JLabel (createImageIcon("finish.jpeg"));
		card4.add (pic);
		//move on to next screen
		JButton next = new JButton ("DONE");
		next.setForeground (new Color(122, 157, 101));
		next.setPreferredSize (new Dimension (170, 50));
		next.setFont (new Font ("BUNGEE", Font.BOLD, 40));
		next.setActionCommand ("s5");
		next.addActionListener (this);
		card4.add (pic);
		card4.add (next);
		p_card.add ("4", card4);
	}
	//blank screen
	public void drawblank ()
	{
		picture.setIcon (createImageIcon ("base.jpeg"));
		toString.setText ("No cards currently showing.");
		count.setText ("Count: 00");
	}
	public void showSpeedywords (Speedywords d)
	{
		picture.setIcon (createImageIcon (d.getPicName() +".jpeg"));
		toString.setText (d.toString ());
		count.setText ("Count: " + num);
		//show the letter and show word
	}

	public void actionPerformed (ActionEvent e)
	{
		if (e.getActionCommand ().equals ("reset"))
		{
			//set num to 0
			num = 0;
			//clear box
			box.clear ();
			//call drawblank
			drawblank ();
			a1 = 0;
			a2 = 0;
			a3 = 0;
			a4 = 0;
			score1.setText("Player 1: 000");			
			score2.setText("Player 2: 000");
			score3.setText("Player 3: 000");
			score4.setText("Player 4: 000");

		}
		else if (e.getActionCommand ().equals ("push"))
		{
			//make a new random donut
			Speedywords d =  new Speedywords ();
			//if the box isn't full
			if (!box.isFull ())
			{
				//Push d onto the box
				box.push (d);
				//add one to num
				num += 1;
				//Call showDonut, pass in d
				showSpeedywords (d);
			}
		}
		else if (e.getActionCommand ().equals ("pop"))
		{
			//if the box isn't empty
			if (!box.isEmpty ())
			{ //pop a donut from the box, save it
				Speedywords d = box.pop ();
				//subtract one from num
				num += -1;
				//call showDonut, pass in d
				showSpeedywords (d);
			}
			else
			{
				//set num to 0
				num = 0;
				//at the bottom, call drawblank
				drawblank ();
			}
		}
		else if (e.getActionCommand ().equals ("shuffle"))
		{
			//clear box
			box.clear ();
			//call shuffle
			box.shuffle ();
			//set num to size of the box
			num = box.size ();
			//pop a donut, store it in a variable
			Speedywords d = box.pop ();
			//call showDonut, pass in the variable
			showSpeedywords (d);
		}
		//updates scores
		else if (e.getActionCommand ().equals ("score1"))
		{
			a1++;
			score1.setText("Player 1: " + a1);
		}
		else if (e.getActionCommand ().equals ("score2"))
		{
			a2++;
			score2.setText("Player 2: " + a2);
		}
		else if (e.getActionCommand ().equals ("score3"))
		{
			a3++;
			score3.setText("Player 3: " + a3);
		}
		else if (e.getActionCommand ().equals ("score4"))
		{
			a4++;
			score4.setText("Player 4: " + a4);
		}
		if (e.getActionCommand ().equals ("s1")) {
			cdLayout.show (p_card, "1");}
		else if (e.getActionCommand ().equals ("s2")) {
			cdLayout.show (p_card, "2");}
		else if (e.getActionCommand ().equals ("s3")) {
			JOptionPane.showMessageDialog (null, "Press on info to learn how to navigate through the game screen!", "Time to Play!", JOptionPane.ERROR_MESSAGE);
			cdLayout.show (p_card, "3");}
		else if (e.getActionCommand ().equals ("s4")) {
			cdLayout.show (p_card, "4");}
		else if (e.getActionCommand ().equals ("s5")) {
			System.exit (0);}
		else if (e.getActionCommand ().equals ("Close")) {
			System.exit (0);}
		else if (e.getActionCommand ().equals ("save"))
			printOut ();
		else if (e.getActionCommand ().equals ("open"))
			readIn ();
		else if (e.getActionCommand ().equals ("Info"))
			Info ();
	}
	protected static ImageIcon createImageIcon (String path)
	{
		java.net.URL imgURL = DasadiaSoniyaSpeedywords.class.getResource (path);
		if (imgURL != null)
			return new ImageIcon (imgURL);
		else
			return null;
	}

	//save progress
	public static void main (String[] args)
	{
		JFrame.setDefaultLookAndFeelDecorated (true);
		//Create and set up the window.
		JFrame frame = new JFrame ("DasadiaSoniyaSpeedywords");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		//Create and set up the content pane.
		JComponent newContentPane = new DasadiaSoniyaSpeedywords ();
		newContentPane.setOpaque (true);
		frame.setContentPane (newContentPane);
		frame.setSize (420, 710);
		frame.setVisible (true);
		Date now = new Date ();
		DateFormat df = DateFormat.getDateInstance ();
		String s = df.format (now);
		System.out.println ("Today is " + s);
	}
	//open saved progress 
	public void printOut () {
		PrintWriter out;
		try {
			out = new PrintWriter (new FileWriter ("speedywords.txt"));

			out.println(a1);
			out.println(a2);
			out.println(a3);
			out.println(a4);

			out.close ();
		}
		catch (IOException e) {
			System.out.println ("Error opening file " + e);
		}
	}
	public void readIn () {
		BufferedReader in;
		try {
			in = new BufferedReader (new FileReader ("speedywords.txt"));
			a1 = Integer.parseInt( in.readLine ());
			a2 = Integer.parseInt( in.readLine ());
			a3 = Integer.parseInt( in.readLine ());
			a4 = Integer.parseInt( in.readLine ());
			score1.setText("Player 1: " + a1);
			score2.setText("Player 2: " + a2);
			score3.setText("Player 3: " + a3);
			score4.setText("Player 4: " + a4);
			in.close ();
		}
		catch (IOException e) {
			System.out.println ("Error opening file " + e);
		}
	}
}