package thread;

public class InvalidInputException extends RuntimeException {
    private  final String message;


    public InvalidInputException(String message) {
        super();
        this.message = message;
    }
    public  String getMessage(){
        return  message;
    }
}
