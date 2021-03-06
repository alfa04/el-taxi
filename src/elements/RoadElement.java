package elements;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RoadElement extends Element {
	private static Image img;
	
	static {
		try {
			img = ImageIO.read(new File("res/img/road.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected Image getImg() {
		return img;
	}
	
	@Override
	public boolean canHaveElementOnTop() {
		return true;
	}
	
	@Override
	public boolean canBeTraveled() {
		return true;
	}
	
	public RoadElement(int x, int y) {
		super(x, y);
	}
}
