package L06_Inheritance_Exercises.P05_OnlineRadioDatabase.SongExeptions;

public class InvalidSongSecondsException extends InvalidSongLengthException {
    public InvalidSongSecondsException(String s) {
        super(s);
    }
}
