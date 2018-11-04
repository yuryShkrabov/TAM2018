package object_model.exceptions;

/**
 * The exception is thrown if user enters valid interval of numbers but the query does not satisfy search (e.g. get vehicles by price range: startPrice=100, endPrice=300)
 */
public class ItemsNotFoundException extends Exception {
    public ItemsNotFoundException(String message) {
        super(message);
    }
}
