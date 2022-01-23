package cybersoft.javabackend.girajava14jr.common.exception;

import javax.persistence.EntityNotFoundException;

public class GiraEntityNotFoundException extends EntityNotFoundException {
	public GiraEntityNotFoundException(String message) {
		super(message);
	}
}
