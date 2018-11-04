package object_model.exceptions;

/**
 * The exception is thrown if user tries to delete not existing vehicle from taxopark (e.g. taxopark is created, user tries to delete newly created vehicle which is not added to taxopark)
 */
public class ConditionsNotMeetExpectationsException extends Exception {
    public ConditionsNotMeetExpectationsException(String message) {
        super(message);
    }
}
