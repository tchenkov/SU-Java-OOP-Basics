package L06_Inheritance_Exercises.P05_OnlineRadioDatabase.SongExeptions;

public class InvalidArtistNameException extends InvalidSongException {
    public InvalidArtistNameException(String s) {
        super(s);
    }
}
