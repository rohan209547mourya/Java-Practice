package question2;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		PlayList newPlayList = new PlayList();
		
		for(int i = 0; i < 4; i++) {
			
			System.out.println("Enter movie name: ");
			String movieName = sc.nextLine();
			
			
			System.out.println("Enter song name: ");
			String songName = sc.nextLine();

			System.out.println("========================");
			
			newPlayList.addSong(new Song(movieName, songName));
			
			System.out.println("========================");
		}
		
		sc.close();
		
		for(Song el : newPlayList.songs) {
			
			el.play();
		}
	}
}
