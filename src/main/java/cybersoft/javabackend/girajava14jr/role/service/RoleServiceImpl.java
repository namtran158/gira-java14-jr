package cybersoft.javabackend.girajava14jr.role.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cybersoft.javabackend.girajava14jr.role.dto.RoleDTO;
import cybersoft.javabackend.girajava14jr.role.model.Role;
import cybersoft.javabackend.girajava14jr.role.repository.RoleRepository;
import cybersoft.javabackend.girajava14jr.role.util.RoleConverter;

@Service
public class RoleServiceImpl implements RoleService {

	private RoleRepository repository;

	public RoleServiceImpl(RoleRepository roleRepository) {
		this.repository = roleRepository;
	}
	
	@Override
	public List<RoleDTO> findAllDTO() {
		List<Role> roles = repository.findAll();
		
		return RoleConverter.toRoleDTOs(roles);
	}

	@Override
	public RoleDTO create(RoleDTO dto) {
		Role role = RoleConverter.toRole(dto);
		
		Role createdRole = repository.save(role); 
		return RoleConverter.toRoleDTO(createdRole);
	}

}
