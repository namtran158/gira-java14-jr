package cybersoft.javabackend.girajava14jr.role.service;

import java.util.List;
import java.util.Optional;

import cybersoft.javabackend.girajava14jr.role.dto.GroupDTO;
import cybersoft.javabackend.girajava14jr.role.model.GroupRole;

public interface GroupService {
	List<GroupDTO> findAll();

	GroupDTO create(GroupDTO dto);

	Optional<GroupRole> findByName(String roleName);

	Optional<GroupRole> findByCode(String roleCode);

	void deleteGroupRole(long id);

	void addUser(long groupId, long userId);

	void removeUser(long groupId, long userId);
}
