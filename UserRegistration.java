import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public void userMobileFormat(String phoneNumber) {

        Pattern pattern = Pattern.compile("^[0-9]{0,2} [0-9]{10}");
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.find()) {
            System.out.println("Valid -> " + phoneNumber);
        } else {
            System.out.println("Invalid -> " + phoneNumber);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Valid Phone Number : ");
        String isValidPhoneNumber = sc.nextLine();

        UserRegistration userRegistration = new UserRegistration();
        userRegistration.userMobileFormat(isValidPhoneNumber);
    }
}