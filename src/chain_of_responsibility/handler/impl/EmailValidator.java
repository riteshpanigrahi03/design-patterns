package chain_of_responsibility.handler.impl;

import chain_of_responsibility.User;
import chain_of_responsibility.handler.Validator;

public class EmailValidator extends Validator {
    @Override
    protected boolean validateUser(User user) {
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            System.out.println("Validation Failed: Email is invalid");
            return false;
        }
        System.out.println("Email validation passed");
        return true;
    }
}
