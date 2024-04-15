package telran.exceptions;

@SuppressWarnings("serial")
public class AccountNotFoundException extends NotFoundException {

	public AccountNotFoundException(String email) {
		super(String.format("Account %s not found", email));
	}

}
