package userInterface;

import import_export.PathFinder;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * A class of object that makes the frame that a Cards Against Humanity game is run in.
 * @author Holt Maki
 * @since CAH1.0
 * @version CAH1.0
 *
 */
public class CAH_Frame extends JFrame{
	
	private static final long serialVersionUID = -3033860031108235857L;

	/**
	 * Creates a new frame in which a cards against of humanity game is shown in.
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	public CAH_Frame() throws IOException, URISyntaxException
	{
		super("Cards Against Humanity");
		PathFinder a = new PathFinder();
		setDefaultLookAndFeelDecorated(true);
		setIconImage(new ImageIcon(a.getCAH_Path("/Cards Against Humanity/src/CAH_GraphicsFiles/CAHIcon.png")).getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setMinimumSize(new Dimension(800,600));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
	
	public static void main(String [] args) throws URISyntaxException, IOException
	{
		PathFinder a = new PathFinder();
		CAH_Frame b = new CAH_Frame();
	}

}
