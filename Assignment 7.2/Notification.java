// Notification.java
public class Notification {
    public final void sendNotification(String message) {
        System.out.println("Sending a notification: " + message);
    }
}

// EmailNotification.java
public class EmailNotification extends Notification {
    // Attempting to override the final method (results in a compilation error)
    // Uncommenting the following code will result in an error
    /*
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending an email: " + message);
    }
    */
}

// Main.java
public class Main {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();

        // Calling the sendNotification() method on the EmailNotification object
        emailNotification.sendNotification("Important message"); // Output: Sending a notification: Important message
    }
}
