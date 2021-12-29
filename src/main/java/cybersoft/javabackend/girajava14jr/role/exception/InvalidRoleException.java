package cybersoft.javabackend.girajava14jr.role.exception;

public class InvalidRoleException extends RuntimeException {
	
	public InvalidRoleException() {
		super();
	}
	
	public InvalidRoleException(String message) {
		super(message);
	}
	
	public InvalidRoleException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
