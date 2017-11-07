package L06_Inheritance_Exercises.P05_OnlineRadioDatabase.SongExeptions;

public class InvalidSongException extends IllegalArgumentException {
    public InvalidSongException(String s) {
        super(s);
    }
}
