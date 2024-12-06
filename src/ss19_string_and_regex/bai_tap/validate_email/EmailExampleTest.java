package ss19_string_and_regex.bai_tap.validate_email;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"dung22112003@gmail.com", "ab@yahoo.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail."};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for(String email : validEmail){
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid " + isValid);
        }
        for(String email : invalidEmail){
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid " + isValid);
        }
    }
}
