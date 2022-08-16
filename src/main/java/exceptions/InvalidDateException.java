package exceptions;

public class InvalidDateException extends RuntimeException {
    public InvalidDateException(String errormessage) {

        super(errormessage);
    }
}
