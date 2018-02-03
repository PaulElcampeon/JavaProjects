package pong;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JPanel implements KeyListener, ActionListener  {
	
	
	private boolean play = false;
	private int ballXpos = 250;
	private int ballYpos = 250;
	private int ballXdir = -1;
	private int ballYdir = -2;
	private int play1YPos = 250;
	private int play2YPos = 250;
	private int score1 = 0;
	private int score2 = 0;
	private int delay = 8;
	private Timer timer;
	
	public Game() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
		timer.start();
	
	}
	
	
	public void paint(Graphics g) {
		
		//background
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 700, 500);
		
		//borders top and bottom
		g.setColor(Color.ORANGE);
		g.fillRect(0, 0, 700, 10);
		g.fillRect(0, 454, 700, 10);


		//paddles player 1 and player 2
		g.setColor(Color.WHITE);
		g.fillRect(15, play1YPos, 20, 100);
		g.fillRect(665, play2YPos, 20, 100);
		
		//ball
		g.setColor(Color.RED);
		g.fillOval(ballXpos, ballYpos, 20, 20);
		
		//scores
		g.setColor(Color.WHITE);
		g.setFont(new Font("Serif", 1 , 30));
		g.drawString(Integer.toString(score1)+"  :  "+ Integer.toString(score2), 320, 40);
		
		
		if(score1 == 1 || score2 == 5) {
			g.setColor(Color.cyan);
			g.setFont(new Font("Serif", 1 , 30));
			if(score1 == 5) {
			
			g.drawString("Congratulations Player 1 Press Enter to Reset", 60, 200);
			}
			
			else 
			{
				g.drawString("Congratulations Player 2 Press Enter to Reset", 60, 200);
			}
			
			play = false;
			
		}
		g.dispose();
	
	}

	
	public void actionPerformed(ActionEvent arg0) {
		timer.start();
		if(play == true) {
			
			if(new Rectangle(15, play1YPos, 20, 100).intersects(new Rectangle(ballXpos, ballYpos, 20, 20)) || 
					new Rectangle(665, play2YPos, 20, 100).intersects(new Rectangle(ballXpos, ballYpos, 20, 20))){
				ballXdir = -ballXdir;
			}
			
			ballXpos += ballXdir;
			ballYpos += ballYdir;
			
			if(ballYpos < 10 || ballYpos > 440) {
				ballYdir = -ballYdir;
			}
			
			if(ballXpos <=0) {
				play = false;
				score1++;					
				}
			
			if(ballXpos >= 700) {
				play = false;
				score2++;
				}
			
			if(play ==  false) {
				ballXpos = 250;
				ballYpos = 250;
			
			}
		
		}
		
		
		repaint();
	}


	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			if(play2YPos < 20) {
				play2YPos = 10;
			}else {
			moveUp2();
			}	
		}
		
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			if(play2YPos + 100 > 442) {
				play2YPos = 350;
			}else {
				moveDown2();
			}
		}
		
		if(e.getKeyCode()==KeyEvent.VK_W) {
			if(play1YPos < 20) {
				play1YPos = 10;
			}else {
			moveUp();
			}	
		}
		
		if(e.getKeyCode() == KeyEvent.VK_S) {
			if(play1YPos + 100 > 442) {
				play1YPos = 350;
			}else {
				moveDown();
			}
		}
		
		if((play == false) && (e.getKeyCode()==KeyEvent.VK_ENTER)) {
			play = true;
			ballXpos = 250;
			ballYpos = 250; 
			ballYdir = -ballYdir;
			ballXdir = -ballXdir;
			score1 = 0;
			score2 = 0;
		}
	}
	
	public void moveUp() {
		play = true;
		//remember coordinates are other way round
		play1YPos-=20;
	}
	
	public void moveDown() {
		play = true;
		play1YPos+=20;
	}
	
	public void moveUp2() {
		play = true;
		//remember coordinates are other way round
		play2YPos-=20;
	}
	
	public void moveDown2() {
		play = true;
		play2YPos+=20;
	}


	@Override
	public void keyTyped(KeyEvent e) {}


	@Override
	public void keyReleased(KeyEvent e) {}
	
}

