package L06_Inheritance_Exercises.P05_OnlineRadioDatabase;

import L06_Inheritance_Exercises.P05_OnlineRadioDatabase.SongExeptions.*;

public class Song {
    private static final int ARTIST_NAME_MIN_LENGTH = 3;
    private static final int ARTIST_NAME_MAX_LENGTH = 20;
    private static final int SONG_NAME_MIN_LENGTH = 3;
    private static final int SONG_NAME_MAX_LENGTH = 30;
    private static final int SONG_MIN_LENGTH_MINUTES = 0;
    private static final int SONG_MAX_LENGTH_MINUTES = 14;
    private static final int SONG_MIN_LENGTH_SECONDS = 0;
    private static final int SONG_MAX_LENGTH_SECONDS = 59;
    //private static final int SONG_MAX_OVERALL_LENGTH_SECONDS = SONG_MAX_LENGTH_MINUTES * 60 + SONG_MAX_LENGTH_SECONDS;
    
    private String artistName;
    private String songName;
    private int lengthMinutes;
    private int lengthSeconds;
    private int length;
    
    
    public Song(String artistName, String songName, int lengthMinutes, int lengthSeconds) {
        setArtistName(artistName);
        setSongName(songName);
        setLengthMinutes(lengthMinutes);
        setLengthSeconds(lengthSeconds);
        setLength(lengthMinutes, lengthSeconds);
    }
    
    private void setArtistName(String artistName) {
        if (artistName.length() < ARTIST_NAME_MIN_LENGTH || ARTIST_NAME_MAX_LENGTH < artistName.length()) {
            throw new InvalidArtistNameException(ExceptionMessages.INVALID_ARTIST_NAME_EXCEPTION);
        }
        this.artistName = artistName;
    }
    
    private void setSongName(String songName) {
        if (songName.length() < SONG_NAME_MIN_LENGTH || SONG_NAME_MAX_LENGTH < songName.length()) {
            throw new InvalidArtistNameException(ExceptionMessages.INVALID_SONG_NAME_EXCEPTION);
        }
        this.songName = songName;
    }
    
    private void setLengthMinutes(int lengthMinutes) {
        if (lengthMinutes < SONG_MIN_LENGTH_MINUTES || SONG_MAX_LENGTH_MINUTES < lengthMinutes) {
            throw new InvalidSongMinutesException(ExceptionMessages.INVALID_SONG_MINUTES_EXCEPTION);
        }
        this.lengthMinutes = lengthMinutes;
    }
    
    private void setLengthSeconds(int lengthSeconds) {
        if (lengthSeconds < SONG_MIN_LENGTH_SECONDS || SONG_MAX_LENGTH_SECONDS < lengthSeconds) {
            throw new InvalidSongMinutesException(ExceptionMessages.INVALID_SONG_SECONDS_EXCEPTION);
        }
        this.lengthSeconds = lengthSeconds;
    }
    
    private void setLength(int lengthMinutes, int lengthSeconds) {
        this.length = lengthMinutes * 60 + lengthSeconds;
    }
    
    public int getLength() {
        return length;
    }
}
