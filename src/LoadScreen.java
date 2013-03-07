import java.awt.Frame;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JDialog;


public class LoadScreen extends JDialog
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 196991606721642137L;

	public LoadScreen()
	{
		Image logo = null;
		
		try
		{
			File logoFile = new File("C:\\Users\\Stefan\\Desktop\\logo.png");

			logo = ImageIO.read(logoFile);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		this.setSize(logo.getWidth(null), logo.getHeight(null));
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
		
		this.getGraphics().drawImage(logo, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}
