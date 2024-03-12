package skypro.coursework2.coursework2;

public class NotFountQuestionsException extends RuntimeException {
    public NotFountQuestionsException() {
    }

    public NotFountQuestionsException(String message) {
        super(message);
    }

    public NotFountQuestionsException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFountQuestionsException(Throwable cause) {
        super(cause);
    }

    public NotFountQuestionsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
