import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JFrame;


public class LoadScreen extends JFrame
{
	Image logo;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 196991606721642137L;

	public LoadScreen()
	{
		try
		{
			logo = ImageIO.read(new URL("http://i.imgur.com/oeLKY3p.jpg"));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		this.setSize(logo.getWidth(null), logo.getHeight(null));
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setUndecorated(true);
		
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		
		this.setSize(logo.getWidth(this), logo.getHeight(this));
		g.drawImage(logo, 0, 0, logo.getWidth(null), logo.getHeight(null), null);
	}
}
