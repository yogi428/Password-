import java.util.regex.*;

public class PasswordChecker {
    public static void main(String[] args) {
        String password = "YourPasswordHere"; // Replace with the actual password

        int result = isValidPassword(password);
        System.out.println(result);
    }

    public static int isValidPassword(String password) {
        // Rule 1: Minimum 8 characters
        if (password.length() < 8) {
            return 0;
        }

        // Rule 2: Contains at least one uppercase, one lowercase, one special character, and one digit
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        // Rule 3: Should not contain whitespace
        if (matcher.find() && !password.contains(" ")) {
            return 1;
        } else {
            return 0;
        }
    }
}
