package question2;
import java.util.List;
import java.util.ArrayList;


public class PlayList {

	
	public List<Song> songs = new ArrayList<>();
	
	
	public void addSong(Song song) {
		
		if(checkDuplicate(song)) {
			
			System.out.println("Song is already added in the playlist");
			return;
		}
		
		songs.add(song);
		
		System.out.println("Song added to the playlist successfully!");
	}
	
	public boolean checkDuplicate(Song song) {
		
		for(Song el : this.songs) {
			
			if(el.equals(song)) {
				
				return true;
			}
		}
			
		return false;
	}
}


