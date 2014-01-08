package netplay;

import java.io.*;
import java.net.*;

/**
 * A class of object that represents a Cards Against Humanity Server.
 * @author Holt Maki
 * @since CAH1.0
 * @version CAH1.0
 * <dt></dt>
 * <b>Extends:</b> <dl> {@linkplain Thread} </dl>
 */
public class CAH_Server extends Thread {
	private static int port = 2000;
	private ServerSocket serverSocket;
	
	/**
	 * Creates an object that represents a Cards Against Humanity Server
	 * @since CAH1.0
	 * @version CAH1.0
	 */
	public CAH_Server()
	{		
		boolean socketCreated = false;
		
		while(!socketCreated)
		{
			
			port++;
			
			try
			{
				serverSocket = new ServerSocket(port);
			}
			
			catch(IOException e)
			{
				
			}
			
		}
	}
	
	public void run()
	{
		while(true)
		{
			try
			{
				Socket server = serverSocket.accept();
				
				DataInputStream in = new DataInputStream(server.getInputStream());
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				
				ObjectInputStream objIn = new ObjectInputStream(server.getInputStream());
				ObjectOutputStream objOut = new ObjectOutputStream(server.getOutputStream());
				
				//FIXME The input and output stream need to actually do stuff.	
			}
			
			catch(SocketTimeoutException t)
			{
				
			}
			
			catch(IOException e)
			{
				
			}
		}
	}
}
