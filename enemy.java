import java.util.*;
import java.awt.*;
public interface enemy {
	public int getX();
	public int getY();
	public int getSize();
	public void takeDamage();
	public int getHP();
	public int getMaxHealth();
	public int getLevel();
	public ArrayList<missile> getMissiles();
	public void move();
	public Image getImage();
	public void takePartDamage();
	public int getHealth();
}
