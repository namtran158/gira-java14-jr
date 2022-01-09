package cybersoft.javabackend.girajava14jr.user.dto;

import org.mapstruct.factory.Mappers;

import cybersoft.javabackend.girajava14jr.user.model.User;

public interface UserMapper {
	
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	User createUserDtoToUserEntity(CreateUserDTO dto);
	
	CreateUserDTO userEntityToCreateUserDTO(User entity);
}
