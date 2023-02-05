package orderprocessor.email;

public class EmailProcessor {
    public void sendEmail(String email, String content) {
        System.out.printf("[EMAIL PROCESSOR] Sent message \"%s\" to the email %s\n", content, email);
    }
}
