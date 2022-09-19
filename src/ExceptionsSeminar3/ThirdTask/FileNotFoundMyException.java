package ExceptionsSeminar3.ThirdTask;

public class FileNotFoundMyException extends RuntimeException{
    @Override
    public String getMessage() {
        return "File not found, maybe the rwong way or file does not exist";
    }
}
