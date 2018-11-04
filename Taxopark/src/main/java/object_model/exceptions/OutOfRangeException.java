package object_model.exceptions;

/**
 * The exception is thrown if user enters incorrect interval of numbers (e.g. get vehicles by price range: startPrice > endPrice)
 */
public class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}
