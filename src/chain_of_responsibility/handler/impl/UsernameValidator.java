package chain_of_responsibility.handler.impl;

import chain_of_responsibility.User;
import chain_of_responsibility.handler.Validator;

public class UsernameValidator extends Validator {
    @Override
    protected boolean validateUser(User user) {
        if (user.getUsername() == null || user.getUsername().trim().isEmpty()) {
            System.out.println("Validation Failed: Username cannot be empty");
            return false;
        }
        System.out.println("Username validation passed");
        return true;
    }
}
