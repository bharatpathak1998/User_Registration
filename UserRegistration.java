import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public void userEmailId(String emailId) {

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$");
        Matcher matcher = pattern.matcher(emailId);

        if (matcher.find()) {
            System.out.println("Valid -> " + emailId);
        } else {
            System.out.println("Invalid -> " + emailId);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Valid Email Id : ");
        String isValidEmailId = sc.nextLine();

        UserRegistration userRegistration = new UserRegistration();
        userRegistration.userEmailId(isValidEmailId);
    }
}