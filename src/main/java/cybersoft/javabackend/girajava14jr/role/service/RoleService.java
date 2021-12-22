package cybersoft.javabackend.girajava14jr.role.service;

import java.util.List;

import cybersoft.javabackend.girajava14jr.role.dto.RoleDTO;

public interface RoleService {

	List<RoleDTO> findAllDTO();

	RoleDTO create(RoleDTO dto);

}
