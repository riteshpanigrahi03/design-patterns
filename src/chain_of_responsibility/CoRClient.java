package chain_of_responsibility;

import chain_of_responsibility.handler.Validator;
import chain_of_responsibility.handler.impl.EmailValidator;
import chain_of_responsibility.handler.impl.PasswordValidator;
import chain_of_responsibility.handler.impl.UsernameValidator;

public class CoRClient {
    public static void main(String[] args) {
        Validator usernameValidator = new UsernameValidator();
        Validator passwordValidator = new PasswordValidator();
        Validator emailValidator = new EmailValidator();

        //setting up chain of handlers
        usernameValidator.setNextValidator(passwordValidator);
        passwordValidator.setNextValidator(emailValidator);

        //Valid user validation
        User validUser = new User("JohnDoe", "secret123", "john@example.com");
        System.out.println("Validating valid user: " + validUser.toString());
        boolean isValid = usernameValidator.validate(validUser);
        System.out.println("User is valid: " + isValid);

        System.out.println("\n-----------------------------\n");

        //Invalid user validation - invalid password
        User invalidUser = new User("John Doe", "123", "johnexample.com");
        System.out.println("Validating invalid user: " + invalidUser.toString());
        isValid = usernameValidator.validate(invalidUser);
        System.out.println("User is valid: " + isValid);
    }
}
