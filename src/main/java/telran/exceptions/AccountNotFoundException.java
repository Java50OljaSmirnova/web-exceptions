package telran.exceptions;

import telran.messages.ExceptionMessages;

@SuppressWarnings("serial")
public class AccountNotFoundException extends NotFoundException {

	public AccountNotFoundException(String message) {
		super(ExceptionMessages.ACCOUNT_NOT_FOUND);
	}

}
