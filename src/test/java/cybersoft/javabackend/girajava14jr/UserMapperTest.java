package cybersoft.javabackend.girajava14jr;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import cybersoft.javabackend.girajava14jr.user.dto.CreateUserDTO;
import cybersoft.javabackend.girajava14jr.user.dto.UserMapper;
import cybersoft.javabackend.girajava14jr.user.model.User;

@SpringBootTest
public class UserMapperTest {
	
	@Test
	public void shouldMapCreateUserDtoToUserEntity() {
		CreateUserDTO dto = new CreateUserDTO();
		dto.setUsername("user123");
		dto.setEmail("example@example.com");
		dto.setFullname("MrExample");
		dto.setPassword("P123456");
		
		User user = UserMapper.INSTANCE.createUserDtoToUserEntity(dto);
		
		assertThat(user.getUsername()).isEqualTo(dto.getUsername());
		assertThat(user.getEmail()).isEqualTo(dto.getEmail());
		assertThat(user.getPassword()).isEqualTo(dto.getPassword());
		assertThat(user.getFullname()).isEqualTo(dto.getFullname());
		
	}
	
	@Test
	public void shouldMapUserEntityToCreateUserDTO() {
		User user = new User();
		user.setUsername("user123");
		user.setEmail("example@example.com");
		user.setPassword("P123456");
		user.setFullname("MrExample");
		
		CreateUserDTO dto = UserMapper.INSTANCE.userEntityToCreateUserDTO(user);
		
		assertThat(dto.getUsername()).isEqualTo(user.getUsername());
		assertThat(user.getPassword()).isEqualTo(dto.getPassword());
		assertThat(user.getEmail()).isEqualTo(dto.getEmail());
		assertThat(user.getFullname()).isEqualTo(dto.getFullname());
		
	}
}
