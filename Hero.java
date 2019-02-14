import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Hero{
	
	public int x = 30;
	public int y = 30;

	public int state = 0;

	public BufferedImage image;
	public URL resource = getClass().getResource("run0.png");

	public Hero(){
		try{
			image = ImageIO.read(resource);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public Hero(int xHPass, int yHPass){
		x = xHPass;
		y = yHPass;

		try{
			image = ImageIO.read(resource);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}