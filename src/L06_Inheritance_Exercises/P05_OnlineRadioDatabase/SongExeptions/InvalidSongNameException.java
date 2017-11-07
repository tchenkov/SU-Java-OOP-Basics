package L06_Inheritance_Exercises.P05_OnlineRadioDatabase.SongExeptions;

public class InvalidSongNameException extends InvalidSongException{
    public InvalidSongNameException(String s) {
        super(s);
    }
}
