package chain_of_responsibility.handler.impl;

import chain_of_responsibility.User;
import chain_of_responsibility.handler.Validator;

public class PasswordValidator extends Validator {
    @Override
    protected boolean validateUser(User user) {
        if (user.getPassword() == null || user.getPassword().length() < 6) {
            System.out.println("Validation Failed: Password must be at least 6 characters long");
            return false;
        }
        System.out.println("Password validation passed");
        return true;
    }
}
