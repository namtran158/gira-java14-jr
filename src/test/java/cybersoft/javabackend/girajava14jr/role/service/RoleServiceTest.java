package cybersoft.javabackend.girajava14jr.role.service;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import cybersoft.javabackend.girajava14jr.role.dto.RoleDTO;

@SpringBootTest
@Transactional
public class RoleServiceTest {
	
	@Autowired
	private RoleService service;
	
	@BeforeAll
	public void setupTest() {
		RoleDTO dto = RoleDTO.builder()
							.code("TST")
							.name("TESTROLE")
							.description("TEST DESCRIPTION")
							.build();
		RoleDTO result = service.create(dto);
	}
	@Test
	public void shouldLoadRoleServiceNormally() {
		assertNotEquals(service, null);
	}
	
	@Test
	public void shouldFoundDtos() {
		List<RoleDTO> dtos = service.findAllDTO();
		
		assertNotEquals(dtos.size(), 0);
	}
}
