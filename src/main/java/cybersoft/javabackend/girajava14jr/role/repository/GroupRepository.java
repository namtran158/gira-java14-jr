package cybersoft.javabackend.girajava14jr.role.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cybersoft.javabackend.girajava14jr.role.model.GroupRole;

public interface GroupRepository extends JpaRepository<GroupRole, Long> {
	
	Optional<GroupRole> findByName(String groupName);

	Optional<GroupRole> findByCode(String groupCode);
}
