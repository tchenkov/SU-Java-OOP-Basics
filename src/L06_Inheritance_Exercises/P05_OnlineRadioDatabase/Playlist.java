package L06_Inheritance_Exercises.P05_OnlineRadioDatabase;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;
    
    public Playlist(int size) {
        this.songs = new ArrayList<>(size);
    }
    
    void addSong(Song song){
        this.songs.add(song);
    }
    
    private String getPlaylistLengthString() {
        int length = this.songs.size() == 0 ? 0 :
                this.songs.stream()
                .mapToInt(Song::getLength)
                .sum();
        int seconds = length % 60;
        length = (length - seconds) / 60;
        int minutes = length % 60;
        int hours = (length - minutes) / 60;
    
        return String.format("%dh %dm %ds", hours, minutes, seconds);
    }
    
    @Override
    public String toString() {
        final StringBuilder output = new StringBuilder();
        output.append("Songs added: ");
        output.append(this.songs.size());
        output.append(System.lineSeparator());
        
        output.append("Playlist length: ");
        output.append(this.getPlaylistLengthString());
        return output.toString();
    }
}
