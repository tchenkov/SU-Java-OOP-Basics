package L06_Inheritance_Exercises.P05_OnlineRadioDatabase;

import L06_Inheritance_Exercises.P05_OnlineRadioDatabase.SongExeptions.ExceptionMessages;
import L06_Inheritance_Exercises.P05_OnlineRadioDatabase.SongExeptions.InvalidSongException;
import L06_Inheritance_Exercises.P05_OnlineRadioDatabase.SongExeptions.InvalidSongLengthException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int playListSize = Integer.parseInt(br.readLine());
        
        Playlist playlist = new Playlist(playListSize);
        
        for (int i = 0; i < playListSize; i++) {
            String[] songInfo = br.readLine().split(";");
            String authorName = songInfo[0];
            String songName = songInfo[1];
            int minutes;
            int seconds;
            try {
                try {
                    minutes = Integer.parseInt(songInfo[2].split(":")[0]);
                    seconds = Integer.parseInt(songInfo[2].split(":")[1]);
                }
                catch (NumberFormatException | IndexOutOfBoundsException e) {
                    throw new InvalidSongLengthException(ExceptionMessages.INVALID_SONG_LENGTH_EXCEPTION);
                }
                
                Song song = new Song(authorName, songName, minutes, seconds);
                playlist.addSong(song);
                System.out.println("Song added.");
            }
            catch (InvalidSongException ise) {
                System.out.println(ise.getMessage());
            }
        }
    
        System.out.println(playlist);
    }
}
