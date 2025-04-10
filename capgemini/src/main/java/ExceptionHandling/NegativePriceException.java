package ExceptionHandling;

public class NegativePriceException extends RuntimeException{
    public NegativePriceException() {
        super("Negative Price Exception");
    }
}
