public class ValidationStatus {
boolean successful;
String message;
public ValidationStatus(boolean successful, String message) {
    this.successful = successful;
    this.message = message;

    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getMessage() {
        return message;
    }
}
