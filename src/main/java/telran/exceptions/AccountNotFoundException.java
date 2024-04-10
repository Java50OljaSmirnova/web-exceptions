package telran.exceptions;

import telran.messages.ExceptionMessages;

@SuppressWarnings("serial")
public class AccountNotFoundException extends NotFoundException {

	public AccountNotFoundException() {
		super(ExceptionMessages.ACCOUNT_NOT_FOUND);
	}

}
