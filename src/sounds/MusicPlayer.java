package sounds;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import javax.print.attribute.standard.Media;

/**
 * A class of object that plays music.
 * @author Holt Maki
 * @since CAH1.0
 * @version CAH1.0
 */
public class MusicPlayer implements Runnable 
{
	//TODO use sliders for music and sound effects volume.
	private Map<String, SongInfo> allSongs;
	private Map<String, SongInfo> selectedSongs;
	
	/**
	 * Creates a new object that plays music.
	 * This music constructor is blank because it simply initializes the TreeMap.
	 * Songs are added after the creation of the object if this constructor is used.
	 * @since CAH1.0
	 * @version CAH1.0
	 * @see {@linkplain #MusicPlayer(TreeMap)} for a constructor that 
	 */
	public MusicPlayer()
	{
		allSongs = new TreeMap<String, SongInfo>();
		//TODO: initialize Map with the songs file location 
	}
	
	public MusicPlayer(TreeMap<String, SongInfo> songmap)
	{
		allSongs = songmap;
	}
	
	/**
	 * Adds a song to the MusicPlayer
	 * @param pathname
	 * @param info
	 */
	protected void addSong(String pathname, SongInfo info)
	{
		allSongs.put(pathname, info);
	}
	
	//TODO: Maybe make a song selecter class
	
	private void playSongs()
	{
		
	}
	
	@Override
	public void run() {
		while(true)
		{
			
		}
		// TODO Auto-generated method stub
		
	}
	

}
