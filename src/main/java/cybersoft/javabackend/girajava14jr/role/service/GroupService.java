package cybersoft.javabackend.girajava14jr.role.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import cybersoft.javabackend.girajava14jr.role.dto.GroupDTO;
import cybersoft.javabackend.girajava14jr.role.dto.GroupProjection;
import cybersoft.javabackend.girajava14jr.role.model.GroupRole;

public interface GroupService {
	List<GroupDTO> findAll();

	GroupDTO create(GroupDTO dto);

	Optional<GroupRole> findByName(String roleName);

	Optional<GroupRole> findByCode(String roleCode);

	void deleteRole(UUID id);

	void addUser(UUID groupId, UUID userId);

	void removeUser(UUID groupId, UUID userId);

	Set<GroupProjection> findAllDto();
}
