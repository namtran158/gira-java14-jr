package cybersoft.javabackend.girajava14jr.user.service;

import java.util.UUID;

import cybersoft.javabackend.girajava14jr.user.dto.CreateUserDTO;
import cybersoft.javabackend.girajava14jr.user.model.User;

public interface UserService {
	User getUserById(UUID id);

	CreateUserDTO create(CreateUserDTO dto);
}
