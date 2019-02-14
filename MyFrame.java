import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener{

	Draw drawing;
	Hero player;

	public MyFrame(){
		this.drawing = new Draw();
		this.player = new Hero();
	}

	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_UP){
			drawing.moveUp();
			System.out.println("pos: " + drawing.x + ", " + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			drawing.moveRight();
			System.out.println("pos: " + drawing.x + ", " + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			drawing.moveDown();
			System.out.println("pos: " + drawing.x + ", " + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			drawing.moveLeft();
			System.out.println("pos: " + drawing.x + ", " + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_A){
			drawing.attack1();
			System.out.println("attack1");
		}
		else if(e.getKeyCode() == KeyEvent.VK_W){
			drawing.attack2();
			System.out.println("attack2");
		}
		else if(e.getKeyCode() == KeyEvent.VK_D){
			drawing.attack3();
			System.out.println("attack3");
		}
		else if(e.getKeyCode() == KeyEvent.VK_S){
			drawing.slide();
			System.out.println("slide");
		}
	}

	public void keyReleased(KeyEvent e){

	}

	public void keyTyped(KeyEvent e){
		
	}

	public static void main(String args[]){
		MyFrame gameFrame = new MyFrame();
		gameFrame.setSize(600,600);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
		gameFrame.getContentPane().add(gameFrame.drawing);
		gameFrame.getContentPane().add(gameFrame.player);
		gameFrame.addKeyListener(gameFrame);
		System.out.println("practical programming");
	}
}