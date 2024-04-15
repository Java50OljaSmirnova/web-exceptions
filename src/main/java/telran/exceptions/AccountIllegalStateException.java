package telran.exceptions;

@SuppressWarnings("serial")
public class AccountIllegalStateException extends IllegalStateException {
	public AccountIllegalStateException(String email) {
		super(String.format("account %s already exists", email));
	}
}
