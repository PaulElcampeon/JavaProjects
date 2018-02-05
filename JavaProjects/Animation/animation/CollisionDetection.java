package animation;

	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;
	import javax.swing.JFrame;
	import javax.swing.JPanel;

	public class CollisionDetection extends JPanel implements KeyListener{

		
		private int ballX = 10;
		private int ballY = 10;
		private final int  frameWidth = 500; 
		private final int frameHeight = 300;
		private final int borderWidth = 10;
		
		public CollisionDetection() {
			
			super.addKeyListener(this);
			super.setFocusable(true);

		}
		
		public void paintComponent(Graphics g) {
			//Making sure to set JPanel opaque true
			super.paintComponent(g);
			
			//Background 
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, 500, 300);
			
			//Ball
			g.setColor(Color.YELLOW);
			g.fillOval(ballX, ballY, 30, 30);
			
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
			
			
		}
		
		
		@Override
		public void keyPressed(KeyEvent keyE) {

			//Pressing the UP key
			if(keyE.getKeyCode() == KeyEvent.VK_UP) {
				moveUp();
			}
			
			//Pressing the DOWN key
			if(keyE.getKeyCode() == KeyEvent.VK_DOWN) {
				moveDown();
			}
			
			//Pressing the LEFT key
			if(keyE.getKeyCode() == KeyEvent.VK_LEFT) {
				moveLeft();
			}
			
			//Pressing the RIGHT key
			if(keyE.getKeyCode() == KeyEvent.VK_RIGHT) {
				moveRight();
			}
			
			//Press Escape key and the window will exit
			if(keyE.getKeyCode() == KeyEvent.VK_ESCAPE) {
				System.exit(0);
			}

			//Calling repaint because coordinates of ball have changed 
			repaint();

		}

		public void moveLeft() {
			if(ballX == 10) {
				ballX = ballX;
			}
			else {
				ballX -= 5;
			}
		}
		
		public void moveRight() {
			if(ballX+30 == frameWidth-30) {
				ballX = ballX;
			}
			else {
			ballX += 5;
			}
		}
		
		public void moveUp() {
			if(ballY == 10) {
				ballY = ballY;
			}
			else {
			ballY -= 5;
			}
		}
		
		public void moveDown() {
			if(ballY+30 == frameHeight-60) {
				ballY = ballY;
			}
			else {
			ballY += 5;
			}
		}
		
		@Override
		public void keyReleased(KeyEvent e) {}

		@Override
		public void keyTyped(KeyEvent e) {}
		
		
		public static void main(String[] args) {
			
			Thread thread = new Thread(new Runnable() {
					
					public void run() {
				CollisionDetection obj = new CollisionDetection();
				JFrame frame = new JFrame();
				frame.add(obj);
				frame.setTitle("Game");
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