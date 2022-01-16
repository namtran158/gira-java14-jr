package cybersoft.javabackend.girajava14jr.user.service;

import cybersoft.javabackend.girajava14jr.user.dto.CreateUserDTO;
import cybersoft.javabackend.girajava14jr.user.model.User;

public interface UserService {
	User getUserById(long id);

	CreateUserDTO create(CreateUserDTO dto);
}
