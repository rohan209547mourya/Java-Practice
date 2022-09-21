package question2;
import java.util.Objects;

public class Song {
	
	
	
	private String movieName;
	private String songName;
	
	
	public Song() {
		
		
	}
	
	public Song(String movie , String song) {
		
		super();
		this.movieName = movie;
		this.songName = song;
	}
	
	
	
	public void play() {
		
		System.out.println(this.songName + " of " + this.movieName + " is playing... !");
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(this.movieName , this.songName);
	}
	
	@Override
	public boolean equals(Object obj) {
		Song s1 = (Song)obj;
		
		return this.movieName.equals(s1.movieName) && this.songName.equals(s1.songName);
	}
	
}
