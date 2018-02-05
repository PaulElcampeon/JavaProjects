package animation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TrappedInABox extends JPanel implements KeyListener, ActionListener{
 
	private boolean play = false;
	private int ballXpos = 200;
	private int ballYpos = 150;
	private int ballXdir = -5;
	private int ballYdir = -5;
	private final int  frameWidth = 500; 
	private final int frameHeight = 300;
	private final int borderWidth = 10;
	private final int delay = 30;
	private Timer timer;

	
	public TrappedInABox() {
		
		super.addKeyListener(this);
		super.setFocusable(true);
		timer = new Timer(delay, this);
		timer.start();

	}
	
	public void paintComponent(Graphics g) {
		//Making sure to set JPanel opaque true
		super.paintComponent(g);
		
		//Background 
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500, 300);
		
		//Ball
		g.setColor(Color.YELLOW);
		g.fillOval(ballXpos, ballYpos, 20, 20);
		
		//Borders
		g.setColor(Color.ORANGE);
		//Top
		g.fillRect(0, 0, frameWidth, borderWidth);
		//Bottom
		g.fillRect(0, frameHeight-57, frameWidth, borderWidth);
		//Left
		g.fillRect(0, 0, borderWidth, frameHeight);
		//Right
		g.fillRect(frameWidth-28, 0, borderWidth, frameHeight);
		
		if(play == false) {
			g.setColor(Color.WHITE);
			g.setFont(new Font("Tahoma",Font.BOLD,28));
			g.drawString("Press Enter to start Animation", 30, 100);
			g.drawString("Press Escape to Quit", 90, 140);

		}
		
	}
	

	@Override
	public void actionPerformed(ActionEvent actionE) {
		if(play == true) {
		
			/*If ball hits the left or right border make the x increment negative
			 * so it will go in the opposite direction*/
			if(ballXpos == 10 || ballXpos+20 == frameWidth-30) {
				ballXdir = -ballXdir;
				}
			
			/*If ball hits the top or bottom border make the y increment negative
			 * so it will go in the opposite direction*/
			if(ballYpos == 10 || ballYpos+20 == frameHeight-60) {
				ballYdir = -ballYdir;
			}
			
			ballXpos += ballXdir;
			ballYpos += ballYdir;
			
			
		repaint();
		}
	}

	
	
	@Override
	public void keyPressed(KeyEvent keyE) {
	
		if(keyE.getKeyCode() == KeyEvent.VK_ENTER) {	
			play = true;
			ballYdir = -ballYdir;
			ballXdir = -ballXdir;
		}
		
		
		//Press Escape key and the window will exit
		if(keyE.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
	}
	
	
	
	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}
	
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
				
				public void run() {
					TrappedInABox obj = new TrappedInABox();
			JFrame frame = new JFrame();
			frame.add(obj);
			frame.setTitle("Animation Trapped In a Box");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(500, 300);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			}
		}
	);
		thread.start();
		}

}