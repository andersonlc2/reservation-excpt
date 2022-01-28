package model.exceptions;

public class DomainException extends RuntimeException {
    private final static long SerialVersionUID = 1L;

    public DomainException (String msg) {
        super(msg);
    }
}
