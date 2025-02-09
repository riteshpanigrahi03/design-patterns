package chain_of_responsibility.handler;

import chain_of_responsibility.User;

public abstract class Validator {
    protected Validator nextValidator;

    public void setNextValidator(Validator validator) {
        this.nextValidator = validator;
    }

    public boolean validate(User user) {
        if (!validateUser(user)) {
            return false;
        }

        if (nextValidator!=null) {
            this.nextValidator.validate(user);
        }
        return true;
    }

    protected abstract boolean validateUser(User user);
}
