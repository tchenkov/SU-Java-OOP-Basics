package L06_Inheritance_Exercises.P05_OnlineRadioDatabase.SongExeptions;

public class InvalidSongLengthException extends InvalidSongException {
    public InvalidSongLengthException(String s) {
        super(s);
    }
}
